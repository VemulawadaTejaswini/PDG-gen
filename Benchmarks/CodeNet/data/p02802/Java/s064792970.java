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
        int M = Integer.parseInt(scanner.next());
        Set<Integer> accepted = new HashSet<>();
        Map<Integer, Integer> penalty = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(scanner.next());
            boolean ac = scanner.next().equals("AC");
            if (ac) {
                accepted.add(p);
            } else {
                if (!accepted.contains(p)) {
                    penalty.put(p, penalty.getOrDefault(p, 0) + 1);
                }
            }
        }

        int pen = 0;
        for (int i = 1; i <= N; i++) {
            if (accepted.contains(i)) {
                pen += penalty.getOrDefault(i, 0);
            }
        }

        System.out.printf("%d %d\n", accepted.size(), pen);
    }

}

