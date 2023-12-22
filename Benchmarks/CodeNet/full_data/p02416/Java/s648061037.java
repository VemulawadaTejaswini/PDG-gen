// ITP1_8_B Sum of Numbers
import java.io.*;

class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         long x = Long.parseLong(br.readLine());
         while (x != 0) {
            long sum = 0;

            while (x != 0) {
               sum += x % 10;
               x /= 10;
            }

            System.out.println(sum);
            x = Long.parseLong(br.readLine());
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}