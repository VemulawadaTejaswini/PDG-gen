import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int counter = 0;
      
      for(int i = 0; i < n; i ++) {
         int key = Integer.parseInt(sc.nextLine());
         if(isPrime(key)) {
            counter ++;
         }
      }
      
      System.out.println(counter);
   }
   
   public static boolean isPrime(int a) {
      if(a == 2) {
         return true;
      } else if(a == 1 || a % 2 == 0) {
         return false;
      } else {
         for(int i = 3; i <= (int)Math.sqrt(a); i += 2) {
            if(a % i == 0) {
               return false;
            }
         }
         return true;
      }
   }
   
}
