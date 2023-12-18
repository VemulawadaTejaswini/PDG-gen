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
        DDigitSumReplace solver = new DDigitSumReplace();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDigitSumReplace {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int m = in.nextInt();
            int[] d = new int[m];
            long[] c = new long[m];
            for (int i = 0; i < m; i++) {
                d[i] = in.nextInt();
                c[i] = in.nextLong();
            }

            long semivariant = 0;
            for (int i = 0; i < m; i++) {
                semivariant += 9 * c[i];
                semivariant += d[i] * c[i];
            }

            long answer = semivariant / 9 - 1;
            if (semivariant % 9 == 0)
                answer--;
            out.println(answer);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

