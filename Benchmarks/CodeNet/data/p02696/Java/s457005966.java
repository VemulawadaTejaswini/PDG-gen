import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      long a = sc.nextLong();
      long b = sc.nextLong();
      long n = sc.nextLong();
      
      long max = 0;
      long y = 0;
      for (long i = n; i >= n/100*99; i=i-1) {
         y = (long)Math.floor(a*i)/b - a*(long)Math.floor(i/b);
         
         if (max < y) {
            max = y;
         }   
         if (max == n) {
            break;
         }   
      }
      
      System.out.println(max);
   }
}
