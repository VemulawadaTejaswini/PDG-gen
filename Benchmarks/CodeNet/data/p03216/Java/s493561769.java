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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CKDMC solver = new CKDMC();
        solver.solve(1, in, out);
        out.close();
    }

    static class CKDMC {
        static final char D = 'D';
        static final char M = 'M';
        static final char C = 'C';
        static final int W = 75;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();

            long[] dCountPrefix = new long[n + 1];
            for (int i = 0; i < n; i++) {
                dCountPrefix[i + 1] = dCountPrefix[i];
                if (s[i] == D) {
                    dCountPrefix[i + 1]++;
                }
            }
            // dCountPrefix[i] is the # of D in s[0]..s[i-1]. dCountPrefix[b]-dCountPrefix[a] is # D in s[a]..s[b-1]

            long[][] dmCount = new long[n][W];
            // dmCount[i][j] is the # of DM in s[i]..s[i+j]
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < W && i + j < n; j++) {
                    dmCount[i][j] = dmCount[i][j - 1];
                    if (s[i + j] == M) {
                        dmCount[i][j] += (dCountPrefix[i + j] - dCountPrefix[i]);
                    }
//                System.out.print(dmCount[i][j] + "\t");
                }
//            System.out.println();
            }

            int Q = in.nextInt();
            for (int q = 0; q < Q; q++) {
                int k = in.nextInt();
                long answer = 0;
                for (int i = 0; i < n; i++) {
                    if (s[i] == C) {
                        int left = Math.max(0, i - (k - 1));
                        answer += dmCount[left][k - 1];
                    }
                }

                out.println(answer);
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

    }
}

