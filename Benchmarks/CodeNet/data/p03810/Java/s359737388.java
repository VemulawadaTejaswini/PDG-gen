public class Main {

    
    public static void main(String[] args) {
        Bevarage bvr= new DarkRoast();
        bvr= new Mocha(bvr);
         bvr= new Mocha(bvr);
          bvr= new Suger(bvr);
         System.out.println("total cost :  "+bvr.cost());
    }
    
}