import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N;
    int[] a;

    private void solve() {
        N = nextInt();
        a = new int[N];
        for(int i= 0;i < N;i++) {
            a[i] = nextInt();
        }

        int[] b = new int[N];
        int[] c = new int[N];
        for(int i = N - 1;i >= 0;i--) {
            if (a[i] != c[i] % 2) {
                b[i]++;
                if (i > 0)c[0]++;

                int tmp = i + 1;
                for (int k = 2;k * k <= tmp;k++) {
                    if (tmp % k == 0) {
                        c[tmp/k-1]++;
                        if (tmp/k != k) {
                            c[k-1]++;
                        }
                    }
                }
            }
        }

//        out.println(Arrays.toString(a));
//        out.println(Arrays.toString(b));
//        out.println(Arrays.toString(c));
        for(int i = 0;i < N;i++) {
            if (a[i] != (b[i] + c[i]) % 2) {
                out.println(-1);
                return;
            }
        }

        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < N;i++) {
            if (b[i] == 1) {
                sum++;
                ans.add(i + 1);
            }
        }
        out.println(sum);
        for(int i = 0;i < ans.size();i++) {
            if (i != 0) {
                out.print(" " + ans.get(i));
            } else {
                out.print(ans.get(i));
            }
        }
        out.println();
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
