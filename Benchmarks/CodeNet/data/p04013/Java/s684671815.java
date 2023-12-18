import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++) x[i] = sc.nextInt();
        int[][][] dp = new int[n+1][n+1][50*n +1];
        dp[0][0][0] = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int b = x[i-1];
            sum += b;
            for(int j = 0; j <= i; j++){
                for(int k = 0; k <= sum; k++){
                if(k < b || j == 0) dp[i][j][k] = dp[i-1][j][k];
                else dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k-b];
                }
            }
        }
        long ans = 0L;
        for(int i = 1; i <= n; i++) ans += (long)dp[n][i][i*a];
        System.out.println(ans);
        sc.close();
    }
}
