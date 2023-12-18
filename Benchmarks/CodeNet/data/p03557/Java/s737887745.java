import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;
    int[] A,B,C;

    private int lowerBound(int i,int[] a,int[] b) {
        int low = -1;
        int high = N;

        while(high - low > 1) {
            int mid = high + low >> 1;

            if (a[i] < b[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return low;
    }

    private int upperBound(int i,int[] a,int[] b) {
        int low = -1;
        int high = N;

        while(high - low > 1) {
            int mid = high + low >> 1;

            if (a[i] < b[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return high;
    }

    private void solve() {
        N = nextInt();
        A = new int[N];
        B = new int[N];
        C = new int[N];
        for(int i = 0;i < N;i++) {
            A[i] = nextInt();
        }
        for(int i = 0;i < N;i++) {
            B[i] = nextInt();
        }
        for(int i = 0;i < N;i++) {
            C[i] = nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        long ans = 0;
        int a = 0,c = 0;
        for(int i = 0;i < N;i++) {

            while(a < N && B[i] > A[a]) {
                a++;
            }

            while(c < N && B[i] >= C[c]) {
                c++;
            }

            ans += a * (N - c);
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