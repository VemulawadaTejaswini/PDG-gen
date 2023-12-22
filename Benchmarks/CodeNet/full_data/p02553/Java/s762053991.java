
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long[] arr = {a * c, a * d,b * c, b *d};

        long max = Long.MIN_VALUE;
        for (long l : arr) {
            max = Math.max(max, l);
        }

        System.out.println(max);

        // out.println("Hello World");
        out.flush();    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
