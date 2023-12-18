import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static int H;
    public static int W;

    public static void main(String[] args) throws IOException {
//        Reader sc = new Reader();
        Scanner sc = new Scanner(System.in);
        PrintWriter p = new PrintWriter(System.out);
        H = sc.nextInt();
        W = sc.nextInt();
        long[][] dp = new long[H+1][W+1];
        boolean[][] map = new boolean[H+1][W+1];

        // Scanner쓸대는 필요하지만,
        // Reader를 사용하면, nextLine()을 할 필요가 없음
        sc.nextLine();
        for(int i=1; i<=H; ++i) {
            String strLine = sc.nextLine();
            for(int j=1; j<=W; ++j) {
                char c = strLine.charAt(j-1);
                map[i][j] = (c=='.')? true: false;
            }
        }

        dp[1][1] = 1;

        long modulo = (long)(Math.pow(10, 9))+7;

        for(int i=1; i<=H; ++i) {
            for(int j=1; j<=W; ++j) {
                dp[i][j] += (map[i-1][j])? dp[i-1][j]: 0;
                dp[i][j] %= modulo;
                dp[i][j] += (map[i][j-1])? dp[i][j-1]: 0;
                dp[i][j] %= modulo;
            }
        }

        p.println(dp[H][W]);

        p.close();
    }

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

        public String nextLine() throws IOException
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
}
