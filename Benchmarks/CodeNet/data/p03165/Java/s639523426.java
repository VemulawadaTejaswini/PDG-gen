import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        String a = in.nextLine();
        String b = in.nextLine();
        LongestCommonSubsequence lcs = new LongestCommonSubsequence(a, b);
        out.println(lcs.LCS());
    }

    static class LongestCommonSubsequence {
        private String a;
        private String b;

        private int[][] table;

        LongestCommonSubsequence(String a, String b) {
            this.a = a;
            this.b = b;
            this.table = new int[a.length() + 1][b.length() + 1];
            this.calculate();
        }

        private void calculate() {
            for (int i = 1; i <= a.length(); i++) {
                for (int j = 1; j <= b.length(); j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        // If chars are the same, then append +1 to the LCS of [i-1][j-1]
                        table[i][j] = table[i - 1][j - 1] + 1;
                    } else {
                        // Else, the longest of [i-1][j] and [i][j-1] applies
                        table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                    }
                }
            }
        }

        /**
         * Get the LCS length of two strings.
         * @return LCS length.
         */
        int LCSLength() {
            return table[a.length()][b.length()];
        }

        /**
         * Get the actual LCS of two strings.
         * @return Longest Common Subsequence.
         */
        String LCS() {
            // Backtrack the table to get the LCS
            StringBuilder ret = new StringBuilder();
            int i = a.length();
            int j = b.length();
            while (i != 0 && j != 0) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    ret.insert(0, a.charAt(i - 1));
                    i--;
                    j--;
                } else {
                    if (table[i - 1][j] > table[i][j - 1]) {
                        i--;
                    } else {
                        j--;
                    }
                }
            }
            return ret.toString();
        }
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
