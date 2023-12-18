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
        String s = scanner.next();
        boolean[] used = new boolean[s.length()];
        int ans = 0;
        while (true) {
            int updated = 0;
            int prev = -1;
            for (int i = 0; i < s.length(); i++) {
                if (used[i]) {
                    continue;
                }
                if (prev == -1) {
                    prev = i;
                } else {
                    if (s.charAt(prev) == s.charAt(i)) {
                        updated += 2;
                        used[prev] = true;
                        used[i] = true;
                        prev = -1;
                    } else {
                        prev = i;
                    }
                }
            }
            if (updated == 0) {
                break;
            }
            ans += updated;
        }
        System.out.println(ans);
    }

}