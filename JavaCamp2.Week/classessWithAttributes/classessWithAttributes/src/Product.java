public class Product {
    public Product(int id, String name, String description,double price,int stockAmont,String renk){
        System.out.println("Yapıcı Blok Çalıştı");
        this.id= id;
        this.renk=renk;
        this.name= name;
        this.price=price;
        this.description=description;
        this.stockAmont=stockAmont;
    }
    public Product(){

    }
    //attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmont;
    private String renk;
    private String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmont() {
        return stockAmont;
    }

    public void setStockAmont(int stockAmont) {
        this.stockAmont = stockAmont;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+ id;
    }


}
