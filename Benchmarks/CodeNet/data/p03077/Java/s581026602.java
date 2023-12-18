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
        long n = Long.parseLong(scanner.nextLine());
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            min = Math.min(min, Long.parseLong(scanner.nextLine()));
        }
        long plus = n / min;
        if (n % min != 0) {
            plus++;
        }
        System.out.println(5 + plus);

    }

}
