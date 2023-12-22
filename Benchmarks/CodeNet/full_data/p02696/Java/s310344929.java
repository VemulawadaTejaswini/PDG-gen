import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double n = sc.nextDouble();
      
      double max = 0;
      double y = 0;
      for (long i = 1; i <= n; i++) {
         y = Math.floor(a*i)/b - a*Math.floor(i/b);
         
         if (max < y) {
            max = y;
         }      
      }
      
      System.out.println((int)max);
   }
}
