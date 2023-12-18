import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] p = new double[n];
        for(int i = 0; i < n; i++){
            p[i] = scanner.nextDouble();
        }
        double[][] dp = new double[n+1][n+1];
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++){
            dp[i][0] = (1 - p[i-1]) * dp[i-1][0];
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = p[i-1] * dp[i-1][j-1] + (1 - p[i-1]) * dp[i-1][j];
            }
        }
        double ans = 0;
        for(int i = n / 2 + 1; i <= n; i++){
            ans += dp[n][i];
        }
        System.out.println(ans);
    }
}
