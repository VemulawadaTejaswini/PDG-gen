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
        List<Long> all = new ArrayList<>();
        List<Long> neg = new ArrayList<>();
        List<Long> pos = new ArrayList<>();
        int zero = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                all.add(a[i]);
                m++;
            }
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
        } else if (n == k) {
            long ans = 1;
            boolean sign = false;
            for (int i = 0; i < n; i++) {
                ans = ans * Math.abs(a[i]) % mod;
                if (a[i] < 0) {
                    sign = !sign;
                }
            }
            f(sign, ans);
        } else {
            all.sort(Comparator.comparingLong(Math::abs));
            boolean[] sign = new boolean[m];
            for (int i = 0; i < m; i++) {
                if (all.get(i) < 0) {
                    sign[i] = true;
                }
            }
            long ans = -inf;
            {
                long now = 1;
                int nn = 0;
                int lastNeg = -1;
                int lastPos = -1;
                boolean ss = false;
                for (int i = m - 1; i >= 0; i--) {
                    if (sign[i]) {
                        ss = !ss;
                        lastNeg = i;
                    } else {
                        lastPos = i;
                    }
                    now = now * Math.abs(all.get(i));
                    nn++;
                    if (nn == k && !ss) {
                        ans = now;
                        break;
                    }
                    if (nn == k && ss) {
                        int nextPos = -1;
                        int nextNeg = -1;
                        for (int j = i - 1; j >= 0; j--) {
                            if (sign[j]) {
                                if (nextNeg == -1) {
                                    nextNeg = j;
                                }
                            } else {
                                if (nextPos == -1) {
                                    nextPos = i;
                                }
                            }
                        }
                        if (nextPos != -1 && lastNeg != -1 && nextNeg != -1 && lastPos != -1) {
                            if (Math.abs(all.get(nextPos)) * Math.abs(all.get(lastPos)) > Math.abs(all.get(nextNeg)) * Math.abs(all.get(lastNeg))) {
                                ans = now * Math.abs(all.get(nextPos)) * Combination.inv(Math.abs(all.get(lastNeg)));
                            } else {
                                ans = now * Math.abs(all.get(nextNeg)) * Combination.inv(Math.abs(all.get(lastPos)));
                            }
                        } else if (nextPos != -1 && lastNeg != -1) {
                            ans = now * Math.abs(all.get(nextPos)) * Combination.inv(Math.abs(all.get(lastNeg)));
                        } else if (nextNeg != -1 && lastPos != -1) {
                            ans = now * Math.abs(all.get(nextNeg)) * Combination.inv(Math.abs(all.get(lastPos)));
                        }
                        break;
                    }
                }
            }
            if (ans == -inf) {
                long now = 1;
                int nn = 0;
                int lastNeg = -1;
                int lastPos = -1;
                boolean ss = false;
                for (int i = 0; i < m; i++) {
                    if (sign[i]) {
                        ss = !ss;
                        lastNeg = i;
                    } else {
                        lastPos = i;
                    }
                    now = now * Math.abs(all.get(i));
                    nn++;
                    if (nn == k && ss) {
                        ans = now;
                        break;
                    }
                    if (nn == k && !ss) {
                        int nextPos = -1;
                        int nextNeg = -1;
                        for (int j = i - 1; j >= 0; j--) {
                            if (sign[j]) {
                                if (nextNeg == -1) {
                                    nextNeg = j;
                                }
                            } else {
                                if (nextPos == -1) {
                                    nextPos = i;
                                }
                            }
                        }
                        if (nextPos != -1 && lastNeg != -1 && nextNeg != -1 && lastPos != -1) {
                            if (Math.abs(all.get(nextPos)) * Math.abs(all.get(lastPos)) < Math.abs(all.get(nextNeg)) * Math.abs(all.get(lastNeg))) {
                                ans = now * Math.abs(all.get(nextPos)) * Combination.inv(Math.abs(all.get(lastNeg)));
                            } else {
                                ans = now * Math.abs(all.get(nextNeg)) * Combination.inv(Math.abs(all.get(lastPos)));
                            }
                        } else if (nextPos != -1 && lastNeg != -1) {
                            ans = now * Math.abs(all.get(nextPos)) * Combination.inv(Math.abs(all.get(lastNeg)));
                        } else if (nextNeg != -1 && lastPos != -1) {
                            ans = now * Math.abs(all.get(nextNeg)) * Combination.inv(Math.abs(all.get(lastPos)));
                        }
                        break;
                    }
                }
                if (zero > 0) {
                    out.println(0);
                } else {
                    f(true, ans);
                }
            } else {
                f(false, ans);
            }
        }
    }

    void f(boolean sign, long value) {
        out.println(sign ? (-value + mod) % mod : value % mod);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Combination {
    private static List<Long> fact = new ArrayList<>();
    private static List<Long> invFact = new ArrayList<>();

    private static void build(int n) {
        if (fact.isEmpty()) {
            fact.add(1L);
            invFact.add(1L);
        }
        for (int i = fact.size(); i <= n; i++) {
            fact.add(fact.get(i - 1) * i % Main.mod);
            invFact.add(pow(fact.get(i), Main.mod - 2));
        }
    }

    private static void rangeCheck(long n, long r) {
        if (n < r) {
            throw new IllegalArgumentException("n < r");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (r < 0) {
            throw new IllegalArgumentException("r < 0");
        }
    }

    static long fact(int n) {
        build(n);
        return fact.get(n);
    }

    static long invFact(int n) {
        build(n);
        return invFact.get(n);
    }

    static long comb(int n, int r) {
        rangeCheck(n, r);
        return fact(n) * invFact(r) % Main.mod * invFact(n - r) % Main.mod;
    }

    static long comb(long n, long r) {
        rangeCheck(n, r);
        if (n < 1000000) {
            return comb((int)n, (int)r);
        }
        r = Math.min(r, n - r);
        long x = 1, y = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % Main.mod;
            y = y * i % Main.mod;
        }
        return x * inv(y) % Main.mod;
    }

    static long perm(int n, int r) {
        rangeCheck(n, r);
        return fact(n) * invFact(n - r) % Main.mod;
    }

    static long perm(long n, long r) {
        rangeCheck(n, r);
        if (n < 1000000) {
            return perm((int)n, (int)r);
        }
        long x = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % Main.mod;
        }
        return x;
    }

    static long homo(int n, int r) {
        return r == 0 ? 1 : comb(n + r - 1, r);
    }

    static long homo(long n, long r) {
        return r == 0 ? 1 : comb(n + r - 1, r);
    }

    static long inv(long a) {
        return pow(a, Main.mod - 2);
    }

    static long pow(long a, long b) {
        long x = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                x = x * a % Main.mod;
                b--;
            } else {
                a = a * a % Main.mod;
                b /= 2;
            }
        }
        return x;
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
