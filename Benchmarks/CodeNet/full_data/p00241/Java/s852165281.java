import java.io.*;
import java.util.*;

public class Main {
    void run() {
        while(true) {
            int T = readInt();
            if (T == 0) break;

            for (; T > 0; T--) {
                int[] a = new int[5];
                int[] b = new int[5];
                for (int i = 1; i <= 4; i++) {
                    a[i] = readInt();
                }
                for (int i = 1; i <= 4; i++) {
                    b[i] = readInt();
                }
                sysout.printf(
                        "%d %d %d %d\n",
                        a[1] * b[1] - a[2] * b[2] - a[3] * b[3] - a[4] * b[4],
                        a[1] * b[2] + a[2] * b[1] + a[3] * b[4] - a[4] * b[3],
                        a[1] * b[3] - a[2] * b[4] + a[3] * b[1] + a[4] * b[2],
                        a[1] * b[4] + a[2] * b[3] - a[3] * b[2] + a[4] * b[1]
                );
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