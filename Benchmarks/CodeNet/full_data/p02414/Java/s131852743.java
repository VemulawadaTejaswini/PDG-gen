// ITP1_7_D Matrix Multiplication
import java.io.*;

public class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String strAry0[] = br.readLine().split(" ");
         int n = Integer.parseInt(strAry0[0]);
         int m = Integer.parseInt(strAry0[1]);
         int l = Integer.parseInt(strAry0[2]);
         int[][] A = new int[n][m];
         int[][] B = new int[m][l];
         int[][] C = new int[n][l];

         for (int i = 0; i < A.length; i++) {
            String strAry1[] = br.readLine().split(" ");
            for (int j = 0; j < A[i].length; j++) {
               A[i][j] = Integer.parseInt(strAry1[j]);
            }
         }

         for (int i = 0; i < B.length; i++) {
            String strAry2[] = br.readLine().split(" ");
            for (int j = 0; j < B[i].length; j++) {
               B[i][j] = Integer.parseInt(strAry2[j]);
            }
         }

         for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
               for (int k = 0; k < m; k++) {
                  C[i][j] += A[i][k] * B[k][j];
               }
            }
         }

         for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
               System.out.print(j < C[i].length - 1 ? C[i][j] + " ": C[i][j] + "\n");
            }
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}