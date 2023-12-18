import java.io.*;
import java.util.Arrays;
 
public class Main {
 
    final static boolean DEBUG = false;
 
    final void solve() throws Exception {
        long n = nextInt();
        long m = nextInt();
        int k = nextInt();
 
        int[] x = new int[k];
        int[] y = new int[k];
        for (int i = 0; i < k; ++i) {
            x[i] = nextInt();
            y[i] = nextInt();
        }
 
        final int MAXN = 11 * k + 2;
 
        int count = 0;
        long[] data = new long[MAXN];
 
        for (int dx = -2; dx <= 0; ++dx) {
            for (int dy = -2; dy <= 0; ++dy) {
 
                for (int i = 0; i < k; ++i) {
                    int xx = dx + x[i];
                    int yy = dy + y[i];
                    if (xx > 0 && yy > 0 && xx + 2 <= n && yy + 2 <= m) {
                        data[count++] = (((long) xx) << 31) + yy;
                    }
                }
            }
        }
 
        Arrays.sort(data, 0, count);
 
        long[] result = new long[10];
 
        int len = 1;
        for (int i = 1; i < count; ++i) {
            if (data[i] != data[i - 1]) {
                ++result[len];
                len = 1;
            } else {
                ++len;
            }
        }
 
        ++result[len];
        result[0] = (n - 2) * (m - 2);
        for (int i = 1; i < result.length; ++i) {
            result[0] -= result[i];
        }
 
        for (int i = 0; i < result.length; ++i) {
            print(result[i]);
            println();
        }
    }
 
    final static BufferedReader in;
    final static PrintWriter out;
 
    static final boolean isWhiteSpace(final int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == -1;
    }
 
    static final int read() throws Exception {
        return in.read();
    }
 
    static final int nextInt() throws Exception {
        int result = 0;
        boolean negative = false;
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        if (c == '-') {
            negative = true;
            c = read();
        }
        while (!isWhiteSpace(c)) {
            result = result * 10 + (c - '0');
            c = read();
        }
        return negative ? -result : result;
    }
 
    static final long nextLong() throws Exception {
        long result = 0;
        boolean negative = false;
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        if (c == '-') {
            negative = true;
            c = read();
        }
        while (!isWhiteSpace(c)) {
            result = result * 10 + (c - '0');
            c = read();
        }
        return negative ? -result : result;
    }
 
    static final StringBuilder tmpString = new StringBuilder(1 << 20);
 
    static final String nextString() throws Exception {
        tmpString.setLength(0);
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        while (!isWhiteSpace(c)) {
            tmpString.append((char) c);
            c = read();
        }
        return tmpString.toString();
    }
 
    static final char nextChar() throws Exception {
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        while (!isWhiteSpace(c)) {
            return (char) c;
        }
        return (char) 0;
    }
 
    static final String readLine() throws Exception {
        return in.readLine();
    }
 
    static final void print(final int i) {
        out.print(i);
    }
 
    static final void print(final long l) {
        out.print(l);
    }
 
    static final void print(final String s) {
        out.print(s);
    }
 
    static final void println() {
        out.println();
    }
 
    static {
        try {
            if (DEBUG) {
                String fileName = Main.class.getSimpleName();
                in = new BufferedReader(new FileReader(fileName + ".in"));
                out = new PrintWriter(new BufferedWriter(new FileWriter(fileName + ".out")));
            } else {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
 
    public static void main(String[] args) throws Exception {
        new Main().solve();
        out.close();
    }
}