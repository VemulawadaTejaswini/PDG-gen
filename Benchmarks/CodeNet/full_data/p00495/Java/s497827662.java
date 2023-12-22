import java.io.*;
import java.util.*;

public class Main {
    void run() {
        int LA = readInt();
        int LB = readInt();
        int[] A = new int[LA];
        int[] B = new int[LB];
        for (int i = 0; i < LA; i++) {
            A[i] = readInt();
        }
        for (int i = 0; i < LB; i++) {
            B[i] = readInt();
        }
        int ans = 0;
        for (int i = 0; i < LB; i++) {
            int p = 0;
            int k = i;
            while (p < LA && k < LB) {
                if (A[p] == B[k]) {
                    ++k;
                }
                p++;
            }
            ans = Math.max(ans, k - i);
        }
        sysout.println(ans);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = null;

    String read() {
        if (buffer == null || !buffer.hasMoreTokens()) {
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
        buffer = null;
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}