import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int INF = (int) 1e9 + 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        solve(scanner, writer);
        scanner.close();
        writer.close();
    }

    public static void solve(Scanner scanner, PrintWriter writer) {
        int n = scanner.nextInt();

        double[] p = new double[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextDouble();
        }

        double[] dp = new double[n + 1];
        dp[0] = 1;

        for (int coin = 1; coin <= n; coin++) {
            dp[coin] = dp[coin - 1] * p[coin - 1];
            for (int j = coin - 1; j >= 0; j--) {
                dp[j] = (j - 1 < 0 ? 0 : dp[j - 1] * p[coin - 1]) + dp[j] * (1 - p[coin - 1]);
            }
        }

        //writer.println(Arrays.toString(dp));

        double ans = 0;
        for (int i = n / 2 + 1; i <= n; i++) {
            ans += dp[i];
        }

        writer.println(ans);
    }
}
