import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */

public class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }

    void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        HashSet<Integer> set;
        int[][] ar;
        int[][] dp;
        int ans;
        int[] ptr;
        boolean flag;

        public void findIt(int node) {
            int node1 = ar[node][ptr[node]];
            if (!flag) return;
            if (set.contains(node1)) {
                flag = false;
                return;
            }
            while (ar[node1][ptr[node1]] != node) {
                set.add(node);
                findIt(node1);
                set.remove(node);
                if (!flag) return;
            }
            dp[node][ptr[node]] = Math.max(dp[node1][ptr[node1] - 1], dp[node][ptr[node] - 1]) + 1;
            dp[node1][ptr[node1]] = Math.max(dp[node1][ptr[node1] - 1], dp[node][ptr[node] - 1]) + 1;
            ans = Math.max(ans, dp[node][ptr[node]]);
            ptr[node]++;
            ptr[node1]++;
        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            ar = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    ar[i][j] = in.scanInt() - 1;
                }
            }
            set = new HashSet<>();
            ptr = new int[n];
            Arrays.fill(ptr, 1);
            dp = new int[n][n];
            ans = 0;
            flag = true;
            for (int i = 0; i < n; i++) {
                while (ptr[i] < n) {
                    findIt(i);
                    if (!flag) {
                        out.println(-1);
                        return;
                    }
                }
            }
            out.println(ans);

        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int total;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= total) {
                index = 0;
                try {
                    total = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (total <= 0) return -1;
            }
            return buf[index++];
        }

        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

