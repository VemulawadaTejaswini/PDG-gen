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
        int H = Integer.parseInt(scanner.next());
        int N = Integer.parseInt(scanner.next());
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
            B[i] = Integer.parseInt(scanner.next());
        }
        
        long dp[][] = new long[N + 1][100_000];
        for (long[] d: dp) {
            Arrays.fill(d, Long.MAX_VALUE / 2);
        }
        dp[0][0] = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 100_000; j++) {
                if (j - A[i - 1] >= 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - A[i - 1]] + B[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        long ans = Integer.MAX_VALUE;
        for (int i = H; i < 100_000; i++) {
            ans = Math.min(ans, dp[N][i]);
        }

        System.out.println(ans);
    }
}
