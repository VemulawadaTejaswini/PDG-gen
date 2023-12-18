import java.util.List;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F3";

    FastScanner in;
    PrintWriter out;

    ModLib mod = new ModLib(1000000007);
    ModCombination modC= ModCombination.create(200100, mod);

    int[] child;
    long[] dp;
    long[] dp2;

    public void solve() {
        int N = in.nextInt();
        int[] a = new int[N-1];
        int[] b = new int[N-1];
        List<Integer>[] g = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            a[i] = in.nextInt() - 1;
            b[i] = in.nextInt() - 1;
            g[a[i]].add(b[i]);
            g[b[i]].add(a[i]);
        }

        /*
        O(N^2)
        for (int i = 0; i < N; i++) {
            child = new int[N];
            dp = new long[N];
            dfs1(g, i, -1);
            dfs2(g, i, -1);
            System.out.println(dp[i]);
        }
         */

        child = new int[N];
        dfs1(g, 0, -1);
        dp = new long[N];
        dfs2(g, 0, -1);

        dp2 = new long[N];
        dfs3(g, 0, -1);

        for (int i = 0; i < N; i++) {
            System.out.println(dp2[i]);
        }
    }

    private int dfs1(List<Integer>[] g, int u, int prev) {
        int res = 1;
        for (int v : g[u]) {
            if (v == prev) {
                continue;
            }
            res += dfs1(g, v, u);
        }
        return child[u] = res;
    }

    private long dfs2(List<Integer>[] g, int u, int prev) {
        int size = g[u].size() - (prev == -1 ? 0 : 1);
        if (size == 0) {
            return dp[u] = 1;
        }

        Pair[] vs = new Pair[size];
        int idx = 0;
        for (int v : g[u]) {
            if (prev == v) continue;
            vs[idx++] = new Pair(dfs2(g, v, u), child[v]);
        }
        Arrays.sort(vs, (p1, p2) -> Integer.compare(p2.cnt, p1.cnt));

        int curSize = vs[0].cnt;
        long res = vs[0].v;
        for (int i = 1; i < vs.length; i++) {
            int nextSize = curSize + vs[i].cnt;
            res = mod.mult(res, mod.mult(vs[i].v, modC.comb(nextSize, vs[i].cnt)));
            curSize = nextSize;
        }
        return dp[u] = res;
    }

    private void dfs3(List<Integer>[] g, int u, int prev) {
        if (u == 0) {
            dp2[u] = dp[u];
        } else {
            if (g[prev].size() == 1) {
                dp2[u] = mod.mult(dp[u], child[u]);
            } else {
                int n = g.length;
                long x = mod.div(dp2[prev], modC.comb(n - 1, child[u]));
                dp2[u] = mod.mult(x, modC.comb(n - 1, n - child[u]));
            }
        }

        for (int v : g[u]) {
            if (v == prev) continue;
            dfs3(g, v, u);
        }
    }

    class Pair {
        final long v;
        final int cnt;

        public Pair(long v, int cnt) {
            this.v = v;
            this.cnt = cnt;
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
