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
        int w = scanner.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }

        int maxSum = 0;
        for (int x : values) {
            maxSum += x;
        }

        // dp[i] denote minimum total weights when values exactly i
        long[] dp = new long[maxSum + 1];
        Arrays.fill(dp, (long) Math.pow(10, 18) + 5);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = maxSum; j >= 0; j--) {
                if (j - values[i] >= 0) {
                    dp[j] = Math.min(dp[j], dp[j - values[i]] + weights[i]);
                }
            }
        }

        long ans = 0;
        for (int i = 0; i <= maxSum; i++) {
            if (dp[i] <= w) {
                ans = Math.max(ans, i);
            }
        }

        writer.println(Arrays.toString(dp));

        writer.println(ans);
    }
}
