import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;

    void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = in.nextLongArray(n);
        List<Long> neg = new ArrayList<>();
        List<Long> pos = new ArrayList<>();
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                neg.add(-a[i]);
            } else if (a[i] > 0) {
                pos.add(a[i]);
            } else {
                zero++;
            }
        }
        if (n - k < zero) {
            out.println(0);
        } else {
            neg.sort(Comparator.reverseOrder());
            pos.sort(Comparator.reverseOrder());
            int nn = neg.size();
            int pn = pos.size();
            long[] negs = new long[nn + 1];
            long[] poss = new long[pn + 1];
            long[] negr = new long[nn + 1];
            long[] posr = new long[pn + 1];
            negs[0] = 1;
            poss[0] = 1;
            negr[0] = 1;
            posr[0] = 1;
            for (int i = 0; i < nn; i++) {
                negs[i + 1] = negs[i] * neg.get(i) % mod;
                negr[i + 1] = negr[i] * neg.get(nn - 1 - i) % mod;
            }
            for (int i = 0; i < pn; i++) {
                poss[i + 1] = poss[i] * pos.get(i) % mod;
                posr[i + 1] = posr[i] * pos.get(pn - 1 - i) % mod;
            }
            long ansPos = -inf;
            long ansNeg = inf;
            for (int i = 0; i <= k; i++) {
                int j = k - i;
                if (i > nn || j > pn) {
                    continue;
                }
                if (i % 2 == 0) {
                    ansPos = Math.max(ansPos, negs[i] * poss[j] % mod);
                } else {
                    ansNeg = Math.min(ansNeg, negr[i] * posr[j] % mod);
                }
            }
            if (ansPos == -inf) {
                out.println(zero > 0 ? 0 : ((-ansNeg) + mod) % mod);
            } else {
                out.println(ansPos);
            }
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
    
    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
