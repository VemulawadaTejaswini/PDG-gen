import java.io.*;
import java.util.*;

public class Main {
    void run() {
        StringBuilder sb = new StringBuilder(read());
        int N = readInt();
        for (int i = 0; i < N; i++) {
            String q = read();
            int a = readInt();
            int b = readInt();
            if (q.equals("print")) {
                sysout.println(sb.substring(a, b + 1));
            }
            else if (q.equals("reverse")) {
                String rev = new StringBuilder(sb.substring(a, b + 1)).reverse().toString();
                sb.replace(a, b + 1, rev);
            } else {
                String t = read();
                sb.replace(a, b + 1, t);
            }
        }
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