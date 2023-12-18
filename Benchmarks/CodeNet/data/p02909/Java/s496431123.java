import java.util.Scanner;
import java.util.TreeMap;

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
        String s = scanner.next();
        if (s.startsWith("S")) {
            System.out.println("Cloudy");
        } else if (s.startsWith("C")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}

