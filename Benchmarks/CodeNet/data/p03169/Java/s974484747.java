import java.util.*;
import java.text.*;

public class Main {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] a = new int[n];
      int[] c = new int[4];
      double[][][] DP = new double[1+n][1+n][1+n];
      for(int i = 0; i< DP.length; i++)
        for(int j = 0; j< DP[i].length; j++)
            for(int k = 0; k< DP[i][j].length; k++)
                DP[i][j][k] = -1;
      for(int i = 0; i< n; i++)c[in.nextInt()]++;
      System.out.println(new DecimalFormat("0.000000000").format(calc(DP, n, c[1], c[2], c[3])));
    }
    static double calc(double[][][] DP, int n, int c1, int c2, int c3){
        if(Math.min(c1, Math.min(c2, c3)) < 0)return 0;
        if(c1+c2+c3 == 0)return 0.0;
        if(DP[c1][c2][c3] > -0.5)return DP[c1][c2][c3];
        int c0 = n-c1-c2-c3;
        double p0 = c0*1.0/n, p1 = c1*1.0/n, p2 = c2*1.0/n, p3 = c3*1.0/n;
        DP[c1][c2][c3] = (1+p1*calc(DP, n, c1-1, c2, c3)+p2*calc(DP, n, c1+1, c2-1, c3)+p3*calc(DP, n, c1, c2+1, c3-1))*1.0/(1-p0);
        return DP[c1][c2][c3];
    }
}