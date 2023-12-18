import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;
    int[] t,x,y;

    private void solve() {
        N = nextInt();

        t = new int[N+1];
        x = new int[N+1];
        y = new int[N+1];

        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        for(int i = 1;i < N + 1;i++) {
            t[i] = nextInt();
            x[i] = nextInt();
            y[i] = nextInt();
        }

        for(int i = 1;i < N + 1;i++) {

            int dx = Math.abs(x[i] - x[i-1]);
            int dy = Math.abs(y[i] - y[i-1]);

            int d = dx + dy;
            int s = t[i] - t[i-1];

            if (s > d && (s - d) % 2 != 0) {
                out.println("No");
                return;
            }

            if (s < d) {
                out.println("No");
                return;
            }
        }

        out.println("Yes");
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