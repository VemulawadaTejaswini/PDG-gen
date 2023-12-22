
import java.util.Scanner;

public class Main {

    static long mod = 998244353;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int s = Integer.parseInt(scan.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        long[][] dp = new long[n][s + 1];
        dp[0][0] = 2;
        if (a[0] <= s) {
            dp[0][a[0]] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= s; j++) {
                dp[i][j] += dp[i - 1][j] * 2;
                dp[i][j] %= mod;

                if (j - a[i] >= 0) {
                    dp[i][j] += dp[i - 1][j - a[i]];
                    dp[i][j] %= mod;
                }
            }
        }

        System.out.println(dp[n - 1][s]);
    }

}
