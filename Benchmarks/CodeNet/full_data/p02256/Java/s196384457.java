import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] input = sc.nextLine().split(" ");
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);
      
      System.out.println(gcd(a,b));
   }
   
   
   public static int gcd(int a, int b) {
      if (a % b == 0) {
         return b;
      } else {
         return gcd(b, a % b);
      }
   }
}
