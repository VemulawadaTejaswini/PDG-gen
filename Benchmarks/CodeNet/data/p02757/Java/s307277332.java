import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        String str = sc.next();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = str.charAt(i) - '0';
        }

        long[][] dp = new long[n][p];

        for (int j = 0; j < p; j++) {
            dp[0][j] = 0;
            if ((s[0] % p) == j) {
                dp[0][j] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < p; j++) {
                dp[i][(j * 10 + s[i]) % p] += dp[i - 1][j];
                if ((s[i] % p) == j) {
                    dp[i][j] += 1;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[i][0];
        }

        System.out.println(ans);
    }
}
