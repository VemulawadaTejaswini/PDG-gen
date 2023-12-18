import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long[][] items = new long[N][2];
        for (int i = 0; i < N; i++) {
            items[i][0] = scanner.nextInt();
            items[i][1] = scanner.nextInt();
        }
        Arrays.sort(items, Comparator.comparing(x -> x[0]));
        long pay = 0;
        for (int i = 0; i < N; i++) {
            if (items[i][1] >= M) {
                pay += items[i][0] * M;
                break;
            }
            pay += items[i][0] * items[i][1];
            M -= items[i][1];
        }
        System.out.println(pay);
    }
}