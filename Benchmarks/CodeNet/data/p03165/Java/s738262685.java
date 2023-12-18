
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        int[][] dp = new int[S.length + 1][T.length + 1];

        for (int i = 1; i < S.length + 1; i++) {
            for (int j = 1; j < T.length + 1; j++) {
                if (S[i-1] == T[j-1]) {
                    dp[i][j] = Math.max(Math.max(dp[i - 1][j - 1] + 1, dp[i - 1][j]), dp[i][j - 1]);
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int i = S.length;
        int j = T.length;

        StringBuffer res = new StringBuffer();
        while (0 < i && 0 < j) {
            if (dp[i][j] == dp[i-1][j]) {
                i--;
            } else if (dp[i][j] == dp[i][j-1]) {
                j--;
            } else {
                res.insert(0, S[i-1]);
                i--;
                j--;
            }
        }
        out.println(res.toString());
        out.flush();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
    }
}