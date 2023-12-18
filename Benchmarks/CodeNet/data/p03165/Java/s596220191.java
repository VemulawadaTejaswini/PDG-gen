import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        lcsDpContest solver = new lcsDpContest();
        solver.solve(1, in, out);
        out.close();
    }

    static class lcsDpContest {
        char[] s;
        char[] t;
        int[][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            s = sc.next().toCharArray();
            t = sc.next().toCharArray();
            memo = new int[s.length][t.length];
            for (int[] x : memo)
                Arrays.fill(x, -1);
            pw.println(trace(0, 0));
        }

        private String trace(int i, int j) {
            if (i == s.length || j == t.length)
                return "";
            if (s[i] == t[j])
                return s[i] + trace(i + 1, j + 1);
            int optimal = dp(i, j);
            if (optimal == dp(i, j + 1))
                return trace(i, j + 1);
            return trace(i + 1, j);
        }

        private int dp(int i, int j) {
            if (i == s.length || j == t.length)
                return 0;
            if (memo[i][j] != -1)
                return memo[i][j];
            if (s[i] == t[j])
                return 1 + dp(i + 1, j + 1);
            int ii = dp(i, j + 1);
            int jj = dp(i + 1, j);
            return memo[i][j] = Math.max(ii, jj);
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

    }
}

