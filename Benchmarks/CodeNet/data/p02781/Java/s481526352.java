import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int m = sc.nextInt();
        char[] c = str.toCharArray();
        
        // dp[n][m][0] + dp[n][m][1] = n桁までで非0がm個ある数の個数
        int[][][] dp = new int[n+1][m+1][2];
        dp[0][0][0] = 1;
        for (int i = 0; i < n; i++) {
            int d = c[i] - '0';
            
            if (d == 0) {
                for (int j = 0; j < m; j++) {
                    dp[i+1][j+1][0] = dp[i][j+1][0];
                }
            } else {
                for (int j = 0; j < m; j++) {
                    dp[i+1][j+1][0] = dp[i][j][0];
                }
            }
            
            if (d > 0) {
                if (i < m+1) dp[i+1][i][1] += dp[i][i][0];
                if (i+1 < m+1) dp[i+1][i+1][1] += dp[i][i][0] * d-1;
            }
            
            for (int j = 0; j <= m; j++) {
                dp[i+1][j][1] += dp[i][j][1];
                
                if (j+1 < m+1) {
                    dp[i+1][j+1][1] += dp[i][j][1] * 9;
                }
            }
            
        }
        
        System.out.println(dp[n][m][0] + dp[n][m][1]);
    }
}