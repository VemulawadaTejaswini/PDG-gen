import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static long inf = 0x7ffffffffffffffL;

    void solve() {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        int[] count = new int[h];
        int first = -1;
        int[] wf = new int[h];
        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
            String t = scanner.next();
            count[i] = t.replace(".", "").length();
            s[i] = t;
            wf[i] = t.indexOf("#");
            if (first == -1 && count[i] != 0) {
                first = i;
            }
        }
        int[][] ans = new int[h][w];
        int index = 0;
        for (int i = 0; i < h; i++) {
            if (count[i] > 0) {
                int use = ++index;
                for (int j = 0; j < w; j++) {
                    if (s[i].charAt(j) == '#' && wf[i] != j) {
                        use = ++index;
                    }
                    ans[i][j] = use;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            if (count[i] == 0) {
                if (i < first) {
                    ans[i] = Arrays.copyOf(ans[first], w);
                } else {
                    ans[i] = Arrays.copyOf(ans[first], w);
                }
            } else {
                first = i;
            }
        }
        for (int i = 0; i < h; i++) {
            StringJoiner joiner = new StringJoiner(" ");
            for (int j = 0; j < w; j++) {
                joiner.add(Integer.toString(ans[i][j]));
            }
            System.out.println(joiner);
        }
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
