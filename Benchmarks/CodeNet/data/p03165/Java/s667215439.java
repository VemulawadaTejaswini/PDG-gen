import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static PrintWriter out;
    static CF_Reader in;
    static StringBuilder[][] dp;

    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();

        char[] s1 = in.next().toCharArray();
        char[] s2 = in.next().toCharArray();
        if (s1.length > s2.length) {
            char[] temp = s1;
            s1 = s2;
            s2 = temp;
        }

        dp = new StringBuilder[s1.length][s2.length];
        for (StringBuilder[] row: dp) Arrays.fill(row, null);
        out.println(solve(0, 0, s1, s2));

        out.close();
    }

    static StringBuilder solve(int idx, int jdx, char[] s1, char[] s2) {
        if (idx >= s1.length || jdx >= s2.length) return new StringBuilder();

        if (dp[idx][jdx] == null) {
            // skip
            dp[idx][jdx] = solve(idx + 1, jdx, s1, s2);

            // add
            for (int j = jdx; j < s2.length; j++) {
                if (s1[idx] == s2[j]) {
                    StringBuilder added = new StringBuilder(String.valueOf(s1[idx]));
                    added.append(solve(idx + 1, j + 1, s1, s2));
                    if (added.length() > dp[idx][jdx].length()) dp[idx][jdx] = added;
                }
            }
        }
        return dp[idx][jdx];
    }


    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}


