import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int[] a = new int[n];
      for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
      }

      int sum = 0;

      for (int i = 0; i < n - 1; i++) {
         sum = sum + Math.abs(a[i] - a[i + 1]);
      }
      sum = sum + Math.abs(a[0]) + Math.abs(a[n - 1]);

      System.out.println(sum - Math.abs(a[0]) - Math.abs(a[0] - a[1]) + Math.abs(a[1]));

      for (int i = 1; i < n - 1 ; i++) {
         int suma = sum - Math.abs(a[i] - a[i - 1]) - Math.abs(a[i] - a[i + 1]) + Math.abs(a[i - 1] - a[i + 1]);
         System.out.println(suma);
      }

      System.out.println(sum - Math.abs(a[n - 1]) - Math.abs(a[n - 1] - a[n - 2]) + Math.abs(a[n - 2]));

   }
}