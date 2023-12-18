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
        if (N == 22) {
            System.out.println("Christmas Eve Eve Eve");
        } else if (N == 23) {
            System.out.println("Christmas Eve Eve");
        } else if (N == 24) {
            System.out.println("Christmas Eve");
        } else {
            System.out.println("Christmas");
        }

    }

}

