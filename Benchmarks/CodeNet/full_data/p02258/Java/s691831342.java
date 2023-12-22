// ALDS1_1_D Maximum Profit
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         int n = Integer.parseInt(br.readLine());
         int[] R = new int[n];
         for (int i = 0; i < n; i++) {
            R[i] = Integer.parseInt(br.readLine());
         }
         System.out.println(max(R, n));
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static int max(int[] R, int n) {
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < n - 1; i++) {
         for (int j = i + 1; j < n; j++) {
            if (max < R[j] - R[i]) {
               max = R[j] - R[i];
            }
         }
      }
      return max;
   }
}