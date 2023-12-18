import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan   = new Scanner(System.in);
      int     n      = scan.nextInt();
      String  yellow = "Y";

      String[] color = new String[n];
      for(int i = 0; i < n; i++){
          color[i] = scan.next();
          if(color[i].contains("Y")){
             System.out.println("Four");
             return;
             }
          }
      System.out.println("Three");
   }
}
