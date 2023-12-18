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
        int K = Integer.parseInt(scanner.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }
        Arrays.sort(A);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + K - 1 < N; i++) {
            ans = Math.min(ans, A[K - 1 + i] - A[i]);
        }

        System.out.println(ans);
    }

}

