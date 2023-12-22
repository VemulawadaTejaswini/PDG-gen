import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      long x = sc.nextLong();
      
      long a = 100;
      long count = 0;
      
      while (a < x) {
         a = a + a * 1 / 100;
         count++;
      }
      
      System.out.println(count);
   }
}