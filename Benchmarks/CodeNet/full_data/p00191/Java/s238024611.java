import java.util.*;
import java.math.BigDecimal;

public class AOJ_0191{
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0){
                break;
            }
            double[][] g = new double[n][n];
            for(int i = 0; i < n; i++){
                for(int ii = 0; ii < n; ii++){
                    g[i][ii] = sc.nextDouble();
                }
            }

            double[][] dp = new double[m][n];
            Arrays.fill(dp[0], 1.);
            for(int i = 1; i < m; i++){
                for(int cur = 0; cur < n; cur++){
                    for(int pre = 0; pre < n; pre++){
                        dp[i][cur] = Math.max(dp[i][cur], dp[i-1][pre] * g[cur][pre]);
                    }
                }
            }
            /*
            for(double[] d: dp){
                System.out.println(Arrays.toString(d));
            }
            */
            double max = 0;
            for(double d: dp[m-1]){
                    max = Math.max(max, d);
            }
            System.out.println(new BigDecimal(max).setScale(2, BigDecimal.ROUND_HALF_UP));

        }
    }

    public static void main(String[] args){
        new AOJ_0191().run();
    }
}