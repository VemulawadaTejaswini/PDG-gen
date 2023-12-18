import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        long m = in.nextLong();
        int v = in.nextInt();
        int p = in.nextInt();
        long[] a = in.nextLongArray(n);
        long[] s = Arrays.copyOf(a, n);
        sort(s, Comparator.reverseOrder());
        TreeMap<Long, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int sum = 0;
        long border = -1;
        long ans = 0;
        long ok = 0;
        int ch = 0;
        Map.Entry<Long, Integer> last = null;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
            if (border == -1) {
                ans += entry.getValue();
                if (p < sum) {
                    border = entry.getKey();
                } else {
                    ch += entry.getValue();
                    v -= entry.getValue();
                }
                last = entry;
                continue;
            }
            int rem = n - sum + entry.getValue();
            long vote = (v - rem) * m;
            ok += m * last.getValue() - (sum - ch - entry.getValue()) * (last.getKey() - entry.getKey());
            if (vote <= ok) {
                ans += entry.getValue();
            }
            last = entry;
        }
        out.println(ans);
    }

    static void sort(long[] a, Comparator<Long> comparator) {
        Long[] b = new Long[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b, comparator);
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
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
