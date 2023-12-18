import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        String s = scanner.next();
        int[][] dp = new int[N][N];
        int ans = 0;
        for (int i = N - 1; i >= 0; i--) {
            char ci = s.charAt(i);
            for (int j = N - 1; j >= 0; j--) {
                if (i == j) continue;
                char cj = s.charAt(j);
                if (ci == cj) {
                    if (i == N - 1 || j == N - 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(dp[i + 1][j + 1] + 1, Math.abs(i - j));
                    }
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }

        System.out.println(ans);
    }
}

