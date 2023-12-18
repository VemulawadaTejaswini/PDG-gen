import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int T = str.length();
        long mod = (long) Math.pow(10, 9) + 7;

        // dp[i][j]: 0からi-1まで, j個の文字を選んでいるときの, 残りの部分に対する処理の個数

        long[][] dp = new long[T + 1][4];

        dp[T][3] = 1;

        for (int i = T - 1; i >= 0; i--) {
            char c = str.charAt(i);

            // j == 3
            if (c == '?') {
                dp[i][3] = 3 * dp[i+1][3];
            } else {
                dp[i][3] = dp[i+1][3];
            }

            dp[i][3] %= mod;

            // j < 3
            for (int j = 0; j <= 2; j++) {
                if (c == '?') {
                    dp[i][j] = 3 * dp[i+1][j] + dp[i+1][j+1];
                } else if ((c == 'A' && j == 0) || (c == 'B' && j == 1) || (c == 'C' && j == 2)) {
                    dp[i][j] = dp[i+1][j] + dp[i+1][j+1];
                } else {
                    dp[i][j] = dp[i+1][j];
                }

                dp[i][j] %= mod;
            }
        }

        System.out.println(dp[0][0]);
    }
}