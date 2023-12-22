// ITP1_10_C Standard_Deviation
import java.io.*;

class Main {
   public static void main(String[] args) {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
         double sum = 0;
         double sumi = 0;
         double ave = 0;
         double alpha;
         int n;
         // ???????????°(n)???0??????,??????.
         while ((n = Integer.parseInt(br.readLine())) != 0) {

            // ??????
            String[] input = br.readLine().split(" ");
            double[] s = new double[n];

            int i;
            for (i = 0; i < n; i++) {
               s[i] = Integer.parseInt(input[i]);
               sum += s[i];
            }

            // ??????
            ave = sum / n;

            for (i = 0; i < n; i++) {
               sumi += Math.pow(s[i] - ave, 2);
            }

            // ?¨??????????
            alpha = Math.sqrt(sumi / n);

            System.out.println(alpha);
         }
      }

      catch (Exception e) {
         e.printStackTrace();
      }
   }
}