import java.util.*;
import java.util.stream.Collectors;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 16MB stack
        Thread thread = new Thread(null, new Main(), "", 16 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int a = Integer.parseInt(scanner.nextLine());
    // int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int sum = 0;
        int minus = 10;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            sum += (n / 10) * 10;
            if (n % 10 != 0) {
                sum += 10;
                minus = Math.min(minus, n % 10);
            }
        }
        System.out.println(sum - minus);

    }

}
