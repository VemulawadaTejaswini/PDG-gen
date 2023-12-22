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
         System.out.println(max(R));
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static int max(int[] R) {
      int max = 0;
      for (int i = 0; i < R.length - 1; i++) {
         for (int j = i + 1; j < R.length; j++) {
            if (max < R[j] - R[i]) {
               max = R[j] - R[i];
            }
         }
      }
      return max;
   }
}