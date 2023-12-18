import java.io.*;
import java.util.*;

public class Main {
    private static InputStream is;
    private static PrintWriter out;
    private static String INPUT = "";

    void permutation(int[] seed) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
    }

    void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
        if (index == seed.length) {
            procPerm(perm);
            return;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i]) continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1);
            used[i] = false;
        }
    }

    void procPerm(int[] perm) {
        int bit[] = new int[perm.length + 1];
        for (int i = 0; i < perm.length; ++i) {
            bit[i + 1] = perm[i] ^ bit[i];
        }
        int index[] = new int[perm.length];
        Arrays.fill(index, -1);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < perm.length; ++i) {
            int p = perm[i];
            if (index[p] == -1) {
                index[p] = i;
            } else {
                set.add(bit[i + 1] ^ bit[index[p]]);
            }
        }
        if (set.size() == 1 && set.contains(2)) {
            tr(perm, set);
        }
    }

    void solve() {
        if (false) {
            int m = 2;
            int b = 2;
            for (int i = 0; i < m; ++i) b += b;
            int x[] = new int[b];
            for (int i = 0; i < b; ++i) x[i] = i / 2;
            tr(x);
            permutation(x);
        } else if (false) {
            Random random = new Random();
            while (true) {
                int m = random.nextInt(18);
                int k = random.nextInt(1000000);
                calc(m, k);
            }
        } else {
            int m = ni(), k = ni();
            int[] x = calc(m, k);
            if (x == null) {
                out.println(-1);
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i : x) sb.append(i).append(" ");
                out.println(sb.toString());
            }
        }
    }

    int[] calc(int m, int k) {
        int b = 2;
        for (int i = 0; i < m; ++i) b += b;
        if (b / 2 - 1 < k) return null;
        if (k == 0) {
            int x[] = new int[b];
            for (int i = 0; i < b; ++i) {
                x[i] = i / 2;
            }
            return x;
        }
        int t = 0;
        for (int i = 0; i < b / 2; ++i) {
            if (i == k) continue;
            t ^= i;
        }
        if (t != k) return null;
        int x[] = new int[b];
        x[b - 1] = k;
        x[b / 2 - 1] = k;
        for (int i = 0; i < b / 2 - 1; ++i) {
            int c = i >= k ? 1 : 0;
            x[i] = i + c;
            x[b - 2 - i] = i + c;
        }
        if (!check(x, k)) throw new RuntimeException();
        return x;
    }

    boolean check(int perm[], int k) {
        int bit[] = new int[perm.length + 1];
        for (int i = 0; i < perm.length; ++i) {
            bit[i + 1] = perm[i] ^ bit[i];
        }
        int index[] = new int[perm.length];
        Arrays.fill(index, -1);
        for (int i = 0; i < perm.length; ++i) {
            int p = perm[i];
            if (index[p] == -1) {
                index[p] = i;
            } else {
                int t = (bit[i + 1] ^ bit[index[p]]);
                if (k != t) {
                    tr(k, t, i, p);
                    return false;
                }
            }
        }
        return true;
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
            a[i] = nl();
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