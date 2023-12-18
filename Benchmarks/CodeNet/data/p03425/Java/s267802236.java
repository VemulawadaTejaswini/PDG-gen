import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;

    private void solve() {
        N = nextInt();

        long m = 0;
        long a = 0;
        long r = 0;
        long c = 0;
        long h = 0;

        for(int i = 0;i < N;i++) {
            char ch = next().charAt(0);

            if (ch == 'M') {
                m++;
            } else if (ch == 'A') {
                a++;
            } else if (ch == 'R') {
                r++;
            } else if (ch == 'C') {
                c++;
            } else if (ch == 'H') {
                h++;
            }
        }


        long[] P = {m, a, r, c, h};
        long ans = 0;

        for(int i = 0;i < P.length;i++) {
            for(int j = i + 1;j < P.length;j++) {
                for(int k = j + 1;k < P.length;k++) {
                    ans += P[i] * P[j] * P[k];
                }
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
