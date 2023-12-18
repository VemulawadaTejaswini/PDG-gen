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
        String s = scanner.next();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + 3 <= s.length(); i++) {
            min = Math.min(min, Math.abs(753 - Integer.parseInt(s.substring(i, i + 3))));
        }
        System.out.println(min);
    }

}

