import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FKnapsackForAllSegments solver = new FKnapsackForAllSegments();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSegments {
        long mod = 998244353;
        int MAXN = 200005;
        PrintWriter out;
        InputReader in;
        int n;
        int s;
        int[] arr = new int[MAXN];
        long[][] dp = new long[3005][3005];

        long go(int ind, int sum) {
            if (sum > s)
                return 0;
            if (sum == s)
                return n - ind + 1;
            if (ind == n)
                return 0;
            if (dp[ind][sum] != -1)
                return dp[ind][sum];
            long subarrays = go(ind + 1, sum);
            subarrays += go(ind + 1, sum + arr[ind]);
            subarrays %= mod;
            dp[ind][sum] = subarrays;
            return subarrays;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            n = ni();
            s = ni();
            int i = 0;
            for (i = 0; i < n; i++)
                arr[i] = ni();
            for (i = 0; i < 3005; i++)
                Arrays.fill(dp[i], -1);
            long ways = 0;
            for (i = 0; i < n; i++) {
                ways += (go(i + 1, arr[i]) * (i + 1)) % mod;
                ways %= mod;
            }
            pn(ways);
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

