import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N;
    int[] A, leftToRight, rightToLeft;

    private int gcd(int x,int y) {
        return y == 0 ? x : gcd(y, x%y);
    }

    private void solve() {
        N = nextInt();

        A = new int[N];
        for(int i = 0;i < N;i++) {
            A[i] = nextInt();
        }

        leftToRight = new int[N + 1];
        rightToLeft = new int[N + 1];

        for(int i = 1;i <= N;i++) {
            leftToRight[i] = gcd(leftToRight[i - 1], A[i - 1]);
        }

        for(int i = N - 1;i >= 0;i--) {
            rightToLeft[i] = gcd(rightToLeft[i + 1], A[i]);
        }

        int ans = 0;
        for(int i = 0;i < N;i++) {
            ans = Math.max(ans, gcd(leftToRight[i], rightToLeft[i + 1]));
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
