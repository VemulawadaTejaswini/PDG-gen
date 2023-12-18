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
        Set<Integer> set = new HashSet<>();
        set.add(N);
        int cnt = 1;
        while (true) {
            if (N % 2 == 0) {
                N >>= 1;
            } else {
                N *= 3;
                N++;
            }
            if (!set.add(N)) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt + 1);
    }
}

