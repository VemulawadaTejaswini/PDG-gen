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
        double A = Integer.parseInt(scanner.next());
        double B = Integer.parseInt(scanner.next());
        double X = Integer.parseInt(scanner.next());

        X /= A;
        if (X > A * B / 2) {
            double H = (A * B - X) * 2 / A;
            double rad = Math.atan2(H, A);
            System.out.printf("%.10f\n", rad / Math.PI * 180);
        } else {
            double W = 2 * X / B;
            double rad = Math.atan2(B, W);
            System.out.printf("%.10f\n", rad / Math.PI * 180);
        }
    }
}
