import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;

    private void solve() {
        // 36400 = 2 * 2 * 2 * 2 * 3 * 3 * 3 * 3 * 5 * 5
        // 75 = 3 * 5 * 5, 5 * 15, 25 * 3, 75
        N = nextInt();
        int[] primeFactor = new int[101];

        int sum = 1;
        for(int i = 1;i <= N;i++) {
            sum *= i;

            for(int j = 2;j * j <= sum;j++) {
                while(sum % j == 0) {
                    primeFactor[j]++;
                    sum /= j;
                }
            }

            if (sum > 1) {
                primeFactor[sum]++;
                sum = 1;
            }
        }

        int ans = 0;
        for(int i = 1;i <= 98;i++) {
            for(int j = i + 1; j <= 99;j++) {
                for(int k = j + 1;k <= 100;k++) {
                    if (primeFactor[i] >= 2 && primeFactor[j] >= 4 && primeFactor[k] >= 4) {
                        ans++;
                    }

                    if (primeFactor[j] >= 2 && primeFactor[i] >= 4 && primeFactor[k] >= 4) {
                        ans++;
                    }

                    if (primeFactor[k] >= 2 && primeFactor[i] >= 4 && primeFactor[j] >= 4) {
                        ans++;
                    }
                }
            }
        }

        for(int i = 1;i <= 99;i++) {
            for(int j = i + 1;j <= 100;j++) {
                if (primeFactor[i] >= 14 && primeFactor[j] >= 4) {
                    ans++;
                }

                if (primeFactor[j] >= 15 && primeFactor[i] >= 4) {
                    ans++;
                }

                if (primeFactor[i] >= 24 && primeFactor[j] >= 2) {
                    ans++;
                }

                if (primeFactor[j] >= 24 && primeFactor[i] >= 2) {
                    ans++;
                }
            }
        }

        for(int i = 1;i <= 100;i++) {
            if (primeFactor[i] >= 74) {
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
