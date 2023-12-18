import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Integer[] reqNum = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
            int[] a = in.nextIntArray(m);
            Arrays.sort(a);

            int[][] dp = new int[n + 1][m + 1];

            for (int i = n; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    int ca = a[j];
                    int cn = i + reqNum[ca];
                    if (cn > n || (cn < n && dp[cn][m] == 0))
                        continue;

                    int[] count = new int[m + 1];
                    System.arraycopy(dp[cn], 0, count, 0, m + 1);

                    count[m]++;

                    if (count[m] < dp[i][m])
                        continue;

                    count[j]++;

                    boolean bigger = true;
                    for (int k = m; k >= 0; k--) {
                        if (count[k] > dp[i][k])
                            break;
                        if (count[k] < dp[i][k]) {
                            bigger = false;
                            break;
                        }
                    }
                    if (bigger)
                        dp[i] = count;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = m - 1; i >= 0; i--)
                for (int j = 0; j < dp[0][i]; j++)
                    sb.append(a[i]);
            out.println(sb);
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
            this.bufPointer = 0;
            this.bufLength = 0;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int nextInt() {
            int n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

    }
}

