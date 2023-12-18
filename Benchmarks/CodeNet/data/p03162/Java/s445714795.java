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
        CVacation solver = new CVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CVacation {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int[] a, b, c;
            a = new int[n];
            b = new int[n];
            c = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
            int[][] dp = new int[n][3];
            dp[0][0] = a[0];
            dp[0][1] = b[0];
            dp[0][2] = c[0];
            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + a[i];
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + b[i];
                dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][0]) + c[i];
            }
            out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));

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

