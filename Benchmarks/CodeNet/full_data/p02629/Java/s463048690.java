import java.util.*;
public class Main  {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long n = sc.nextLong();
      
      result(n);
      
   
   }
   
   public static void result(long n) {
      if (n <= 26) {
         print(n);
      } else if (n < 702) {
         print(n/26);
         print(n%26);
      } else if (n == 702) {
         System.out.print("zz");
      } else if (n < 18278) {
         result(n/26);
         print(n%26);
      } else if (n == 18278) {
         System.out.print("zzz");
      } else if (n < 475254) {
         result(n/26);
         print(n%26);
      } else if (n == 475254) {
         System.out.print("zzzz");
      } else {
         result(n/26);
         print(n%26);
      }
   }
   
   
   public static void print(long n) {
      int s = (int)n;
      char[] a = {'a', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      System.out.print(a[s]);
   }
}