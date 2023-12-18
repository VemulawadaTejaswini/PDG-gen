/**
 * @author cplayer on 2018/6/23.
 * @version 1.0
 */

import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/data.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/data.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver(in, out);
            solver.solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver {

        private InputReader cin;
        private PrintWriter cout;

        Solver (InputReader cin, PrintWriter cout) {
            this.cin = cin; this.cout = cout;
        }

        public void solve () {
            try {
                int n = cin.nextInt();
                double dp[][] = new double[n + 1][n + 1];
                double p[] = new double[n + 1];
                for (int i = 1; i <= n; ++i) p[i] = cin.nextDouble();
                dp[0][0] = 1;
                for (int i = 1; i <= n; ++i) {
                    for (int j = 1; j <= i; ++j) {
                        dp[i][j] += dp[i - 1][j - 1] * p[i];
                        dp[i][j - 1] += dp[i - 1][j - 1] * (1 - p[i]);
                    }
                }
                double res = 0;
                for (int i = 1; i <= n; ++i) {
                    if (i * 2 >= n) res += dp[n][i];
                }
                cout.printf("%.10f\n", res);
            } catch (RuntimeException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 1000000);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}