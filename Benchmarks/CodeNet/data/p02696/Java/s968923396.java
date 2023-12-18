import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      long a = sc.nextLong();
      long b = sc.nextLong();
      long n = sc.nextLong();
      
      long max = 0;
      long y = 0;
      for (long i = 1; i <= n; i++) {
         y = a*i/b - a*(i/b);
         
         if (max < y) {
            max = y;
         }      
      }
      
      System.out.println(max);
   }
}
