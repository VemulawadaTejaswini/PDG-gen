import java.io.*;
import java.util.*;

public class Main {
    void run() {
        int N = readInt();
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        long sumVal = 0;
        for (int i = 0; i < N; i++) {
            int a = readInt();
            minVal = Math.min(minVal, a);
            maxVal = Math.max(maxVal, a);
            sumVal += a;
        }
        sysout.println(minVal + " " + maxVal + " " + sumVal);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = null;

    String readLine() {
        buffer = null;
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String read() {
        if (buffer == null || !buffer.hasMoreTokens()) {
            buffer = new StringTokenizer(readLine());
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
}