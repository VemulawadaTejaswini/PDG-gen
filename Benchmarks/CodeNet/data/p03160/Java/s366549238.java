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
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                tab[i] = sc.nextInt();
            }

            int[] dp = new int[n];

            for (int i = 1; i < n; i++) {
                dp[i] = Integer.MAX_VALUE;
            }

            for (int i = 0; i < n - 1; i++) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(tab[i] - tab[i + 1]));
                if (i != n - 2) {
                    dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(tab[i] - tab[i + 2]));
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

