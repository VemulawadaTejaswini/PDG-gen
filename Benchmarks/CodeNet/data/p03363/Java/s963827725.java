import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;
    int[] A;

    private void solve() {
        N = nextInt();
        A = new int[N];
        for(int i = 0;i < N;i++) {
            A[i] = nextInt();
        }

        long[] sum = new long[N + 1];
        for(int i = 0;i < N;i++) {
            sum[i+1] = sum[i] + A[i];
        }

        HashMap<Long,Long> map = new HashMap<>();
        for(int i = 1;i < N+1;i++) {
            if(map.containsKey(sum[i])) {
                map.put(sum[i], map.get(sum[i]) + 1);
            } else {
                map.put(sum[i], 1L);
            }
        }

        long ans = 0;
        for(long v : map.keySet()) {
            if (v == 0) {
                ans += map.get(v);
            }
            ans += map.get(v) * (map.get(v) - 1) / 2;
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
