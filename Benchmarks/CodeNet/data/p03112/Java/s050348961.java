import java.util.Scanner;
import java.util.TreeSet;

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
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int Q = scanner.nextInt();
        TreeSet<Long> s1 = new TreeSet<>();
        TreeSet<Long> s2 = new TreeSet<>();
        for (int i = 0; i < A; i++) {
            s1.add(scanner.nextLong());
        }
        for (int i = 0; i < B; i++) {
            s2.add(scanner.nextLong());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            long x = scanner.nextLong();
            long ans = Long.MAX_VALUE;
            Long s1l = s1.floor(x);
            Long s2l = s2.floor(x);
            Long s1r = s1.ceiling(x);
            Long s2r = s2.ceiling(x);
            if (s1l != null & s2l != null)
                ans = Math.min(ans, x - Math.min(s1l, s2l));
            if (s1r != null & s2r != null)
                ans = Math.min(ans, Math.max(s1r, s2r) - x);
            if (s1r != null & s2l != null)
                ans = Math.min(ans, s1r - s2l + Math.min(s1r - x, x - s2l));
            if (s1l != null & s2r != null)
                ans = Math.min(ans, s2r - s1l + Math.min(s2r - x, x - s1l));
            sb.append(ans);
            sb.append('\n');
        }
        System.out.println(sb);
    }

}

