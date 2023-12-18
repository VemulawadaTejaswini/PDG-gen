import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static int inf = 0x7ffffff;

    void solve() {
        String a = scanner.next();
        int n = a.length();
        int[] k = new int[n + 1];
        boolean[] used = new boolean[26];
        int[][] p = new int[26][n + 1];
        for (int i = 0; i < 26; i++) {
            p[i][n] = n;
        }
        int rem = 26;
        for (int i = n - 1, j = 1; i >= 0; i--) {
            for (int l = 0; l < 26; l++) {
                if (a.charAt(i) - 'a' == l) {
                    p[l][i] = i + 1;
                } else {
                    p[l][i] = p[l][i + 1];
                }
            }
            if (!used[a.charAt(i) - 'a']) {
                used[a.charAt(i) - 'a'] = true;
                rem--;
            }
            if (rem == 0) {
                j++;
                used = new boolean[26];
                rem = 26;
            }
            k[i] = j;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0, j = 0; i < k[0]; i++) {
            for (int c = 0; c < 26; c++) {
                if (k[j] - 1 == k[p[c][j]]) {
                    ans.appendCodePoint(c + 'a');
                    j = p[c][j];
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[]$) {
        try {
            new Main().solve();
            System.out.flush();
        } catch (Throwable t) {
            System.out.flush();
            t.printStackTrace();
        }
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
