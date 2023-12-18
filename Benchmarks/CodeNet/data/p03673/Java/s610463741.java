
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        int n = sc.nextInt();
        LinkedList<Integer> b = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (i % 2 == 0) {
                b.addLast(a);
            } else {
                b.addFirst(a);
            }
        }

        boolean f = true;

        for (int i = 0; i < n; i++) {
            int x = n % 2 == 0 ? b.removeFirst() : b.removeLast();
            if (f) {
                f = false;
                out.print(x);
            } else {
                out.print(" " + x);
            }
        }

        out.println();

        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}