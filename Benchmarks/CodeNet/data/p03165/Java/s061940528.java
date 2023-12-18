import java.io.*;
import java.util.*;

public class Main {
    String S, T;

    String solve() {
        int s = S.length();
        int t = T.length();
        int[][] dp = new int[s+1][t+1];

        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= t; j++) {
                int max = Math.max(dp[i][j-1], dp[i-1][j]);
                if (S.charAt(i-1) == T.charAt(j-1)) {
                    dp[i][j] = Math.max(dp[i-1][j-1] + 1, max);
                } else {
                    dp[i][j] = max;
                }
            }
        }
      
        StringBuilder sb = new StringBuilder();
        int i = s;
        int temp = t;
        while (i >= 1) {
            for (int j = temp; j >= 1; j--) {
                if (S.charAt(i-1) == T.charAt(j-1)) {
                    sb.insert(0, T.charAt(j-1));
                    i--;
                    temp = j;
                }
            }
            i--;
        }
        return sb.toString();
    }

    void main(FastScanner in, PrintWriter out) {
        S = in.next();
        T = in.next();
        out.println( solve() );
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Main m = new Main();
        m.main(in, out);
        out.close();
        in.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream in) { br = new BufferedReader(new InputStreamReader(in)); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        public String nextLine() {
            String str = "";
            try { str = br.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
        public void close() throws IOException { br.close(); }
    }
}