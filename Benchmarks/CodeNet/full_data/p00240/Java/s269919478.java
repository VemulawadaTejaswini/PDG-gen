import java.io.*;
import java.util.*;

public class Main {
    void run() {
        while (true) {
            int n = readInt();
            if (n == 0) break;
            int y = readInt();
            double mMax = 0;
            int idMax = -1;
            for (int i = 0; i < n; i++) {
                int b = readInt();
                int r = readInt();
                int t = readInt();
                double m;
                if (t == 1) {
                    m = 1 + 1.0 * y * r / 100;
                } else {
                    m = Math.pow(1 + 1.0 * r / 100, y);
                }
                if (mMax < m) {
                    mMax = m;
                    idMax = b;
                }
            }
            sysout.println(idMax);
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