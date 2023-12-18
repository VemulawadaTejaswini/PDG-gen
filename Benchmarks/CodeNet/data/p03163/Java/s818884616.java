import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Long.max;

public class Main {
    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ni() {
            return Integer.parseInt(next());
        }

        public long nl() {
            return Long.parseLong(next());
        }

    }

    public static void main(String[] args) throws IOException {
        int N, W;
        int[] ws;
        long[] vs;

//        Reader sc = new Reader();
        InputReader sc = new InputReader(System.in);
//        N = sc.nextInt();
//        W = sc.nextInt();
        N = sc.ni();
        W = sc.ni();
        PrintWriter pw = new PrintWriter(System.out);

        ws = new int[N+1];
        vs = new long[N+1];

        for(int i=1; i<=N; ++i) {
            ws[i] = sc.ni();
            vs[i] = sc.nl();
        }

        pw.println(Knapsack_1(N, W, ws, vs));
        pw.close();
    }

    public static long Knapsack_1(int N, int W, int[] ws, long[] vs) {
        long[][] dp;
        dp = new long[N+1][W+1];

        for(int i=1; i<=N; ++i) {
            for(int w=1; w<=W; ++w) {
//                dp[i][w] = Math.max(dp[i-1][w], (w-ws[i]>=0)? dp[i-1][w-ws[i]] + vs[i]: 0);
                dp[i][w] = max(dp[i-1][w], (w-ws[i]>=0)? dp[i-1][w-ws[i]] + vs[i]: 0L);
            }
        }

        return dp[N][W];
    }
}
