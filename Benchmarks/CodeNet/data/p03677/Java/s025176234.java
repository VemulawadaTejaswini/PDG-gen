import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static int mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        PriorityQueue<int[]> query = new PriorityQueue<>(Comparator.comparing(array -> array[0]));
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt() - 1;
        }
        long cost = 0;
        int c = 0;
        for (int i = 1; i < n; i++) {
            if ((a[i] + 1) % m != 0) {
                query.add(new int[] {(a[i] + 1) % m, (a[i] - a[i - 1] + m) % m});
            }
            if ((a[i - 1] + 1) % m != 0) {
                query.add(new int[] {(a[i - 1] + 1) % m, -(a[i] - a[i - 1] + m) % m});
            }
        }
        for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i]) {
                cost += a[i] + 1;
                c++;
            } else {
                cost += a[i] - a[i - 1];
            }
        }
        long ans = inf;
        for (int i = 0; i < m; i++) {
            while (!query.isEmpty() && query.peek()[0] == i) {
                int[] q = query.poll();
                if (q[1] < 0) {
                    c++;
                } else {
                    c--;
                    cost += q[1];
                }
            }
            ans = Math.min(ans, cost);
            cost -= c;
        }
        out.println(ans);
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
