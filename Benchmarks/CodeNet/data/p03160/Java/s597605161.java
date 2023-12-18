import java.io.PrintWriter;
import java.util.Scanner;

public class JavaClasses {
    private static final int INF = (int) 1e9 + 5;

    private static void solve(Scanner scanner, PrintWriter writer) {
        int n = scanner.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
        }


        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(stones[i] - stones[i - 1]), (i - 2 < 0) ? Integer.MAX_VALUE : dp[i - 2] + Math.abs(stones[i] - stones[i - 2]));
        }

        writer.println(dp[n - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        solve(scanner, writer);
        scanner.close();
        writer.close();
    }
}
