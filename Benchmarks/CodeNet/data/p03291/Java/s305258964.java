
//20190820
//https://atcoder.jp/contests/abc104/tasks/abc104_d
import java.util.Scanner;

class Main {
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        long[][] dp = new long[len][4];

        // 初期化処理
        if (s.charAt(0) == 'A') {
            dp[0][0] = 1;
            dp[0][1] = 1;
        } else if (s.charAt(0) == '?') {
            dp[0][0] = 3;
            dp[0][1] = 1;
        } else {
            dp[0][0] = 1;
        }
        for (int i = 1; i < len; i++) {
            char c = s.charAt(i);
            for (int j = 0; j < 4; j++) {
                // コピーする
                dp[i][j] = dp[i - 1][j];
                dp[i][j] %= mod;
            }
            // 追加する
            if (c == 'A') {
                dp[i][1] += dp[i - 1][0];

            } else if (c == 'B') {
                dp[i][2] += dp[i - 1][1];

            } else if (c == 'C') {
                dp[i][3] += dp[i - 1][2];

            } else if (c == '?') {
                for (int k = 0; k < 4; k++) {
                    dp[i][k] *= 3;
                    dp[i][k] %= mod;
                }
                dp[i][1] += dp[i - 1][0];
                dp[i][2] += dp[i - 1][1];
                dp[i][3] += dp[i - 1][2];
            }
            for (int j = 0; j < 4; j++) {
                dp[i][j] %= mod;
            }
        }

        System.out.println(dp[len - 1][3]);
        sc.close();
    }
}
