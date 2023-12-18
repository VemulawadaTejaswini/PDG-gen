import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String s = in.next();
            String t = in.next();

            int[][] dp = new int[s.length()][t.length()];
            dp[0][0] = s.charAt(0) == t.charAt(0) ? 1 : 0;

            for (int i = 1; i < s.length(); i++)
                dp[i][0] = s.charAt(i) == t.charAt(0) ? 1 : dp[i - 1][0];
            for (int i = 1; i < t.length(); i++)
                dp[0][i] = t.charAt(i) == s.charAt(0) ? 1 : dp[0][i - 1];

            for (int i = 1; i < s.length(); i++)
                for (int j = 1; j < t.length(); j++)
                    dp[i][j] = s.charAt(i) == t.charAt(j) ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);


            char[] ans = new char[dp[s.length() - 1][t.length() - 1]];
            int ci = s.length() - 1;
            int cj = t.length() - 1;
            int cl = ans.length;
            while (cl > 0) {
                if (ci > 0 && dp[ci - 1][cj] == cl)
                    ci--;
                else if (cj > 0 && dp[ci][cj - 1] == cl)
                    cj--;
                else {
                    ans[--cl] = s.charAt(ci);
                    ci--;
                    cj--;
                }
            }

            for (char cc : ans)
                out.print(cc);
            out.println();
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isPrintableChar(int c) {
            return c >= 33 && c <= 126;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();

            int b = readByte();
            while (!isPrintableChar(b))
                b = readByte();

            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }

            return sb.toString();
        }

    }
}

