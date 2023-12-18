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
    static int H, W;
    static final long MOD = 1000000007;
    static char[][] a;
    static long[][] dp;

    static long grid(int i, int j) {
        // System.out.println("i = "+i+" j = "+j);

        if (j >= W || i >= H || (a[i][j] == '#'))
            return 0;

        if (i == H - 1 && j == W - 1)
            return 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        long right = grid(i, j + 1);

        long down = grid(i + 1, j);

        dp[i][j] = (right + down) % MOD;

        return dp[i][j];
    }

    static long P_topDown(){
        //..the base case for the bottom-right cell
        dp[H-1][W-1] = 1;

        for(int i = H-1;i >= 0;i--){
            for(int j = W-1;j >= 0;j--){
                if(a[i][j] =='#'){
                    dp[i][j] = 0;
                    continue;
                }

                if(i < H-1)
                    dp[i][j] += dp[i+1][j] % MOD;
                if(j < W-1)
                    dp[i][j] += dp[i][j+1] % MOD ;  
            }

        }

        return dp[0][0] % MOD;

    }

    public static void main(String[] args) throws Exception {
        H = in.nextInt();
        W = in.nextInt();
        a = new char[H][W];
        dp = new long[H][W];

        for (int i = 0; i < H; i++) {
            a[i] = in.next().toCharArray();
            Arrays.fill(dp[i], 0);
        }

        System.out.println(P_topDown());

        out.close();

    }

}
