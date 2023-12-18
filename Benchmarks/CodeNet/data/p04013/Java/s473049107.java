import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int N = nextInt();

        final int A = nextInt();

        int[] x = new int[N];

        int X = 0;

        for (int i = 0; i < N; i++) {
            x[i] = nextInt() - A;
            X = Math.max(X, Math.abs(x[i]));
        }

        // Dynamic Programming
        // dp[i, x, j] i番目までのうち、x個を選び、合計がjになる。
        // 全てから平均のAを引いた場合、平均は0となり、
        // 何個(x個)選ぶかは平均を求めるのに必要がない。
        // xを割愛すると、dp[i, j]の2次元となる。

        // from zero to N
        final int MAX_I = N + 1;

        // negative & zero & positive
        final int MAX_J = 2 * N * X + 1;

        long[][] dp = new long[MAX_I][MAX_J];

        // Not select anything
        // Initialization
        Arrays.fill(dp[0], 0);

        // sum zero
        dp[0][N * X]++;

        for (int i = 1; i < MAX_I; i++) {
            for (int j = 0; j < MAX_J; j++) {
                if (j < x[i - 1]
                    || MAX_J <= j - x[i - 1]) {
                    // It can not be an average value
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Make average value
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - x[i - 1]];
                }
            }
        }

        out.println(dp[N][N * X] - 1);

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
