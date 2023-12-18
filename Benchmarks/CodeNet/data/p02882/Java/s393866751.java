import java.math.BigInteger;
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
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int X = Integer.parseInt(scanner.next());

        int S = A * B;
        X /= A;

        if (X > S / 2) {
            int y = (S - X) * 2 / A;
            int x = A;
            double rad = Math.atan2(y, x);
            System.out.println(rad / (2 * Math.PI) * 360);
        } else {
            int y = B;
            int x = 2 * X / B;
            double rad = Math.atan2(y, x);
            System.out.println(rad / (2 * Math.PI) * 360);
        }
    }
}
