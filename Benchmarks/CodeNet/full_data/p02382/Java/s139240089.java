// ITP1_10_D Distance2
import java.io.*;

public class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try{
         int n = Integer.parseInt(br.readLine());
         int[] x = new int[n];
         int[] y = new int[n];
         String strx[] = br.readLine().split(" ");
         for (int i = 0; i < n ;i++)
            x[i] = Integer.parseInt(strx[i]);

         String stry[] = br.readLine().split(" ");
         for (int i = 0; i < n; i++)
            y[i] = Integer.parseInt(stry[i]);

         Minkowski(n, x, y);
      }

      catch (Exception e) {
         e.printStackTrace();
      }
   }

   private static void Minkowski(int n, int[] x, int[] y) {
      double D1 = 0;
      double D2 = 0;
      double D3 = 0;
      double Dmax = 0;

      for (int i = 0; i < n; i++) {
         D1 += Math.abs(x[i] - y[i]);
         D2 += Math.pow(Math.abs(x[i] - y[i]), 2);
         D3 += Math.pow(Math.abs(x[i] - y[i]), 3);
         if (Dmax < Math.abs(x[i] - y[i]))
            Dmax = Math.abs(x[i] - y[i]);
      }

      System.out.println(D1);
      System.out.println(Math.sqrt(D2));
      System.out.println(Math.cbrt(D3));
      System.out.println(Dmax);
   }
}