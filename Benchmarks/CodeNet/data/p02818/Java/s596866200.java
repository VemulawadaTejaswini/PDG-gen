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
        long a = Long.parseLong(scanner.next());
        long b = Long.parseLong(scanner.next());
        long k = Long.parseLong(scanner.next());
        if (a > 0) {
            if (a > k) {
                a -= k;
                k = 0;
            } else {
                k -= a;
                a = 0;
            }
        }
        if (k > 0) {
            b -= k;
        }

        System.out.printf("%d %d\n", a, b);
    }
}
