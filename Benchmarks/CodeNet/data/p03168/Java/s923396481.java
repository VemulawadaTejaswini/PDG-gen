import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        
        double[] p = new double[N];
        
        for(int i = 0; i < N; i++) {
            p[i] = Double.parseDouble(sc.next());
        }
        
        double[][] dp = new double[N+1][N+1]; //コインiまでにj回表
        
        dp[1][0] = 1 - p[0];
        dp[1][1] = p[0];
        
        for(int i = 2; i <= N; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0) {
                    dp[i][j] = dp[i-1][j] * (1 - p[i-1]);
                }else if(j < i) {
                    dp[i][j] = dp[i-1][j] * (1 - p[i-1]) + dp[i-1][j-1] * p[i-1];
                }else {
                    dp[i][j] = dp[i-1][j-1] * p[i-1];
                }
            }
        }
        
        double ans = 0;
        for(int j = (N+1) / 2; j <= N; j++) {
            ans += dp[N][j];
        }

        System.out.println(ans);
    }
}