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
        int[][] PY = new int[M][2];
        int[][] PY2 = new int[M][2];
        for (int i = 0; i < M; i++) {
            PY[i][0] = Integer.parseInt(scanner.next());
            PY[i][1] = Integer.parseInt(scanner.next());
            PY2[i][0] = PY[i][0];
            PY2[i][1] = PY[i][1];
        }
        Arrays.sort(PY, Comparator.comparing(x -> x[1]));

        Map<Integer, Integer> m = new HashMap<>();
        Map<String, String> ans = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int P = PY[i][0];
            int Y = PY[i][1];
            m.put(P, m.getOrDefault(P, 0) + 1);
            ans.put(String.format("%d:%d", P, Y), String.format("%06d%06d", P, m.get(P)));
        }

        for (int i = 0; i < M; i++) {
            System.out.println(ans.get(String.format("%d:%d", PY2[i][0], PY2[i][1])));
        }
    }

}
