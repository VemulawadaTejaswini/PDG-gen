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
        int T = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(scanner.next());
        }

        double min = Double.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            double t = T - 0.006 * H[i];
            if (min > Math.abs(A - t)) {
                min = Math.abs(A - t);
                ans = i;
            }
        }

        System.out.println(ans + 1);
    }

}
