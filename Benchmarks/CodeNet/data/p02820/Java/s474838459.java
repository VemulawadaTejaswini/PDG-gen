import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        int R = Integer.parseInt(scanner.next());
        int S = Integer.parseInt(scanner.next());
        int P = Integer.parseInt(scanner.next());
        String T = scanner.next();

        long ans = 0;
        Set<Integer> unused = new HashSet<>();
        for (int i = 0; i < N; i++) {
            char c = T.charAt(i);
            if (i < K) {
                if (c == 's')
                    ans += R;
                if (c == 'r')
                    ans += P;
                if (c == 'p')
                    ans += S;
                continue;
            }

            char pc = T.charAt(i - K);
            if (unused.contains(i - K) || c != pc) {
                if (c == 's')
                    ans += R;
                if (c == 'r')
                    ans += P;
                if (c == 'p')
                    ans += S;
                continue;
            }
            unused.add(i);
        }

        System.out.println(ans);
    }

}
