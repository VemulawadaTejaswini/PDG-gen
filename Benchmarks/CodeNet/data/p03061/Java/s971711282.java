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
        int N = Integer.parseInt(scanner.nextLine());
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] left = new int[N];
        left[0] = a[0];
        for (int i = 1; i < N; i++) {
            left[i] = (int) gcd(left[i - 1], a[i]);
        }
        int[] right = new int[N];
        right[N - 1] = a[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            right[i] = (int) gcd(right[i + 1], a[i]);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                max = Math.max(max, right[i + 1]);
            } else if (i == N - 1) {
                max = Math.max(max, right[i - 1]);
            } else {
                max = Math.max(max, (int) gcd(left[i - 1], right[i + 1]));
            }
        }

        System.out.println(max);
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
