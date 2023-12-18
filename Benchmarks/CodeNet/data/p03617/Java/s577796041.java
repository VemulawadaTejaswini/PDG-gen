import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HossamDoma
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            choice[] val = new choice[4];
            val[0] = new choice(0.25, in.nextLong());
            val[1] = new choice(0.50, in.nextLong());
            val[2] = new choice(1, in.nextLong());
            val[3] = new choice(2, in.nextLong());

            int n = in.nextInt();

            Arrays.sort(val, Comparator.comparing(o -> (long) ((long) ((2.0 / o.sz)) * o.v)));

            long ans = 0;

            for (int i = 0; n > 0 && i < 4; ++i) {
                double cap = val[i].sz;
                if (n >= cap) {
                    long tmp = (long) (n / cap) * val[i].v;
                    ans += tmp;
                    n %= cap;
                }
            }

            out.println(ans);

        }

        class choice {
            long v;
            double sz;

            public choice(double sz, long v) {
                this.v = v;
                this.sz = sz;
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

        public Long nextLong() {
            return Long.parseLong(next());
        }

    }
}

