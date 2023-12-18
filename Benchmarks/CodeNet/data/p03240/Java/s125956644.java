import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;
    int[] x,y,h;
    private void solve() {
        N = nextInt();
        x = new int[N];
        y = new int[N];
        h = new int[N];

        for(int i = 0;i < N;i++) {
            x[i] = nextInt();
            y[i] = nextInt();
            h[i] = nextInt();
        }

        for(int i = 0;i <= 100;i++) {
            for(int j = 0;j <= 100;j++) {
                boolean ok = true;
                int tmp = h[0] + Math.abs(x[0] - i) + Math.abs(y[0] - j);
                for(int k = 0;k < N;k++) {
                    if (h[k] == 0) continue;
                    int tmp2 = tmp - Math.abs(x[k] - i) - Math.abs(y[k] - j);
                    tmp2 = Math.max(tmp2, 0);
                    if (tmp2 != h[k]){
                        ok = false;
                    }
                }

                if (ok) {
                    out.println(i + " " + j + " " + tmp);
                    return;
                }
            }
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
