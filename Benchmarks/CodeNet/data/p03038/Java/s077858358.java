import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N,M;
    int[] A, B, C;
    Pair[] pairs;

    private class Pair implements Comparable<Pair> {
        int b,c;
        public Pair(int b, int c) {
            this.b = b;
            this.c = c;
        }

        public int compareTo(Pair other) {
            return other.c - this.c;
        }
    }

    private void solve() {
        N = nextInt();
        M = nextInt();
        A = new int[N];
        for(int i = 0;i < N;i++) {
            A[i] = nextInt();
        }

        B = new int[M];
        C = new int[M];
        pairs = new Pair[M];
        for(int i = 0;i < M;i++) {
            B[i] = nextInt();
            C[i] = nextInt();
            pairs[i] = new Pair(B[i], C[i]);
        }

        Arrays.sort(A);
        Arrays.sort(pairs);

        int idx = 0;
        for(int i = 0;i < M;i++) {
            while(idx < N && pairs[i].b > 0 && A[idx] < pairs[i].c) {
                pairs[i].b--;
                A[idx] = pairs[i].c;
                idx++;
            }
        }

        long ans = 0;
        for(int i = 0;i < N;i++) {
            ans += A[i];
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
