import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        KStones solver = new KStones();
        solver.solve(1, in, out);
        out.close();
    }

    static class KStones {
        int n;
        int k;
        int[] arr;
        int min;
        Boolean[][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new int[n];
            min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
            }
            memo = new Boolean[k + 1][2];
            for (int i = 0; i <= k; i++)
                dp(i, 0);
            pw.println(dp(k, 0) ? "First" : "Second");
        }

        private boolean dp(int rem, int bool) {
            if (rem < min) {
                return bool == 0 ? false : true;
            }
            if (memo[rem][bool] != null)
                return memo[rem][bool];
            boolean toRet;
            if (bool == 0) {
                toRet = false;
                for (int i = 0; i < n; i++) {
                    if (arr[i] <= rem)
                        toRet |= dp(rem - arr[i], bool ^ 1);
                }
            } else {
                toRet = true;
                for (int i = 0; i < n; i++) {
                    if (arr[i] <= rem)
                        toRet &= dp(rem - arr[i], bool ^ 1);
                }
            }
            return memo[rem][bool] = toRet;
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

