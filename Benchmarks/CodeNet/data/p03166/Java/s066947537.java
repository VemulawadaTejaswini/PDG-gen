import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jenish
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        ArrayList<Integer>[] arrayList;
        boolean[] visited;
        long ans = 0;
        long[] dp;

        void DFS(int s) {
            visited[s] = true;
            for (int j : arrayList[s]) {
                if (!visited[j]) DFS(j);
            }
            long ma = 0;
            for (int j : arrayList[s]) {
                ma = Math.max(dp[j], ma);
            }
            dp[s] = ma + 1;

            ans = Math.max(ans, dp[s]);

        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int m = in.scanInt();
            arrayList = new ArrayList[n + 1];
            visited = new boolean[n + 1];
            for (int i = 0; i <= n; i++) {
                arrayList[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                int a = in.scanInt();
                int b = in.scanInt();
                arrayList[a].add(b);
            }

            dp = new long[n + 1];

            ans = 1;


            for (int i = 1; i <= n; i++) {
                if (!visited[i]) DFS(i);
            }
            out.println(ans - 1);
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

