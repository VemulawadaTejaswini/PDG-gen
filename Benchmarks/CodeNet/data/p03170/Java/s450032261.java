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
                int n = cin.nextInt(), k = cin.nextInt();
                int a[] = new int[n];
                for (int i = 0; i < n; ++i) a[i] = cin.nextInt();
                Arrays.sort(a);
                int dp[] = new int[k + 1], used[] = new int[k + 1];
                for (int i = 0; i < n; ++i) {
                    dp[a[i]] = 1;
                    used[a[i]] = 1;
                }
                for (int i = 0; i < a[0]; ++i) {
                    dp[i] = 0;
                    used[i] = 1;
                }
                for (int i = 0; i <= k; ++i) {
                    if (used[i] == 0) {
                        int sflag = 0;
                        for (int j = 0; j < n; ++j) {
                            if (i - a[j] >= 0) {
                                if (dp[i - a[j]] == 0) sflag = 1;
                            }
                        }
                        if (sflag > 0) dp[i] = 1;
                        else dp[i] = 0;
                    }
                }
                cout.println(dp[k] == 0 ? "Second" : "First");
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