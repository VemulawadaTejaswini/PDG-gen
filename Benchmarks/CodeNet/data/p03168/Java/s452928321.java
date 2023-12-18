import java.util.*;
import java.io.*;

class Main {

   

    // static final Reader in = new Reader();
    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out);
    static int N, W;
    static final long MOD = 1000000007;
    static char[][] a;
    static double[][] dp;
    static double[] p;
    static double[] pre;


    static double P() {
        
        for(int i = 0;i < N;i++)
            dp[i][0] = 1;

        for(int i = 0;i < N;i++)
            dp[i][i+1] = pre[i];   
        

            for(int i = 1;i < N;i++){
                for(int k = 1;k < i+1;k++){
                    double consider = dp[i - 1][ k - 1];
                    double ignore = dp[i - 1][k];

                    dp[i][k] = (consider * p[i]) + (ignore * (1 - p[i]));
                }   
            }
        
        
        return dp[N - 1][N / 2 + 1];

    }

    public static void main(String[] args) throws Exception {
        N = in.nextInt();
        p = new double[N];
        pre = new double[N];
        dp = new double[N+1][N+1];

        
        p[0] = in.nextDouble();
        pre[0] = p[0];
        Arrays.fill(dp[0], 0);
        for (int i = 1; i < N; i++) {
            p[i] = in.nextDouble();
            pre[i] = pre[i - 1] * p[i];
            Arrays.fill(dp[i], 0);
        }

        System.out.println(P());

        out.close();

    }

}
