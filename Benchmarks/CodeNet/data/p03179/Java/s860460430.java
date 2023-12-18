import java.util.Scanner;

public class Main {

    static long mod = 1000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        long[][] dp = new long[n + 1][n + 1];
        dp[1][1] = 1;
        long[][] pref = new long[n + 1][n + 1];
        pref[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            char cc = s.charAt(i - 2);
            for (int a = 1; a <= i; a++) {
                if (cc == '<') {
                    dp[i][a] = (dp[i][a] + pref[i - 1][a - 1]) % mod;
                    pref[i][a] = (pref[i][a - 1] + dp[i][a]) % mod;
                } else {
                    dp[i][a] = (dp[i][a] + pref[i - 1][i - 1]) % mod;
                    dp[i][a] = (dp[i][a] - pref[i - 1][a - 1]) % mod;
                    pref[i][a] = (pref[i][a - 1] + dp[i][a]) % mod;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = (ans + dp[n][i]) % mod;
            if (ans < 0) {
                ans += mod;
            }
        }
        System.out.println(ans);
    }
}