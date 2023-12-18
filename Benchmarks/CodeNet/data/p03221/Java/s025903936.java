import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,M;
    Pair[] pairs;

    private class Pair  {
        int n,p,y;
        public Pair(int n,int p,int y) {
            this.n = n;
            this.p = p;
            this.y = y;
        }
    }

    private void solve() {
        N = nextInt();
        M = nextInt();

        pairs = new Pair[M];
        for(int i = 0;i < M;i++) {
            int P = nextInt();
            int Y = nextInt();

            pairs[i] = new Pair(i, P, Y);
        }

        Arrays.sort(pairs, (p1, p2) -> {
            if (p1.p == p2.p) {
                return p1.y - p2.y;
            }

            return p1.p - p2.p;
        });

        int[] seq = new int[N + 1];
        String[] ans = new String[M];
        for(int i = 0;i < M;i++) {
            seq[pairs[i].p]++;

            ans[pairs[i].n] = String.format("%06d%06d", pairs[i].p, seq[pairs[i].p]);
        }

        for(int i = 0;i < M;i++) {
            out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
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
