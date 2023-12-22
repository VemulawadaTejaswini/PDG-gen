import java.util.*;
import java.io.*;

public class Main {
    static IO io = new IO();
    static int INF = 114514;
    public static void main(String[] args) {
        while (true) {

            int n = io.nextInt();
            int m = 0;
            if (n==0) break;
            int d[][] = new int[10][10];    // d[i][j]: ???i,j?????????????????¢
            int q[][] = new int[10][10];    // q[i][j]: ???i,j?????????????????¢
            for (int i=0; i<10; i++) {
                Arrays.fill(q[i], INF);
                q[i][i] = 0;
            }
            for (int i=0; i<n; i++) {
                int a = io.nextInt();
                int b = io.nextInt();
                int c = io.nextInt();
                d[a][b] = c;
                d[b][a] = c;
                m = Math.max(m, b);
            }
            Deque<int[]> que = new ArrayDeque<>();  // {????????????????§?????????????????????¢}
            int ans1 = 0;
            int ans2 = INF;
            // ???i??????j?????????????????¢????±???????
            for (int i=0; i<=m; i++) {
                que.offer(new int[] {i, 0});
                while (!que.isEmpty()) {
                    int poll[] = que.poll();
                    int now = poll[0];
                    int dis = poll[1];
                    for (int j=0; j<=m; j++) {
                        if (d[now][j]>0 && dis+d[now][j]<q[i][j]) {
                            q[i][j] = dis + d[now][j];
                            que.offer(new int[] {j, q[i][j]});
                        }
                    }
                }
                int tmp = 0;
                for (int j=0; j<=m; j++) tmp += q[i][j];
                if (tmp<ans2) {
                    ans1 = i;
                    ans2 = tmp;
                }
            }

            System.out.println(ans1 + " " + ans2);
        }
    }

    static class IO extends PrintWriter {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        IO() {
            this(System.in);
        }

        IO(InputStream source) {
            super(System.out);
            this.in = source;
        }

        boolean hasNextByte() {
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }

        int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            super.close();
            try {
                in.close();
            } catch (IOException ignored) {
            }
        }
    }
}