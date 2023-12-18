import java.io.*;
import java.util.*;

public class Main {
    private static InputStream is;
    private static PrintWriter out;
    private static String INPUT = "";

    void solve() {
        int n = ni();
        long a[] = new long[n], sum = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = nl();
            sum += a[i];
        }
        long b[] = new long[n + 2];
        long e[] = new long[n + 2];
        for (int i = 0; i < n; ++i) {
            b[i + 1] = a[i] - (a[i] % 2 == 0 ? 1 : 0);
            e[n - i] = a[i] - (a[i] % 2 == 0 ? 1 : 0);
        }
        for (int i = 0; i <= n; ++i) {
            if (b[i] < 0) b[i] = 0;
            b[i + 1] += b[i];
            if (e[i] < 0) e[i] = 0;
            e[i + 1] += e[i];
        }
        long c[] = new long[n + 1];
        long d[] = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            if (a[i] == 0) {
                c[i + 1] = -2;
                d[n - i] = -2;
            } else {
                c[i + 1] = a[i] - (a[i] % 2 == 1 ? 1 : 0);
                d[n - i] = a[i] - (a[i] % 2 == 1 ? 1 : 0);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (c[i] < 0) c[i] = 0;
            c[i + 1] += c[i];
            if (d[i] < 0) d[i] = 0;
            d[i + 1] += d[i];
        }
        int r = 0, l = 0;
        long rv = 0, lv = 0;
        for (int i = 0; i <= n; ++i) {
            if (rv < c[i] - b[i]) {
                rv = c[i] - b[i];
                r = i;
            }
            if (lv < d[i] - e[i]) {
                lv = d[i] - e[i];
                l = i;
            }
        }
        long result = 0;
        for (int i = 0; i < n; ++i) {
            if (r + l <= n) {
                result = Math.max(result,
                        c[r] + d[l] + b[n - l] - b[r]
                );
            }
            result = Math.max(result, c[i] + d[n - i]);
        }
        out.println(sum - result);
    }

    public static void main(String[] args) throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
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

    private class XorShift {
        int x = 123456789;
        int y = 362436069;
        int z = 521288629;
        int w = 88675123;

        int nextInt(int n) {
            final int t = x ^ (x << 11);
            x = y;
            y = z;
            z = w;
            w = (w ^ (w >>> 19)) ^ (t ^ (t >>> 8));
            final int r = w % n;
            return r < 0 ? r + n : r;
        }
    }

    private static void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}