import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BFrog2 solver = new BFrog2();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFrog2 {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                tab[i] = sc.nextInt();
            }

            int[] dp = new int[n];

            for (int i = 1; i < n; i++) {
                dp[i] = Integer.MAX_VALUE;
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 1; j <= k && i + j < n; j++) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(tab[i] - tab[i + j]));
                }
            }
            out.println(dp[n - 1]);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

