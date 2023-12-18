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
        int N = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        if (A == 0) {
            System.out.println(0);
            return;
        }

        int q = N / (A + B);
        int r = N % (A + B);

        System.out.println(q * A + Math.min(r, A));
    }

}

