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
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    int n;
    void solve() {
        n = in.nextInt();
        long k = in.nextLong() - 1;
        int[] a = in.nextIntArray(n);
        int[][] table = new int[n][50];
        Map<Integer, Integer> first = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            first.put(a[i], i);
        }
        Map<Integer, Integer> last = new HashMap<>();
        boolean flag = false;
        for (int i = n - 1; i >= 0; i--) {
            if (last.containsKey(a[i])) {
                int next = last.get(a[i]) + 1;
                if (next == n) {
                    table[i][0] = 0;
                } else {
                    table[i][0] = table[next][0];
                }
            } else {
                int next = first.get(a[i]) + 1;
                if (next == n) {
                    flag = true;
                    table[i][0] = n;
                } else {
                    table[i][0] = next;
                }
            }
            last.put(a[i], i);
        }
        int f = 0;
        for (int i = 1; i < 50; i++) {
            if (flag) {
                for (int j = 0; j < n; j++) {
                    if (table[j][i - 1] == n) {
                        table[j][i] = f;
                    } else {
                        table[j][i] = table[table[j][i - 1]][i - 1];
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    table[j][i] = table[table[j][i - 1]][i - 1];
                }
            }
            f = table[f][i - 1];
        }
        int now = 0;
        while (k > 0) {
            int i = Long.bitCount(Long.highestOneBit(k) - 1);
            now = table[now][i];
            if (now == n) {
                now = 0;
                k--;
            }
            k -= 1L << i;
        }
        Deque<Integer> naive = naive(a, now);
        while (!naive.isEmpty()) {
            Integer v = naive.pollFirst();
            out.println(v);
        }
    }

    Deque<Integer> naive(int[] a, int s) {
        boolean[] has = new boolean[200002];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = s; i < n; i++) {
            if (has[a[i]]) {
                while (!deque.isEmpty()) {
                    Integer v = deque.pollLast();
                    has[v] = false;
                    if (v == a[i]) {
                        break;
                    }
                }
            } else {
                has[a[i]] = true;
                deque.addLast(a[i]);
            }
        }
        return deque;
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
