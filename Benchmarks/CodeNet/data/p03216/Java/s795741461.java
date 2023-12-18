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

            long[] mCountPrefix = new long[n + 1];
            for (int i = 0; i < n; i++) {
                mCountPrefix[i + 1] = mCountPrefix[i];
                if (s[i] == M) {
                    mCountPrefix[i + 1]++;
                }
            }

            int Q = in.nextInt();
            for (int q = 0; q < Q; q++) {
                int k = in.nextInt();
                long answer = 0;
                long dmCount = 0;
                for (int i = 0; i < n; i++) {
                    if (i - k >= 0 && s[i - k] == D) {
                        dmCount -= mCountPrefix[i] - mCountPrefix[i - k];
                    }
                    if (s[i] == M) {
                        dmCount += dCountPrefix[i] - dCountPrefix[Math.max(0, i - (k - 1))];
                    }
                    if (s[i] == C) {
                        answer += dmCount;
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

