import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.PriorityQueue;

class Sushi implements Comparable<Sushi> {
    // ネタ おいしさ
    int t;
    int d;

    Sushi(int t, int d) {
        this.t = t;
        this.d = d;
    }

    // x.compereTo(y)
    // 降順
    // x は d
    // y は Sushi.d
    @Override
    public int compareTo(Sushi sushi) {
        return sushi.d - this.d;
    }
}

@SuppressWarnings("unchecked")
public class Main {
    static PriorityQueue<Integer>[] sushiList;
    static PriorityQueue<Integer>[] sushiTmp;

    static PriorityQueue<Sushi> s;
    static PriorityQueue<Sushi> sTmp;

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int N = nextInt();
        final int K = nextInt();

        // 降順
        s = new PriorityQueue<>();
        sTmp = new PriorityQueue<>();

        int kind = 0;

        for (int i = 0; i < N; i++) {
            // 0-indexed
            int t = nextInt() - 1;
            int d = nextInt();

            Sushi sushi = new Sushi(t, d);
            s.add(sushi);
            kind = Math.max(kind, t);
        }

        kind++;

        sushiList = new PriorityQueue[kind];
        sushiTmp = new PriorityQueue[kind];

        // 昇順
        for (int i = 0; i < kind; i++) {
            sushiList[i] = new PriorityQueue<>();
            sushiTmp[i] = new PriorityQueue<>();
        }

        boolean[] done = new boolean[kind];

        long cnt = 0;
        long deli = 0;

        for (int i = 0; i < K; i++) {
            Sushi x = s.poll();

            // 0-indexed
            sushiList[x.t].add(x.d);

            deli += x.d;

            // 0-indexed
            if (!done[x.t]) {
                done[x.t] = true;
                cnt++;
            }
        }

        long ans = deli + cnt * cnt;

        for (int i = 0; i < kind; i++) {
            long tmpcnt = 0;
            long curdeli = deli;

            while (done[i] && 1 < sushiList[i].size()) {
                while (0 < sushiList[i].size() && 0 < s.size()) {

                    Sushi b = s.poll();

                    if (!done[b.t]) {
                        done[b.t] = true;

                        int a = sushiList[i].poll();

                        tmpcnt++;
                        curdeli = curdeli - a + b.d;

                        long curcnt = cnt + tmpcnt;

                        if (ans < curdeli + curcnt * curcnt) {
                            sushiTmp[i].clear();

                            deli = curdeli;
                            cnt = curcnt;

                            ans = deli + cnt * cnt;

                            tmpcnt = 0;

                            sushiList[b.t].add(b.d);

                            while (0 < sTmp.size()) {
                                Sushi c = sTmp.poll();
                                sushiList[c.t].add(c.d);
                            }
                        } else {
                            sushiTmp[i].add(a);
                            sTmp.add(b);
                        }
                    }
                }
            }

            while (0 < sushiTmp[i].size()) {
                int x = sushiTmp[i].poll();
                sushiList[i].add(x);
            }

            while (0 < sTmp.size()) {
                Sushi x = sTmp.poll();
                done[x.t] = false;
                s.add(x);
            }
        }

        out.println(ans);

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;

    static boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    static int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    static String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    static long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
