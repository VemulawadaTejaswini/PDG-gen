import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.*;

public class Main {
    void run() {
        int T = readInt();
        for (int t = 0; t < T; t++) {
            int N = readInt();
            int K = readInt();
            int[] X = new int[N];

            for (int i = 0; i < N; i++) {
                X[i] = readInt();
            }
            int sum = 0;
            int[] Y = new int[N - 1];
            for (int i = 0; i < N - 1; i++) {
                Y[i] = X[i + 1] - X[i];
                sum += Y[i];
            }
            Arrays.sort(Y);
            for (int i = 0; i < Math.min(N, K) - 1; i++) {
                sum -= Y[Y.length - 1 - i];
            }
            sysout.println(sum);
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