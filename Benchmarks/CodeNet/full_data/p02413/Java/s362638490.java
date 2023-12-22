// ITP1_7_C
import java.io.*;

public class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String[] strAry0 = br.readLine().split(" ");
         int r = Integer.parseInt(strAry0[0]);
         int c = Integer.parseInt(strAry0[1]);
         int[][] s = new int[r + 1][c + 1];

         for (int i = 0; i < s.length -1; i++) {
            String[] strAry1 = br.readLine().split(" ");
            for (int j = 0; j < s[i].length -1; j++) {
               s[i][j] = Integer.parseInt(strAry1[j]);
            }
         }

         for (int i = 0; i < s.length -1; i++) {
            for (int j = 0; j < s[i].length - 1; j++) {
               s[i][s[i].length -1] += s[i][j];
               s[s.length - 1][j] += s[i][j];
            }
         }

         for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s[i].length - 1; j++) {
               s[s.length - 1][s[i].length - 1] += s[i][j];
            }
         }

         for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
               System.out.print(j == s[i].length - 1 ? s[i][j] : s[i][j] + " ");
            }
            System.out.println();
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}