import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        public void solve(int testNumber, Reader in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            int[] weights = new int[n];
            int[] values = new int[n];
            int sValue = 0;
            for (int i = 0; i < n; ++i) {
                weights[i] = in.nextInt();
                values[i] = in.nextInt();
                sValue += values[i];
            }
            long[][] dp = new long[n + 1][sValue + 1];
            for (int i = 0; i <= n; ++i) {
                for (int j = 1; j <= sValue; ++j) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= sValue; ++j) {
                    if (values[i - 1] <= j) {
                        dp[i][j] = Math.min(dp[i - 1][j - values[i - 1]] + weights[i - 1], dp[i - 1][j]);
//                    dp[i][j] = min(x, dp[i][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            long ans = 0;
            for (int i = 1; i <= sValue; ++i) {
                if (dp[n][i] <= w) {
                    ans = Math.max(ans, i);
                }
            }
            out.println(ans);
        }

    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public Reader(InputStream in) {
            din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) {
            try {
                din = new DataInputStream(new FileInputStream(file_name));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        private void fillBuffer() {
            try {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) {
                    buffer[0] = -1;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private byte read() {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }
}

