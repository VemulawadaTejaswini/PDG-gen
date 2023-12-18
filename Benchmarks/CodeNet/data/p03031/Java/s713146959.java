import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N, M;
    ArrayList<Integer>[] lists;

    private void solve() {
        N = nextInt();
        M = nextInt();
        lists = new ArrayList[N];
        for(int i = 0;i < N;i++) {
            lists[i] = new ArrayList<>();
        }
        for(int i = 0;i < M;i++) {
            int k = nextInt();
            for(int j = 0;j < k;j++) {
                int n = nextInt() - 1;
                lists[n].add(i);
            }
        }

        int[] P = new int[M];
        for(int i = 0;i < M;i++) {
            P[i] = nextInt();
        }

        int ans = 0;
        for(int i = 0;i < 1 << N;i++) {
            int[] cnt = new int[M];
            for(int j = 0;j < N;j++) {
                int k = (i >> j) & 1;
                if (k == 1) {
                    for(int sw : lists[j]) {
                        cnt[sw]++;
                    }
                }
            }

            boolean ok = true;
            for(int j = 0;j < M;j++) {
                if (cnt[j] % 2 != P[j]) {
                    ok = false;
                }
            }

            if (ok) {
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
