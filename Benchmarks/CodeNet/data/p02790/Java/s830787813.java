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
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        String a = String.valueOf(A);
        String b = String.valueOf(B);
        StringBuilder ab = new StringBuilder();
        for (int i = 0; i < A; i++) {
            ab.append(b);
        }
        StringBuilder ba = new StringBuilder();
        for (int i = 0; i < B; i++) {
            ab.append(a);
        }
        System.out.println(ab.toString().compareTo(ba.toString()) < 0 ? ab.toString() : ba.toString());
    }

}

