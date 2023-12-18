import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     hour  = scan.nextInt();
      int     money = scan.nextInt();
      

      if(hour - money > 0){
         System.out.println(hour - money);
         }
      else{
          System.out.println(0);
          }
   }
}
