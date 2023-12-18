import java.util.*;
import java.lang.*;
import java.io.*;
//import java.util.stream.Collectors;
public class Main
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
//    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Scanner in = new Scanner(System.in);
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//    public static OutputStream out2 = new BufferedOutputStream (System.out);
    public static int n, m, i, j, k, u, v, t, mod = (int)1e9+7;
    public static String[] arr = new String[1005];
    public static long[][] dp = new long[1005][1005];
    public static void main(String[] args) throws IOException
    {
        n = in.nextInt();
        m = in.nextInt();
        sc.close();
        in.nextLine();
        for(i = 0; i < n; i++)
        {
            arr[i] = in.nextLine();
            Arrays.fill(dp[i], -1);
        }
        Arrays.fill(dp[n], -1);
        out.write(recur(0, 0)+"");
        out.flush();
    }
    public static long recur(int i, int j)
    {
        if(i == n-1 && j == m-1)
            return dp[i][j] = arr[i].charAt(j) == '.'? 1: 0;
        if(i == n-1)
        {
            if(arr[i].charAt(j) == '#') return 0;
            return dp[i][j] = recur(i, j+1) % mod;
        }
        if(j == m-1)
        {
            if(arr[i].charAt(j) == '#') return dp[i][j] = 0;
            return dp[i][j] = recur(i+1, j) % mod;
        }
        if(arr[i].charAt(j) == '#') return dp[i][j] = 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = (recur(i+1, j) + recur(i, j+1)) % mod;
    }
}
