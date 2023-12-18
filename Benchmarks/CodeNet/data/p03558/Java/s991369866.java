import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int K;

    private class P implements Comparable<P> {
        int m;
        long c;

        public P(int m,long c) {
            this.m = m;
            this.c = c;
        }

        public int compareTo(P p) {
            return Long.compare(this.c,p.c);
        }
    }

    private void solve() {
        K = nextInt();

        PriorityQueue<P> pq = new PriorityQueue<>();
        pq.add(new P(1,1));

        long[] min = new long[K];
        Arrays.fill(min,Long.MAX_VALUE / 2);

        long ans = Long.MAX_VALUE;
        while(pq.size() > 0) {

            P p = pq.poll();

            if (min[p.m] <= p.c) {
                continue;
            }

            min[p.m] = p.c;
            if (p.m == 0) {
                ans = Math.min(ans,p.c);
            }

            pq.add(new P((p.m + 1) % K,p.c + 1));
            pq.add(new P((p.m * 10) % K,p.c));
        }

        out.println(ans);
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}