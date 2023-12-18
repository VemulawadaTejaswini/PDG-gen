import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWeLikeAGC solver = new DWeLikeAGC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLikeAGC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            final long MOD = (long) 1e9 + 7;
            char[] ACGT = {'A', 'C', 'G', 'T'};
            // A0 C1 G2 T3
            long[][][][] dp = new long[N + 1][4][4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        // AGC
                        if (i == 0 && j == 2 && k == 1) continue;
                        // GAC
                        if (i == 2 && j == 0 && k == 1) continue;
                        // ACG
                        if (i == 0 && j == 1 && k == 2) continue;
                        dp[3][i][j][k]++;
//                    System.err.println("dp[3]["+ ACGT[i] + "][" + ACGT[j] + "][" + ACGT[k] + "]:" + dp[3][i][j][k]);
                    }
                }
            }
            for (int x = 4; x <= N; x++) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        for (int k = 0; k < 4; k++) {
                            // AGC
                            if (i == 0 && j == 2 && k == 1) continue;
                            // GAC
                            if (i == 2 && j == 0 && k == 1) continue;
                            // ACG
                            if (i == 0 && j == 1 && k == 2) continue;
                            // A[AGT]G[AGT]
                            if (i == 0 && j != 1 && k == 2) {
                                dp[x][i][j][k] += dp[x - 1][j][k][0] % MOD;
                                dp[x][i][j][k] += dp[x - 1][j][k][2] % MOD;
                                dp[x][i][j][k] += dp[x - 1][j][k][3] % MOD;
                                continue;
                            }
                            // AG[AGT][AGT]
                            if (i == 0 && j == 2 && k != 1) {
                                dp[x][i][j][k] += dp[x - 1][j][k][0] % MOD;
                                dp[x][i][j][k] += dp[x - 1][j][k][2] % MOD;
                                dp[x][i][j][k] += dp[x - 1][j][k][3] % MOD;
                                continue;
                            }
                            // その他
                            for (int l = 0; l < 4; l++) {
                                dp[x][i][j][k] += dp[x - 1][j][k][l] % MOD;
                            }
                        }
                    }
                }
            }
            long ans = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
//                    System.err.println("dp[N]["+ ACGT[i] + "][" + ACGT[j] + "][" + ACGT[k] + "]:" + dp[N][i][j][k]);
                        ans += dp[N][i][j][k] % MOD;
                    }
                }
            }
            out.println(ans % MOD);
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
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

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public long nextLong() {
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
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

