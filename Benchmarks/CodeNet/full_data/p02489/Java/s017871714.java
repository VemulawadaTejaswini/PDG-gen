public class Main {
    public static void main(String[] args) {
      int i=0;
        for(;;){
          i++;
          int x = new java.util.Random().nextInt(15);
          if(x == 0){
            System.out.println("Case" + " " + i + ":" + " " + x);
            break;
          }else{
            System.out.println("Case" + " " + i + ":" + " " + x);
          }
        }
    }
}