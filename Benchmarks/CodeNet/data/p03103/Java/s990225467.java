import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] a = new int[n];
      int[] b = new int[n];
      for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
         b[i] = sc.nextInt();
      }

      long cost = 0;

      for (int i = 1; i < a.length; i++) {
         for (int j = 0; j < i; j++) {
            if (a[j] > a[i]) {
               int x = a[i];
               a[i] = a[j];
               a[j] = x;
               int y = b[i];
               b[i] = b[j];
               b[j] = y;
            }
         }
      }

      int sum = 0; 

      outer:
         for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < b[j]; i++){
               cost = cost + a[j];
               sum = sum + 1;
               if (sum > m) {
                  cost = cost - a[j];
                  break outer;
               }
            }
         }

      System.out.println(cost);

   }
}