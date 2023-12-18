import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    int[] a, b;
    void solve() {
        int n = in.nextInt();
        a = in.nextIntArray(n);
        b = in.nextIntArray(n);
        int ans = -1;
        for (int i = 0; i < 1 << n; i++) {
            int mask = 0;
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    if (get(i, k) > get(i, j)) {
                        mask ^= 1 << j;
                        mask ^= 1 << k;
                        count++;
                    }
                }
            }
            int xor = mask ^ i;
            int[] c = new int[51];
            for (int j = 0; j < n; j++) {
                c[get(i, j)] ^= (xor >> j) & 1;
            }
            int add = 0;
            for (int j = 0; j < n; j++) {
                if (((xor >> j) & 1) == 1) {
                    xor ^= 3 << j;
                    add++;
                }
            }
            boolean can = true;
            for (int j : c) {
                can &= j == 0;
            }
            if (i != mask && can) {
                count += add;
                ans = ans == -1 ? count : Math.min(ans, count);
            }
            if (i == mask) {
                ans = ans == -1 ? count : Math.min(ans, count);
            }
        }
        out.println(ans);
    }

    int get(int flags, int i) {
        return ((flags >> i) & 1) == 1 ? b[i] : a[i];
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
    private static PrintWriter out = new PrintWriter(System.out);

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
    }

    void flush() {
        out.flush();
    }
}
