import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        String s = scanner.nextLine();
        if (s.equals("A")) {
            System.out.println("T");
        } else if (s.equals("C")) {
            System.out.println("G");
        } else if (s.equals("G")) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }

}