import java.util.*;
import java.io.*;

class Main {

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    // static final Reader in = new Reader();
    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out);
    static int N, W;
    static final long MOD = 1000000007;
    static char[][] a;
    static double[][] dp;
    static double[] p;
    static double[] pre;

    static double P(int i, int n) {
        // System.out.println("i = "+i+" n = "+n);
        if (i == -1 || n == 0)
            return 1;

        if (n == i + 1)
            return pre[i];

        if (n != -1 && dp[i][n] != -1)
            return dp[i][n];

        double consider = P(i - 1, n - 1);
        double ignore = P(i - 1, n);
        // System.out.println("i = "+i+" n = "+n+" consider = "+consider+" ignore =
        // "+ignore+" returning --> "+((consider*p[i]) + (ignore * (1 - p[i]))));
        dp[i][n] = (consider * p[i]) + (ignore * (1 - p[i]));
        return dp[i][n];

    }

    public static void main(String[] args) throws Exception {
        N = in.nextInt();
        p = new double[N];
        pre = new double[N];
        dp = new double[N][N];

        dp[0][0] = 1;
        for(int i = 0;i < N;i++){
            dp[i][0] = 1; 
        }
        p[0] = in.nextDouble();
        pre[0] = p[0];
        Arrays.fill(dp[0], -1);
        for (int i = 1; i < N; i++) {
            p[i] = in.nextDouble();
            pre[i] = pre[i - 1] * p[i];
            Arrays.fill(dp[i], -1);
        }

        System.out.println(P(N - 1, N / 2 + 1));

        out.close();

    }

}
