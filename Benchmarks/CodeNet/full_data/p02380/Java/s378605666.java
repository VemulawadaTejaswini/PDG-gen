// ITP1_10_B Triangle
import java.io.*;

class Main {

   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         String[] input = br.readLine().split(" ");
         int a = Integer.parseInt(input[0]);
         int b = Integer.parseInt(input[1]);
         int C = Integer.parseInt(input[2]);
         double S, L, h;
         double c;

         S = a * b * Math.sin(C) / 2;
         c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(C));
         L = a + b + c;
         h = 2 * S / c;

         System.out.print(S + "\n" + L + "\n" + h);
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}