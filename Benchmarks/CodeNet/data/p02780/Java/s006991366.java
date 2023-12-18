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
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(scanner.next());
        }
        Arrays.sort(p, Comparator.reverseOrder());

        double ans = 0;
        for (int i = 0; i < k; i++) {
            ans += p[i] * (p[i] + 1) / 2.0 / p[i];
        }
        System.out.println(ans);
    }
}

