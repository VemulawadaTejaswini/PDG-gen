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
        int[][] n = new int[N][2];
        for (int i = 0; i < N; i++) {
            n[i][0] = Integer.parseInt(scanner.next());
            n[i][1] = i;
        }
        Arrays.sort(n, Comparator.comparingInt(x -> x[0]));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(n[i][1] + 1);
            sb.append(' ');
        }
        System.out.println(sb.toString());
    }

}
