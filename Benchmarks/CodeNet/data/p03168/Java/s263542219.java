import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(reader.readLine());
        double[] heads = new double[N+1];
        double[] tails = new double[N+1];
        String[] lo =reader.readLine().split(" ");
        for (int i = 1; i <=N ; i++) {
            double p = Double.parseDouble(lo[i-1]);
            heads[i] = p;
            tails[i] = 1.0-p;
        }
        double[][] dp = new double[N+1][N+1];
        dp[0][0] = 1.0;
        for (int i = 1; i <=N ; i++) {
            for (int j = 0; j <=i ; j++) {
                if(j-1>=0) dp[i][j] = heads[i]*dp[i-1][j-1]+tails[i]*dp[i-1][j];
                else dp[i][j] = tails[i]*dp[i-1][j];
            }
        }
        //System.out.println(Arrays.deepToString(dp));
        double res= 0.000000000;
        for (int i = N; i > (N/2); i--) {
            res=res+dp[N][i];
        }
        System.out.println(res);
    }
}
