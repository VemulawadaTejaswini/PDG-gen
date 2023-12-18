import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

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
        int[][] n = new int[N][3];
        for (int i = 0; i < N; i++) {
            n[i][0] = Integer.parseInt(scanner.next());
            n[i][1] = Integer.parseInt(scanner.next());
            n[i][2] = Integer.parseInt(scanner.next());
        }
        int[][] dp = new int[N + 1][4];
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (j != k)
                        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][k] + n[i][j - 1]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i < 4; i++) {
            max = Math.max(max, dp[N][i]);
        }

        System.out.println(max);
    }

}

