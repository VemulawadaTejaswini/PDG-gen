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
 
//        n = 1000000000;
//        m = 1000000000;
//        k = 100000;
//        x = new int[k];
//        y = new int[k];
//        for (int i = 0; i < k; ++i) {
//            x[i] = k - i  +1;
//            y[i] = k - i + 1;
//        }
//        Random random = new Random(123123);
//        for (int i = 0; i < k; ++ i){
//            int a = random.nextInt(k);
//            int b = random.nextInt(k);
//            int tmp;
//
//            tmp = x[a];
//            x[a] = x[b];
//            x[b] = tmp;
//
//            tmp = y[a];
//            y[a] = y[b];
//            y[b] = tmp;
//        }
 
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
 
        int w = 16;
        long mask = (1 << w) - 1;
        int[] start = new int[1 << (w + 1)];
        int[] cc = new int[1 << (w + 1)];
 
        long[] data0 = new long[count];
 
        for (int d = 0; d < 4; ++d) {
            Arrays.fill(cc, 0);
            int shift = d * w;
            for (int i = 0; i < count; ++i) {
                int pos = (int) ((data[i] >> shift) & mask);
                ++cc[pos];
            }
            start[0] = 0;
            for (int i = 1; i < cc.length; ++i) {
                start[i] = start[i - 1] + cc[i - 1];
            }
 
            for (int i = 0; i < count; ++i) {
                int pos = (int) ((data[i] >> shift) & mask);
                data0[start[pos]++] = data[i];
            }
 
            long[] tmp = data;
            data = data0;
            data0 = tmp;
        }
 
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