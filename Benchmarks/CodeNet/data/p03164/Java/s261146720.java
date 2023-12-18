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

    static final Reader in = new Reader();
    static int N, W; // ..maximum capacity of knapsack
    static int[] w; // ..weight array
    static int[] v; // .. value or price array
    static int sum;

    static long[][] dp;

    public static void main(String[] args) throws Exception {
        N = in.nextInt();
        W = in.nextInt();
        w = new int[N + 1];
        v = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
            sum += v[i];
        }

        dp = new long[N + 1][sum + 1];

        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE);
            dp[i][0] = 0;
        }

        for(int i = sum;i >= 0;i--)
        {
            if(K(N,i) <= W)
            {
                System.out.println(i);
                break;
            }
        }
        // for(int i = 0;i <= N;i++)
        // {
        //     for(int j = 0;j <= sum;j++)
        //         System.out.print(dp[i][j]+"\t");
        //     System.out.println();    
        // }

        // for(int i = sum;i >= 0;i--)
        // {
        //     if(dp[N][i] <= W){
        //         System.out.println(i);
        //         break;
        //     }
        // }
        
    }

    static long K(int i, int x) {
        // System.out.println("\t{i = "+i+" x = "+x);
        if (x == 0){
            // System.out.println("\treturn --> 0}");
            return 0;
           
        }

        if (i <= 0){
            // System.out.println("\treturn --> inf}");
            return Long.MAX_VALUE;
            
        }
        if(dp[i][x] != Long.MAX_VALUE)
            return dp[i][x];

        if (v[i] <= x) {
            long alpha = K(i - 1, x - v[i]);
            if(alpha != Long.MAX_VALUE)
                alpha += w[i];

            long beta =  K(i - 1, x);  


            dp[i][x] =  Math.min(alpha, beta);
        } else {
            dp[i][x] = K(i - 1, x);
        }
        // System.out.println("\treturn --> "+dp[i][x]+"}");
        return dp[i][x];
    }

}
