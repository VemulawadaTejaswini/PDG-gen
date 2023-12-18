import java.io.*;
import java.util.*;

public class Main {
    private static final int max = (int) 1e6 + 1;
    private static int[] prime = new int[max];
    public static void main(String args[]) throws IOException {
        Reader in = new Reader();
        PrintWriter out = new PrintWriter(System.out);
        boolean[] vmin = new boolean[8];
        boolean[] vmax = new boolean[8];
        int ans1 = 0, ans2 = 0;
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] <= 399) {
                vmin[0] = true;
                vmax[0] = true;
            }
            else if (a[i] <= 799) {
                vmin[1] = true;
                vmax[1] = true;
            }
            else if (a[i] <= 1199) {
                vmin[2] = true;
                vmax[2] = true;
            }
            else if (a[i] <= 1599) {
                vmin[3] = true;
                vmax[3] = true;
            }
            else if (a[i] <= 1999) {
                vmin[4] = true;
                vmax[4] = true;
            }
            else if (a[i] <= 2399) {
                vmin[5] = true;
                vmax[5] = true;
            }
            else if (a[i] <= 2799) {
                vmin[6] = true;
                vmax[6] = true;
            }
            else if (a[i] <= 3199) {
                vmin[7] = true;
                vmax[7] = true;
            }
            else {
                boolean okay = true;
                for (int u = 0; u  < 8; u++) {
                    if (vmin[u]) {
                        okay = false;
                        break;
                    }
                }
                if (okay) {
                    vmin[0] = true;
                }
                for (int u = 0; u < 8; u++) {
                    if (!vmax[u]) {
                        vmax[u] = true;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            if (vmin[i]) {
                ++ans1;
            }
            if (vmax[i]) {
                ++ans2;
            }
        }
        out.println(ans1 + " " + ans2);
        out.close();
    }

    private static void sieve() {
        for (int i = 2; i < max; i++) {
            if (prime[i] == 0) {
                prime[i] = i;
                for (int j = 2 * i; j < max; j += i) {
                    prime[j] = i;
                }
            }
        }
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

        public String next() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == ' ')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
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