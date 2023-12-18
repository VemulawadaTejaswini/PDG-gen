import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N;
    long X;
    long[] patty;

    private long patties(int layer) {
        if (layer == 0) {
            return patty[layer] = 1;
        }

        if (patty[layer] != - 1) {
            return patty[layer];
        }

        return patty[layer] = patties(layer - 1) + 1 + patties(layer - 1);
    }

    private long dfs(long left, long right, int layer) {
        long center = (left + right) / 2;

        if (left == X) {
            return 0;
        }

        if (right == X) {
            return patty[layer - 1] * 2 + 1;
        }

        if (center == X) {
            return patty[layer - 1] + 1;
        }

        if (center <= X) {
            return patty[layer - 1] + dfs(center + 1, right - 1, layer - 1) + 1;
        } else {
            return dfs(left + 1, center - 1, layer - 1);
        }
    }

    private void solve() {
        N = nextInt();
        X = nextLong();

        patty = new long[N + 1];
        Arrays.fill(patty, -1);
        patty[N] = patties(N);

        long layerSum = 1;
        for(int i = 1;i < N + 1;i++) {
            layerSum = layerSum * 2 + 3;
        }

        long ans = dfs(1, layerSum, N);
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
