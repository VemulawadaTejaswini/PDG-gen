// ALDS1_1_C Prime Numbers
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         int cnt = 0;
         int n = Integer.parseInt(br.readLine());
         int[] x = new int[n];
         for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(br.readLine());
         }
         for (int i = 0; i < n; i++) {
            if (isPrime(x[i])) cnt++;
         }
         System.out.println(cnt);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static boolean isPrime(int x) {
      if (x == 2) return true;
      if (x < 2 || x % 2 == 0) return false;
      int i = 3;
      while (i <= Math.sqrt(x)) {
         if (x % i == 0) return false;
         i = i + 2;
      }
      return true;
   }
}