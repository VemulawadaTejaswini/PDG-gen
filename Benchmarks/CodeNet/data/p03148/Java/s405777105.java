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
        int K = Integer.parseInt(scanner.next());

        int[][] list = new int[N][2];
        for (int i = 0; i <N; i++) {
            list[i][0] = Integer.parseInt(scanner.next());
            list[i][1] = Integer.parseInt(scanner.next());
        }

        Arrays.sort(list, Comparator.comparing(x -> -x[1]));

        Queue<Integer> removable = new PriorityQueue<>();
        Set<Integer> added = new HashSet<>();
        long oishi = 0;
        long kind = 0;

        for (int i = 0; i < K; i++) {
            oishi += list[i][1];
            if (added.add(list[i][0])) {
                kind++;
            } else {
                removable.add(list[i][1]);
            }
        }

        long max = oishi + kind * kind;
        for (int i = K; i < N; i++) {
            if (added.add(list[i][0])) {
                oishi -= removable.poll();
                oishi += list[i][1];
                kind++;
                max = Math.max(max, oishi + kind * kind);
            }
        }

        System.out.println(max);
    }
}

