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
        int M = Integer.parseInt(scanner.next());
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }

        Arrays.sort(A);
        int[] B = new int[M - 1];
        for (int i = 0; i < M - 1; i++) {
            B[i] = A[i + 1] - A[i];
        }

        Arrays.sort(B);
        int ans = Arrays.stream(B).limit(M - (M - N - 1)).sum();
        System.out.println(ans);
    }
}

