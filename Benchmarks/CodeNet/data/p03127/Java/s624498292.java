import java.util.Arrays;
import java.util.Scanner;

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
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int gcd = a[0];
        for (int i = 1; i < N; i++) {
            gcd = (int) gcd(gcd, a[i]);
        }

        System.out.println(gcd);
    }

    private static long gcd(long x, long y) {
        if (x < y) {
            return gcd(y, x);
        }
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}

