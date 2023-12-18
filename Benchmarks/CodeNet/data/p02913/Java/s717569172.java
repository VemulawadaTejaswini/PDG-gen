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
        String s = in.next();
        RollingHash rollingHash = new RollingHash(s);
        for (int i = n; i > 0; i--) {
            Map<Long, Integer> set = new HashMap<>();
            boolean has = false;
            for (int j = 0; i + j <= n; j++) {
                long slice = rollingHash.slice(j, i);
                if (set.containsKey(slice) && set.get(slice) + i <= j) {
                    has = true;
                }
                if (!set.containsKey(slice)) {
                    set.put(slice, j);
                }
            }
            if (has) {
                out.println(i);
                return;
            }
        }
        out.println(0);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class RollingHash {
    private static final long mask30 = 0x3fffffff;
    private static final long mask31 = 0x7fffffff;
    private static final long mod = 0x1fffffffffffffffL;
    private static final long positivizer = 0xdffffffffffffff9L;
    private int base;
    private long[] hash;
    private List<Long> pow = new ArrayList<>(Collections.singleton(1L));

    RollingHash(String s) {
        base = new Random().nextInt(Integer.MAX_VALUE - 129) + 129;
        hash = new long[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            hash[i + 1] = mod(mul(hash[i], base) + s.charAt(i));
        }
    }

    long slice(int begin, int length) {
        return mod(hash[begin + length] + positivizer - mul(hash[begin], pow(length)));
    }

    private long mul(long l, long r) {
        long lu = l >> 31;
        long ld = l & mask31;
        long ru = r >> 31;
        long rd = r & mask31;
        long middle = ld * ru + lu * rd;
        return ((lu * ru) << 1) + ld * rd + ((middle & mask30) << 31) + (middle >> 30);
    }

    private long mod(long x) {
        x = (x & mod) + (x >> 61);
        return x >= mod ? x - mod : x;
    }

    private long pow(int x) {
        return x + (int)(Math.random() * 10000000);
//        while (pow.size() <= x) {
//            pow.add(mod(mul(pow.get(pow.size() - 1), base)));
//        }
//        return pow.get(x);
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
