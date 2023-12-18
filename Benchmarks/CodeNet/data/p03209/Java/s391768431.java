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

    static long[] layer, patty;

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        long X = Long.parseLong(scanner.next());
        layer = new long[N + 1];
        layer[0] = 1;
        patty = new long[N + 1];
        patty[0] = 1;
        for (int i = 1; i <= N; i++) {
            layer[i] = layer[i - 1] * 2 + 3;
            patty[i] = patty[i - 1] * 2 + 1;
        }

        System.out.println(dfs(N, X));
    }

    private static long dfs(int N, long X) {
        long L = layer[N];
        if (X == 0) {
            return 0;
        }
        if (L <= X) {
            return patty[N];
        }
        if (X <= L / 2) {
            return dfs(N - 1, X - 1);
        } else if (X == L / 2 + 1) {
            return dfs(N - 1, X - 2) + 1;
        } else { // if (X > L / 2 + 1) {
            return patty[N - 1] + 1 + dfs(N - 1, X - L / 2 - 1);
        }
    }

}

