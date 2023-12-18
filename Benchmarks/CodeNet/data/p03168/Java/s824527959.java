import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        BigDecimal[] p = new BigDecimal[n];

        for (int i = 0; i < n; i++) {
            p[i] = new BigDecimal(sc.next());
        }

        BigDecimal[][] dp = new BigDecimal[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = BigDecimal.ZERO;
            }
        }

        dp[0][0] = BigDecimal.ONE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                dp[i + 1][j] = dp[i + 1][j].add(dp[i][j].multiply(BigDecimal.ONE.subtract(p[i])));
                dp[i + 1][j + 1] = dp[i + 1][j + 1].add(dp[i][j].multiply(p[i]));
            }
        }

        BigDecimal result = BigDecimal.ZERO;
        for (int i = (n / 2) + 1; i <= n; i++) {
            result = result.add(dp[n][i]);
        }

        System.out.println(result.toPlainString());
    }
}
