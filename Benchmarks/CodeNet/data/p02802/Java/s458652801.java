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
        int M = Integer.parseInt(scanner.next()) * N;
        Set<Integer> accepted = new HashSet<>();
        int penalty = 0;
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(scanner.next());
            boolean ac = scanner.next().equals("AC");
            if (ac) {
                accepted.add(p);
            } else {
                if (!accepted.contains(p)) {
                    penalty++;
                }
            }
        }

        System.out.printf("%d %d\n", accepted.size(), penalty);
    }

}

