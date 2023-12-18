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
    static int N, W;
    static int[] w;
    static int[] v;
    static int[] c;
    static HashSet<Integer> items_set = new HashSet<>();

    static long[][] dp;

    public static void main(String[] args) throws Exception {
        N = in.nextInt();
        W = in.nextInt();
        w = new int[N];
        v = new int[N];

        dp = new long[N][W+1];

        for (int i = 0; i < N; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
            items_set.add(i);
        }

        System.out.println(getAns(-1, W));
    }

    static long getAns(int item, int W) {
        // System.out.println("item = " + item + " W = " + W + " item_set = " + items_set);
		if(dp[item][W] != -1)
          return dp[item][W];
        items_set.remove(item);
        List<Integer> list_items = new ArrayList<>();
        list_items.addAll(items_set);
        long max = 0;

        for (int itm : list_items) {
            // System.out.println("\titem = " + item + " itm = " + itm + " max " + max);
            if (W - w[itm] >= 0) {
                if(dp[itm][W - w[itm]] == 0L)
                    dp[itm][W - w[itm]] = getAns(itm, W - w[itm]);
                long val = dp[itm][W - w[itm]];
                max = Math.max(max, val + v[itm]);
            }
        }

        if (item != -1)
            items_set.add(item);

        return max;
    }

}
