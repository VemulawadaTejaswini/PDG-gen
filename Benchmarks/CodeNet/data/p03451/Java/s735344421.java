import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mirio
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FReader in = new FReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        int     n;
        int[][] g;
        int[][] dp;

        public void solve(int testNumber, FReader in, PrintWriter out) {
            n = in.nextInt();
            g = new int[2][n];
            dp = new int[2][n];

            for(int i = 0; i < 2; ++i) {
                for(int j = 0; j < n; ++j)
                    g[i][j] = in.nextInt();

                Arrays.fill(dp[i], -1);
            }

            out.println(solve(0, 0));
        }

        private int solve(int i, int j) {
            if(j == n - 1 && i == 1)
                return g[i][j];
            if(dp[i][j] >= 0)
                return dp[i][j];

            int ans = 0;
            if(i + 1 < 2) ans = Math.max(ans, solve(i + 1, j));
            if(j + 1 < n) ans = Math.max(ans, solve(i, j + 1));

            return dp[i][j] = ans + g[i][j];
        }

    }

    static class FReader {
        private BufferedReader  r;
        private String          line;
        private StringTokenizer st;
        private String          token;

        public FReader() {
            this(System.in);
        }

        public FReader(InputStream i) {
            r = new BufferedReader(new InputStreamReader(i));
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        private String peekToken() {
            if(token == null)
                try {
                    while(st == null || !st.hasMoreTokens()) {
                        line = r.readLine();
                        if(line == null) return null;
                        st = new StringTokenizer(line);
                    }
                    token = st.nextToken();
                } catch(IOException e) { }
            return token;
        }

        private String nextToken() {
            String ans = peekToken();
            token = null;
            return ans;
        }

    }
}

