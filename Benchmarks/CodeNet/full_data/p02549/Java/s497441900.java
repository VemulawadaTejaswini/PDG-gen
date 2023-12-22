import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        final int mod = 998244353;
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final int[][] data = new int[k][2];
        for (int i = 0; i < k; i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt() + 1;
        }
        final long[] dp = new long[n];
        dp[0] = 1;
        dp[1] = -1;
        for (int i = 0; i < n; i++) {
            if (i != 0) { 
                dp[i] = (dp[i] + dp[i - 1]) % mod;
            }
            for (int j = 0; j < k; j++) {
                final int l = data[j][0] + i;
                final int r = data[j][1] + i;
                if (l < n) { 
                    dp[l] = (dp[l] + dp[i]) % mod;
                }
                if (r < n) { 
                    dp[r] = (dp[r] - dp[i] + mod) % mod;
                }
            }
        }
        System.out.println(dp[n - 1]);
    }
}
