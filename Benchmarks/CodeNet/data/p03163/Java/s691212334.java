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
        int n = ms.nextInt();
        int w = ms.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = ms.nextInt();
            val[i] = ms.nextInt();
        }

        long[][] dp = new long[n + 1][w + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (j >= wt[i-1]) {
                    dp[i][j] = Math.max(dp[i][j], val[i-1] + dp[i-1][j - wt[i-1]]);
                }
            }
        }

        out.println(dp[n][w]);
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
