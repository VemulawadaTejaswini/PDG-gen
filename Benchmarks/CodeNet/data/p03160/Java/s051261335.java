import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        int[] arr;
        long[] dp;

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = in.scanInt();
            dp = new long[n];
            Arrays.fill(dp, -1);
            out.println(findIt(n - 1));

        }

        long findIt(int n) {
            if (n < 0) return Integer.MAX_VALUE;
            if (n == 0) return dp[0] = 0;
            if (dp[n] != -1) return dp[n];
            long ans = Long.MAX_VALUE / 2;
            for (int i = 1; i <= 2; i++)
                if (n - i >= 0) ans = Math.min(ans, findIt(n - i) + Math.abs(arr[n] - arr[n - i]));
            return dp[n] = ans;
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }

        public int scanInt() {
            int I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

