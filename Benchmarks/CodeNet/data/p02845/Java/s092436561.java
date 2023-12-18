import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = scanner.nextInt();
        int[] a = scanner.nextIntArray(n);
        long ans = 1;
        int[] count = new int[3];
        for (int i = 0; i < n; i++) {
            int mul = 0;
            if (count[0] == a[i]) {
                count[0]++;
                mul++;
            }
            if (count[1] == a[i]) {
                if (mul == 0) {
                    count[1]++;
                }
                mul++;
            }
            if (count[2] == a[i]) {
                if (mul == 0) {
                    count[2]++;
                }
                mul++;
            }
            ans = ans * mul % mod;
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
