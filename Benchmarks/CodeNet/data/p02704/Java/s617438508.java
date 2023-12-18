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
    static final long inf = 0xfffffffffffffffL;
    static final int iinf = 0xfffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        int[] s = in.nextIntArray(n);
        int[] t = in.nextIntArray(n);
        long[] u = in.nextLongArray(n);
        long[] v = in.nextLongArray(n);
        long[][] ans = new long[n][n];
        for (int i = 0; i < 64; i++) {
            int[] uu = new int[n];
            int[] vv = new int[n];
            for (int j = 0; j < n; j++) {
                uu[j] = s[j] * 2 + (int)((u[j] >> i) & 1);
                vv[j] = t[j] * 2 + (int)((v[j] >> i) & 1);
            }
            long[][] res = f(n, uu, vv);
            if (res == null) {
                out.println(-1);
                return;
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    ans[j][k] |= res[j][k] << i;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            out.println(ans[i]);
        }
    }

    long[][] res;
    boolean[][] selected;
    String[] op = {"1つ以上0", "すべて1", "すべて0", "1つ以上1"};
    long[][] f(int n, int[] s, int[] t) {
        res = new long[n][n];
        selected = new boolean[n][n];
        boolean[] reqs = new boolean[n];
        boolean[] reqt = new boolean[n];
        Arrays.fill(reqs, true);
        Arrays.fill(reqt, true);
        int gs = -1;
        int gt = -1;
        for (int i = 0; i < n; i++) {
            if (s[i] == 1) {
                reqs[i] = false;
                for (int j = 0; j < n; j++) {
                    if (set(i, j, 1)) {
                        return null;
                    }
                    if (t[j] == 3) {
                        reqt[j] = false;
                        gt = j;
                    }
                }
            }
            if (s[i] == 2) {
                reqs[i] = false;
                for (int j = 0; j < n; j++) {
                    if (set(i, j, 0)) {
                        return null;
                    }
                    if (t[j] == 0) {
                        reqt[j] = false;
                        gt = j;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                reqt[i] = false;
                for (int j = 0; j < n; j++) {
                    if (set(j, i, 1)) {
                        return null;
                    }
                    if (s[j] == 3) {
                        reqs[j] = false;
                        gs = j;
                    }
                }
            }
            if (t[i] == 2) {
                reqt[i] = false;
                for (int j = 0; j < n; j++) {
                    if (set(j, i, 0)) {
                        return null;
                    }
                    if (s[j] == 0) {
                        reqs[j] = false;
                        gs = j;
                    }
                }
            }
        }
        List<Integer> rems = new ArrayList<>();
        List<Integer> remt = new ArrayList<>();
        int s0 = -1;
        int s1 = -1;
        int t0 = -1;
        int t1 = -1;
        for (int i = 0; i < n; i++) {
            if (reqs[i]) {
                if (s[i] == 0) {
                    s0 = i;
                } else {
                    s1 = i;
                }
                rems.add(i);
            }
            if (reqt[i]) {
                if (t[i] == 0) {
                    t0 = i;
                } else {
                    t1 = i;
                }
                remt.add(i);
            }
        }
        if (rems.isEmpty() && remt.isEmpty()) {

        } else if (gs != -1 && gt != -1) {
            for (Integer i : rems) {
                res[i][gt] = s[i] == 3 ? 1 : 0;
            }
            for (Integer i : remt) {
                res[gs][i] = t[i] == 3 ? 1 : 0;
            }
        } else if (gs != -1) {
            if (remt.isEmpty()) {
                out.println(-1);
                return null;
            }
            for (Integer i : rems) {
                res[i][remt.get(0)] = s[i] == 3 ? 1 : 0;
            }
            for (Integer i : remt) {
                res[gs][i] = t[i] == 3 ? 1 : 0;
            }
        } else if (gt != -1) {
            if (rems.isEmpty()) {
                return null;
            }
            for (Integer i : rems) {
                res[i][gt] = s[i] == 3 ? 1 : 0;
            }
            for (Integer i : remt) {
                res[rems.get(0)][i] = t[i] == 3 ? 1 : 0;
            }
        } else {
            if (true) {
                return res;
            }
            if (rems.isEmpty() || remt.isEmpty()) {
                return null;
            }
            if ((s0 != -1 && s1 != -1) || (t0 != -1 && t1 != -1)) {
                for (Integer i : rems) {
                    for (Integer j : remt) {
                        res[i][j] = s[i] == 3 && t[j] == 3 ? 1 : 0;
                    }
                }
            } else if (s0 != -1 && t0 != -1) {

            } else if (s1 != -1 && t1 != -1) {
                for (Integer i : rems) {
                    for (Integer j : remt) {
                        res[i][j] = 1;
                    }
                }
            } else if (rems.size() == 1 || remt.size() == 1) {
                return null;
            } else {
                res[rems.get(0)][remt.get(0)] = 1;
                res[rems.get(1)][remt.get(1)] = 1;
                for (int i = 2; i < rems.size(); i++) {
                    for (int j = 2; j < remt.size(); j++) {
                        res[rems.get(i)][remt.get(j)] = 1;
                    }
                }
            }
        }
        return res;
    }

    boolean set(int i, int j, int x) {
        if (selected[i][j] && res[i][j] != x) {
            return true;
        }
        res[i][j] = x;
        selected[i][j] = true;
        return false;
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

    char[][] nextCharArray(int n, int m) {
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
