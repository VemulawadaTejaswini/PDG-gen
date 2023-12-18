import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        InputStreamScanner in = new InputStreamScanner(System.in);
        new Main().solve(in, out);
        out.flush();
    }

    private void solve(InputStreamScanner in, PrintWriter out) {
        int n = in.nextInt();

        int[][][][] dp = new int[n + 1][4][4][4];
        dp[0][3][3][3] = 1;     // TTT
        // AGC, GAC, ACG, A_GC, AG_C
        // A:0, C:1, G:2, T:3
        for (int i = 0; i < n; i++) {
            for (int c4 = 0; c4 < 4; c4++) {
                for (int c3 = 0; c3 < 4; c3++) {
                    for (int c2 = 0; c2 < 4; c2++) {
                        for (int c1 = 0; c1 < 4; c1++) {
                            if ((c3 == 0 && c2 == 2 && c1 == 1)
                                    || (c3 == 2 && c2 == 0 && c1 == 1)
                                    || (c3 == 0 && c2 == 1 && c1 == 2)
                                    || (c4 == 0 && c2 == 2 && c1 == 1)
                                    || (c4 == 0 && c3 == 2 && c1 == 1)
                            ) {
                                continue;
                            }
                            dp[i + 1][c3][c2][c1] = (dp[i + 1][c3][c2][c1] + dp[i][c4][c3][c2]) % 1000000007;
                        }
                    }
                }
            }
        }

        int a = 0;
        for (int c3 = 0; c3 < 4; c3++) {
            for (int c2 = 0; c2 < 4; c2++) {
                for (int c1 = 0; c1 < 4; c1++) {
                    a = (a + dp[n][c3][c2][c1]) % 1000000007;
                }
            }
        }

        out.println(a);
    }

    static class InputStreamScanner {

        private InputStream in;

        private byte[] buf = new byte[1024];
        private int len = 0;
        private int off = 0;

        InputStreamScanner(InputStream in)	{
            this.in = in;
        }

        String next() {
            StringBuilder sb = new StringBuilder();
            for (int b = skip(); !isSpace(b);){
                sb.appendCodePoint(b);
                b = read();
            }
            return sb.toString();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        char nextChar() {
            return (char)skip();
        }

        int skip() {
            for (int b; (b = read()) != -1;) {
                if (!isSpace(b)) {
                    return b;
                }
            }
            return -1;
        }

        private boolean isSpace(int c) {
            return c < 33 || c > 126;
        }

        private int read() {
            if (len == -1) {
                throw new InputMismatchException("End of Input");
            }
            if (off >= len){
                off = 0;
                try {
                    len = in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException(e.getMessage());
                }
                if (len <= 0) {
                    return -1;
                }
            }
            return buf[off++];
        }
    }
}
