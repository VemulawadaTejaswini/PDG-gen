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
        String S = scanner.next();
        int ans = 1;
        char prev = S.charAt(0);
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) != prev) {
                prev = S.charAt(i);
                ans++;
            }
        }

        System.out.println(ans);
    }
}
