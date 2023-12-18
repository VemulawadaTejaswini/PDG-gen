import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static long inf = 0x7ffffffffffffffL;

    void solve() {
        int m = scanner.nextInt();
        int[] d = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            d[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }
        int[][] use = new int[10][10];
        int[][] edges = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j < 10) {
                    edges[i][j] = i + j;
                    use[i][j] = 1;
                } else {
                    use[i][j] = 2;
                    edges[i][j] = i + j - 9;
                }
            }
        }
        long count = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            while (c[i] >= 1) {
                if (c[i] % 2 == 1) {
                    deque.addLast(d[i]);
                }
                count += use[d[i]][d[i]] * (c[i] / 2);
                c[i] /= 2;
                d[i] = edges[d[i]][d[i]];
            }
        }
        while (deque.size() >= 2) {
            Integer p1 = deque.poll();
            Integer p2 = deque.poll();
            count += use[p1][p2];
            deque.addFirst(edges[p1][p2]);
        }
        System.out.println(count);
    }

    public static void main(String[]$) throws Exception {
        new Main().solve();
        System.out.flush();
    }
}

class System {
    static PrintWriter out = new PrintWriter(java.lang.System.out);

    static void exit() {
        java.lang.System.exit(0);
    }
}

class Scanner {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(java.lang.System.in), 0x10000);
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
