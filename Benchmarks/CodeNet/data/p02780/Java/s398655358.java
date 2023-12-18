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
        int n = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());
        double[] p = new double[n];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.next());
            p[i] = a * (a + 1) / 2.0 / a;
        }

        double[] cSum = new double[n + 1];
        for (int i = 0; i < n; i++) {
            cSum[i + 1] = cSum[i] + p[i];
        }

        double max = 0;
        for (int i = 0; i + k <= n; i++) {
            max = Math.max(max, cSum[i + k] - cSum[i]);
        }

        System.out.printf("%.8f\n", max);
    }
}

