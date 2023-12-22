import java.util.*;
public class Main  {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      
      result(n);
      
   
   }
   
   public static void result(int n) {
      if (n <= 26) {
         print(n);
      /*} else if (n == 702) {
         System.out.println("zz");*/
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
   
   
   public static void print(int n) {
      char[] a = {'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'z'};
      System.out.print(a[n]);
   }
}