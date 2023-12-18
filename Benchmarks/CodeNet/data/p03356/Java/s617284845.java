import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,M;
    int[] P;
    int[] x,y;

    int[] union;

    private void init(int N) {
        union = new int[N];
        for(int i = 0;i < N;i++) {
            union[i] = i;
        }
    }

    private int root(int a) {
        return union[a] == a ? a : root(union[a]);
    }

    private void unite(int a,int b) {

        a = root(a);
        b = root(b);

        if (a ==  b) {
            return;
        }

        if (a < b) {
            union[b] = a;
        } else {
            union[a] = b;
        }
    }

    private void solve() {
        N = nextInt();
        M = nextInt();

        P = new int[N];
        for(int i = 0;i < N;i++) {
            P[i] = nextInt()-1;
        }

        x = new int[M];
        y = new int[M];
        for(int i = 0;i < M;i++) {
            x[i] = nextInt()-1;
            y[i] = nextInt()-1;
        }

        init(N);

        for(int i = 0;i < M;i++) {
            unite(x[i],y[i]);
        }
        int ans = 0;
        for(int i = 0;i < N;i++) {
            if (i == P[i] || root(i) == root(P[i])) {
                ans++;
            }
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
