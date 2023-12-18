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
        long H = Long.parseLong(scanner.next());
        long ans = 0;
        long cnt = 1;

        while (H >= 1) {
            ans += cnt;
            cnt *= 2;
            H /= 2;
        }

        System.out.println(ans);
    }
}
