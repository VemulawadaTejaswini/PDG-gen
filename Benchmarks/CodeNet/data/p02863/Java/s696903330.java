import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static int inf = 0x7ffffff;

    void solve() {
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[][] ab = new int[n][2];
        for (int i = 0; i < n; i++) {
            ab[i][0] = scanner.nextInt();
            ab[i][1] = scanner.nextInt();
        }
        Arrays.sort(ab, Comparator.comparingInt(array -> array[0]));
        int[][] dp1 = new int[t * 3][n + 1];
        int[][] dp2 = new int[t * 3][n + 1];
        for (int i = 1; i < t * 3; i++) {
            for (int j = 0; j < n; j++) {
                if (0 <= i - ab[j][0]) {
                    dp1[i][j + 1] = dp2[i][j + 1] = dp2[i - ab[j][0]][j] + ab[j][1];
                }
            }
            for (int j = 1; j <= n; j++) {
                dp2[i][j] = Math.max(dp2[i][j - 1], dp2[i][j]);
            }
        }
        int max = 0;
        for (int i = 0; i < t * 3; i++) {
            for (int j = 0; j < n; j++) {
                if (i - ab[j][0] < t) {
                    max = Math.max(max, dp1[i][j + 1]);
                }
            }
        }
        System.out.println(max);
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
