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

         // ???????????°
         int n = Integer.parseInt(br.readLine());

         // ??????
         String[] input = br.readLine().split(" ");
         int[] s = new int[input.length];

         int i;
         for (i = 0; i < input.length; i++) {
            s[i] = Integer.parseInt(input[i]);
            sum += s[i];
         }

         // ??????
         ave = sum / i;

         for (i = 0; i < s.length; i++) {
            sumi += Math.pow(s[i] - ave, 2);
         }

         // ?¨??????????
         alpha = Math.sqrt(sumi / s.length);

         System.out.printf("%10.8f", alpha);
      }

      catch (Exception e) {
         e.printStackTrace();
      }
   }
}