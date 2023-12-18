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
            int cnt = 0, k = in.nextInt();
            long nu = 1, den = 1, step = 1, ans[] = new long[1000], dens[] = new long[1000];
            if (k > 135) return;
            while (nu <= (long) 1e15) {
                ans[cnt++] = nu;
                dens[cnt - 1] = den;
                if (Long.toString(nu).charAt(0) == '9' || nu * 1.0 / den - eps > step)
                    step *= 10;
                nu += step;
                ++den;
            }
            for (int i = 0; i < k; ++i) out.println(ans[i]);
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

