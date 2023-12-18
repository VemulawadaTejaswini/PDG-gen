import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(reader.readLine());
        String s = reader.readLine();

        long[][] dp = new long[count][count];
        dp[0][0] = 1;
        long modulo = 1_000_000_007;

        for (int i = 1; i < count; ++i) {
            if (s.charAt(i - 1) == '<') {
                dp[i][0] = 0;
                for (int j = 1; j <= i; ++j) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                    dp[i][j] %= modulo;
                }
            } else {
                dp[i][i] = 0;
                for (int j = i - 1; j >= 0; --j) {
                    dp[i][j] = dp[i][j + 1] + dp[i - 1][j];
                    dp[i][j] %= modulo;
                }
            }
        }

        long res = 0;
        for (int i = 0; i < count; ++i) {
            res += dp[count - 1][i];
            res %= modulo;
        }
        System.out.println(res);
    }
}
