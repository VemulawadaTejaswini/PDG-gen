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
        double ans = 0;
        for (int i = 0; i < N; i++) {
            double a = scanner.nextDouble();
            String s = scanner.next();
            if (s.startsWith("J")) {
                ans += a;
            } else {
                ans += a * 380000;
            }
        }
        System.out.println(ans);
    }

}

