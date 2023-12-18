import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;
    long C;
    long[] x;
    int[] v;

    private void solve() {
        N = nextInt();
        C = nextLong();
        x = new long[N];
        v = new int[N];

        for(int i = 0;i < N;i++) {
            x[i] = nextLong();
            v[i] = nextInt();
        }

        long ans = 0;
        for(int i = 0;i < N;i++) {
            for(int j = N-1;j > i;j--) {
                long sum = 0;
                for(int k = 0;k <= i;k++) {
                    sum += v[k];
                }
                for(int k = N-1;k >= j;k--) {
                    sum += v[k];
                }

                long cost = Math.min(x[i] * 2 + (C-x[j]),x[i] + (C-x[j]) * 2);
                ans = Math.max(ans,sum - cost);
            }
        }

        long sum1= 0;
        for(int i = 0;i < N;i++) {
            sum1 += v[i];
            ans = Math.max(ans,sum1 - x[i]);
        }

        long sum2 = 0;
        for(int i = N-1;i >= 0;i--) {
            sum2 += v[i];
            ans = Math.max(ans, sum2 - (C - x[i]));
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
