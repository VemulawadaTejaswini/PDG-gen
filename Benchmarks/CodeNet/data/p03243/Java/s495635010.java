import java.nio.file.FileSystemLoopException;
import java.text.DecimalFormat;
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

    static class P {
        int x;
        int y;

        public P(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            P p = (P) o;
            return x == p.x &&
                    y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int[] foo = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        for(int n: foo) {
            if (N <= n) {
                System.out.println(n);
                return;
            }
        }
    }

}
