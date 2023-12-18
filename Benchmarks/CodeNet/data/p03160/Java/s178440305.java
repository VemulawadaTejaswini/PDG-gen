import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int INF = (int) 1e9 + 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        solve2(scanner, writer);
        scanner.close();
        writer.close();
    }

    public static void solve2(Scanner scanner, PrintWriter writer) {
        int n = scanner.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
        }

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (i+1 < n) {
                dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(stones[i+1] - stones[i]));
            }
            if (i+2 < n) {
                dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(stones[i+2] - stones[i]));
            }
        }

        writer.println(dp[n - 1]);
    }
}