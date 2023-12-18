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
        int P = Integer.parseInt(scanner.next());
        Map<Integer, Integer> cnt = new HashMap<>();

        String s = scanner.next();
        long ans = 0;
        for (int i = 0; i < N; i++) {
            int n = s.charAt(i) - '0';
            Map<Integer, Integer> tmp = new HashMap<>();
            for (Map.Entry<Integer, Integer> e: cnt.entrySet()) {
                int key = (10 * e.getKey() + n) % P;
                tmp.put(key, tmp.getOrDefault(key, 0) + e.getValue());
            }
            tmp.put(n % P, tmp.getOrDefault(n % P, 0) + 1);
            cnt = tmp;
            ans += cnt.getOrDefault(0, 0);
        }
        System.out.println(ans);
    }

}

