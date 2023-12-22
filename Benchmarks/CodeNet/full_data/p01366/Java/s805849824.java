import java.util.*;
import java.io.*;

public class Main {
    private static IO io = new IO();
    private static List<Integer> g[] = new ArrayList[10001];
    private static int cost[] = new int[10001]; // ????????????????°??????????
    private static int min[] = new int[10001];  // ???1,i?????????????????¢
    private static int INF = 1145141919;
    // ?????¢?????????????????????
    private static PriorityQueue<int[]> que = new PriorityQueue<>(10001, new Comparator<int[]>() {
        public int compare (int a[], int b[]) {
            return a[0]-b[0];	// ?¬¬1????????§???????????????
        }
    });
    public static void main(String[] args) {
        while (true) {

            int n = io.nextInt();
            int m = io.nextInt();
            if (n==0 && m==0) break;
            // ?????????
            Arrays.fill(min, INF);
            Arrays.fill(cost, INF);
            min[1] = 0;
            cost[1] = 0;
            for (int i=0; i<=n; i++) g[i] = new ArrayList<Integer>();
            // input
            for (int i = 0; i < m; i++) {
                int ui = io.nextInt();
                int vi = io.nextInt();
                int di = io.nextInt();
                int ci = io.nextInt();
                g[ui].add(vi);
                g[ui].add(di);
                g[ui].add(ci);
                g[vi].add(ui);
                g[vi].add(di);
                g[vi].add(ci);
            }
            // ???????????????????????§???????????¢&????°???????????????????????±???????
            int ans = 0;
            que.offer(new int[] {0,0,1});
            while (!que.isEmpty()) {
                int poll[] = que.poll();
                int dis = poll[0];
                int cos = poll[1];
                int now = poll[2];
                // ???????????¢??????????????£??????????????????
                if (min[now]<dis) continue;
                // ???????????¢??\????????£?????????????????¢??¨????°???????????????´??°??????????????????????????????
                // ???????????¨???????????????????????????????????????????????¨????????????????????????2????????????????????????????????????
                for (int i = 0; i < g[now].size(); i+=3) {
                    int go = g[now].get(i);
                    int god = g[now].get(i+1);
                    int goc = g[now].get(i+2);
                    if (dis+god<min[go]) {
                        cost[go] = cos + goc;
                        min[go] = dis + god;
                        que.offer(new int[] {min[go], 0, go});
                        //System.out.println(now + "??????" + go + "?????????");
                        //System.out.println("1???" + go + "???????????????" + cost[go] + "?????´??°??????");
                    } else if (dis+god==min[go]) {
                        cost[go] = Math.min(cost[go], cos + goc);
                        que.offer(new int[] {min[go], 0, go});
                        //System.out.println(now + "??????" + go + "?????????");
                        //System.out.println("1???" + go + "???????????????" + cost[go] + "?????´??°??????");
                    }
                }
            }
            for (int i = 2; i <= n; i++) ans += cost[i];
            System.out.println(ans);
            //System.out.println(Arrays.toString(cost));
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