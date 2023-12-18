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
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(scanner.next());
        }
        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            if (i + 1 < N)
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(h[i + 1] - h[i]));
            if (i + 2 < N)
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(h[i + 2] - h[i]));
        }

        System.out.println(dp[N - 1]);
    }

}

