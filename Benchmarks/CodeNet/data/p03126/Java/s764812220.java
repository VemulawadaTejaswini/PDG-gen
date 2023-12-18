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
        int M = Integer.parseInt(scanner.next());
        int[] cnt = new int[M];
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(scanner.next());
            for (int j = 0; j < K; j++) {
                cnt[Integer.parseInt(scanner.next()) - 1]++;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < M; i++) {
            if (cnt[i] == N)
                ans++;
        }
        System.out.println(ans);
    }

}

