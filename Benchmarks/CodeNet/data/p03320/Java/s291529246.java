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
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSnukeNumbers solver = new DSnukeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSnukeNumbers {
        private double eps = 1e-6;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long cur = 1;
            for (int i = 0; i < n; ++i) {
                out.println(cur);
                long next = cur + 1;
                double opt = Double.MAX_VALUE;
                String curDigs = Long.toString(next);
                for (int j = 0; j < curDigs.length(); ++j) {
                    StringBuilder tail = new StringBuilder();
                    for (int k = 0; k < j; ++k) tail.append("9");
                    String nextDigs = curDigs.substring(0, curDigs.length() - j) + tail.toString();
                    int den = 0;
                    for (int k = 0; k < nextDigs.length(); ++k) den += nextDigs.charAt(k) - '0';
                    long candidate = Long.parseLong(nextDigs);
                    if (1.0 * candidate / den + eps < opt) {
                        opt = 1.0 * candidate / den;
                        cur = candidate;
                    }
                }
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

