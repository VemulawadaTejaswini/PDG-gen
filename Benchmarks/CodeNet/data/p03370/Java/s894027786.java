import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int x = sc.nextInt();

      int[] m = new int[n];
      for (int i = 0; i < m.length; i++) {
         m[i] = sc.nextInt();
      }

      Arrays.sort(m);

      for (int i = 0; i < m.length; i++) {
         x = x - m[i];
      }

      x = x / m[0];
      
      System.out.println(n + x);

   }
}