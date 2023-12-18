import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      long    n    = scan.nextLong();
      long    m    = scan.nextLong();

      if(n >= 3 && m >= 3){
         System.out.println((n - 2) * (m - 2));
         }
      else if(n == 2 || m == 2){
              System.out.println(0);
              }
      else if(n == 1 && m == 1){
              System.out.println(1);
              }
      else{
          System.out.println((Math.max(n, m) - 2));
          }
   }
}
