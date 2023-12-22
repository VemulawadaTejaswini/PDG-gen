// ITP1_7_B How many ways?
import java.io.*;

public class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         while (true) {
            String strAry[] = br.readLine().split(" ");
            int n = Integer.parseInt(strAry[0]);
            int x = Integer.parseInt(strAry[1]);

            if ((n == 0 && x == 0) || (n < 3 || n > 100))
               break;

            System.out.println(combination(n, x));
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }

   private static int combination(int n, int x) {
      int count = 0;
      int a, b, c;
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j < i; j++) {
            for (int k = 1; k < j; k++) {
               if (i + j + k == x)
                  count++;
            }
         }
      }

      return count;
   }
}