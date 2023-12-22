
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();

        if (x == 0) {
            System.out.println(k % 2 == 0 ? 0 : d);
            return;
        }

        long maxCount = Math.abs(x / d);
        long absD = x < 0 ? -d : d;
        if (maxCount >= k) {
            System.out.println(x - k * absD);
        } else {
            long nokori = k - maxCount;
            System.out.println(nokori % 2 == 0 ? Math.abs(x % d) :  Math.abs(x % d - absD));
        }
        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
