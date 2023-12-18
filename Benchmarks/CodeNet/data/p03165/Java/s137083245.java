import java.util.*;
import java.lang.*;
import java.io.*;
//import java.util.stream.Collectors;
public final class ProblemA
{
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
            }
            while ((c = read()) >= '0' && c <= '9');
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
            }
            while ((c = read()) >= '0' && c <= '9');

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

     public static Reader sc = new Reader();
//    public static Scanner sc = new Scanner(System.in);
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//    public static OutputStream out2 = new BufferedOutputStream (System.out);
    public static int n, m, i, j, k, t, mod = (int)1e9+7;
    public static int[][] state = new int[3005][3005];
    public static long[][] dp = new long[3005][3005];
    public static void main(String[] args) throws IOException
    {
        String s = sc.readLine(), t = sc.readLine();
        n = s.length();
        m = t.length();
        for(i = 1; i <= n; i++)
        {
            for (j = 1; j <= m; j++)
            {
                if (s.charAt(i-1) == t.charAt(j-1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    state[i][j] = 1;
                }
                else if (dp[i - 1][j] >= dp[i][j - 1])
                {
                    dp[i][j] = dp[i - 1][j];
                    state[i][j] = 2;
                }
                else
                {
                    dp[i][j] = dp[i][j - 1];
                    state[i][j] = 3;
                }
            }
        }
        i = n;
        j = m;
        StringBuilder answer = new StringBuilder();
        while (i > 0 && j > 0)
        {
            if(state[i][j] == 1)
            {
                answer.append(s.charAt(i - 1));
                i--;
                j--;
            }
            else if(state[i][j] == 2)
                i -= 1;
            else
                j -= 1;
        }
        answer.reverse();
        out.write(String.valueOf(answer));
        out.flush();
    }
}

