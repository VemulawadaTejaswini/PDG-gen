import java.io.FileNotFoundException;
import java.util.Comparator;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F4";

    FastScanner in;
    PrintWriter out;

    class Pair {
        final int x;
        final int d;

        public Pair(int x, int d) {
            this.x = x;
            this.d = d;
        }

        public String toString() {
            return x + " " + d;
        }
    }

    public void solve() {
        /*
        int n = in.nextInt();
        int p = in.nextInt();
        String s = in.next();

        long res = 0;
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int j = i; j < n; j++) {
                int c = s.charAt(j) - '0';
                cur = ((cur * 10) + c) % p;
                if (cur == 0) {
                    res++;
                }
            }
        }
        System.out.println(res);
         */
        int n = in.nextInt();
        Pair[] ps = new Pair[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int d = in.nextInt();
            ps[i] = new Pair(x, d);
        }
        Arrays.sort(ps, Comparator.comparingInt(p -> p.x));
        int[] idx = new int[n];
        SegmentTree st = new SegmentTree(n + 1);
        st.update(n, n);
        for (int i = n - 1; i >= 0; i--) {
            int y = ps[i].x + ps[i].d;
            int lo = i, hi = n;
            while (hi - lo > 1) {
                int mid = (hi + lo) / 2;
                if (ps[mid].x < y) {
                    lo = mid;
                } else {
                    hi = mid;
                }
            }
            int next = Math.max(st.getMaxQuery(i, lo), lo + 1);
            idx[i] = next;
            st.update(i, next);
        }
        long[] dp = new long[n+1];
        ModLib m = new ModLib(998244353);
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            dp[idx[i]] = m.add(dp[idx[i]], dp[i]);
            dp[i+1] = m.add(dp[i+1], dp[i]);
        }
        System.out.println(dp[n]);
    }


    class SegmentTree {
        int N;
        int[] dat;

        public SegmentTree(int n) {
            N = Integer.highestOneBit(n) << 1;
            int size = (N << 1) - 1;
            // System.out.println(N + " " + size);
            dat = new int[size];
            Arrays.fill(dat, Integer.MIN_VALUE);
        }

        /**
         * Update the segment tree.
         * @param k the index of tree to update
         * @param a the value of tree to update
         */
        void update(int k, int a) {
            k += N - 1;
            dat[k] = a;
            while (k > 0) {
                k = (k - 1) / 2;
                dat[k] = Math.max(dat[k*2 + 1], dat[k*2 + 2]);
            }
        }

        private int query(int a, int b, int k, int l, int r) {
            if (r < a || b < l) return Integer.MIN_VALUE;

            if (a <= l && r <= b) return dat[k];
            else {
                int vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
                int vr = query(a, b, k * 2 + 2, (l + r) / 2 + 1, r);
                return Math.max(vl, vr);
            }

        }

        int getMaxQuery(int a, int b) {
            return query(a, b, 0, 0, N - 1);
        }

        void display() {
            System.out.println("-------------Segment Tree-------------");
            for (int i = 1; i < dat.length; i *= 2) {
                for (int j = i; j < 2 * i; j++) {
                    System.out.print(dat[j-1] + " ");
                }
                System.out.println();
            }
            System.out.println("----------------End------------------");
            System.out.println();
        }
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

}

class ModCombination {
    private final ModLib modLib;

    private final long[] fact;
    private final long[] invfact;

    private ModCombination(ModLib modLib, long[] fact, long[] invfact) {
        this.modLib = modLib;
        this.fact = fact;
        this.invfact = invfact;
    }

    public static ModCombination create(int size, ModLib modLib) {
        long[] fact = new long[size];
        fact[0] = 1;
        for (int i = 0; i < size - 1; i++) {
            fact[i+1] = modLib.mult(fact[i], i + 1);
        }
        long[] invfact = new long[size];
        invfact[size-1] = modLib.div(1, fact[size-1]);
        for (int i = size - 2; i >= 0; i--) {
            invfact[i] = modLib.mult(invfact[i+1], i + 1);
        }
        return new ModCombination(modLib, fact, invfact);
    }

    public long fact(int x) {
        return fact[x];
    }

    public long invfact(int x) {
        return invfact[x];
    }

    public long comb(int a, int b) {
        if (b > a) {
            return 0;
        }
        return modLib.mult(fact[a], modLib.mult(invfact[b], invfact[a-b]));
    }

}

class ModLib {
    final long mod;

    public ModLib(long mod) {
        this.mod = mod;
    }

    public long add(long a, long b) {
        return (a + b) % mod;
    }

    public long sub(long a, long b) {
        return (a - b + mod) % mod;
    }

    public long mult(long a, long b) {
        return ((a % mod) * (b % mod)) % mod;
    }

    public long pow(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = mult(res, a);
            a = mult(a, a);
        }

        return res;
    }

    public long div(long a, long b) {
        return mult(a, pow(b, mod - 2));
    }
}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
