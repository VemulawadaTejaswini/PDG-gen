// ITP1_6_C OfficialHouse
import java.io.*;

public class Main {
   static int[][][] count = new int[4][3][10];
   static int b,f,r,v;

   public static void main(String[] args) {
      try  {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         for (int i = 0; i < n; i++) {
            String[] array = (br.readLine()).split(" ");
            b = Integer.parseInt(array[0]) - 1;
            f = Integer.parseInt(array[1]) - 1;
            r = Integer.parseInt(array[2]) - 1;
            v = Integer.parseInt(array[3]);

            count[b][f][r] += v;
         }

         for (int[][] building : count) {
            for (int[] floor : building) {
               for (int room : floor) {
                  System.out.print(" " + room);
               }
               System.out.println();
            }
            System.out.println("\n####################\n");
         }
      }

      catch (Exception e) {
         System.out.println(e);
      }
   }
}