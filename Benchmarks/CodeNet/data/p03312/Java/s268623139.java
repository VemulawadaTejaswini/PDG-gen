import java.io.*;
import java.util.*;
import java.util.stream.LongStream;

public class Main {
    private static InputStream is;
    private static PrintWriter out;
    private static String INPUT = "";

    class Random {
        long x = 2463534242L;

        long next() {
            return x ^= (x ^= (x ^= x << 13) >> 17) << 5;
        }

        int nextInt() {
            return Math.abs((int) next());
        }
    }

    long min(long... o) {
        return LongStream.of(o).min().getAsLong();
    }

    long max(long... o) {
        return LongStream.of(o).max().getAsLong();
    }

    void solve() {
        long S = System.currentTimeMillis();
        int n = ni(), a[] = na(n);
        long s[] = new long[n + 1];
        int b[];
        int k = n / 4;
        if (k > 10) {
            b = new int[]{0, 1 * k, 2 * k, 3 * k, n};
        } else {
            b = new int[]{0, 1, 2, 3, n};
        }
        long x = Long.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            s[i + 1] = s[i] + a[i];
        }
        Random r = new Random();
        while (1800 > System.currentTimeMillis() - S) {
            for (int T = 0; T < 0xff; ++T) {
                int i = 1 + r.nextInt() % 3;
                if (r.nextInt() % 2 == 0) {
                    long v1 = s[b[i]] - s[b[i - 1]];
                    long v2 = s[b[i + 1]] - s[b[i]];
                    if (v1 < v2 && b[i] + 1 < b[i + 1]) b[i]++;
                    if (v1 > v2 && b[i] - 1 > b[i - 1]) b[i]--;
                } else {
                    int t = r.nextInt() % 3;
                    if (t == 1 && b[i] + 1 < b[i + 1]) b[i]++;
                    if (t == 2 && b[i] - 1 > b[i - 1]) b[i]--;
                }

                long t1 = s[b[1]] - s[b[0]];
                long t2 = s[b[2]] - s[b[1]];
                long t3 = s[b[3]] - s[b[2]];
                long t4 = s[b[4]] - s[b[3]];
                x = Math.min(x, max(t1, t2, t3, t4) - min(t1, t2, t3, t4));
            }
        }
        out.println(x);
    }

    public static void main(String[] args) throws Exception {
        long S = System.currentTimeMillis();
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        new Main().solve();
        out.flush();
        long G = System.currentTimeMillis();
        tr(G - S + " ms");
    }

    private static boolean eof() {
        if (lenbuf == -1) return true;
        int lptr = ptrbuf;
        while (lptr < lenbuf)
            if (!isSpaceChar(inbuf[lptr++])) return false;

        try {
            is.mark(1000);
            while (true) {
                int b = is.read();
                if (b == -1) {
                    is.reset();
                    return true;
                } else if (!isSpaceChar(b)) {
                    is.reset();
                    return false;
                }
            }
        } catch (IOException e) {
            return true;
        }
    }

    private static byte[] inbuf = new byte[1024];
    static int lenbuf = 0, ptrbuf = 0;

    private static int readByte() {
        if (lenbuf == -1) throw new InputMismatchException();
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) return -1;
        }
        return inbuf[ptrbuf++];
    }

    private static boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private static int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b))
            ;
        return b;
    }

    private static double nd() {
        return Double.parseDouble(ns());
    }

    private static char nc() {
        return (char) skip();
    }

    private static String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private static char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private static char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for (int i = 0; i < n; i++)
            map[i] = ns(m);
        return map;
    }

    private static int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}