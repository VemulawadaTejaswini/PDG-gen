import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        ModScanner ms = new ModScanner();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        String s = ms.nextToken();
        String t = ms.nextToken();

        int[][] dp = new int[s.length() + 1][t.length() + 1];
        int i, j;
        for (i = 1; i <= s.length(); i++) {
            for (j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder lcs = new StringBuilder();
        for (i = s.length(), j = t.length(); i > 0 && j > 0; ) {
            if (dp[i][j] == dp[i - 1][j - 1] + 1 && dp[i][j] != dp[i - 1][j] && dp[i][j] != dp[i][j - 1]) {
                lcs.insert(0, s.charAt(i - 1));
                j--;
            } else if (dp[i][j - 1] > dp[i - 1][j]) {
                j--;
            } else {
                i--;
            }
        }

        while (j > 0) {
            if (s.charAt(i) == t.charAt(--j)) {
                lcs.insert(0, s.charAt(i));
            }
        }

        out.println(lcs.toString());
        out.close();
    }
}

class ModScanner {

    BufferedReader br;
    StringTokenizer st;

    public ModScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    String nextString() throws Exception {
        return br.readLine();
    }


    int nextInt() throws Exception, Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }

}
