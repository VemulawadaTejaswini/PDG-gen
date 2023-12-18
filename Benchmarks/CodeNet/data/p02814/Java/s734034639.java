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
        long M = Integer.parseInt(scanner.next());
        long[] A = new long[N];
        long max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
            max = Math.max(max, A[i]);
        }
        long gcd = A[0] / 2;
        long lcm = A[0] / 2;
        Set<Long> used = new HashSet<>();
        used.add(A[0]);
        for (int i = 1; i < N; i++) {
            if (used.add(A[i])) {
                gcd = gcd(gcd, A[i] / 2);
                lcm = lcm * (A[i] / 2) / gcd;
                if (lcm > M) {
                    System.out.println(0);
                    return;
                }
            }
        }

        long ans = M / lcm;
        if (lcm == max) {
            System.out.println(ans / 2);
        } else {
            System.out.println(ans - ans / 2);
        }
    }

    static long gcd(long x, long y) {
        if (x < y) {
            return gcd(y, x);
        }
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}

