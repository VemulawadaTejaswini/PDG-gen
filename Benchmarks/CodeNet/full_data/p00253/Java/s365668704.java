import java.io.*;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class Main {

    void run() {
        while (true) {
            int n = readInt();
            if (n == 0) break;
            n += 1;
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = readInt();
            }
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> h2 = new ArrayList<Integer>();
                for (int j = 0; j < n; j++) {
                    if (j != i) h2.add(h[j]);
                }
                int diff = h2.get(1) - h2.get(0);
                boolean ok = true;
                for (int j = 1; j < n - 1; j++) {
                    if (h2.get(j) - h2.get(j - 1) != diff) {
                        ok = false;
                    }
                }
                if (ok) sysout.println(h[i]);
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}