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
            Tea[] teas = new Tea[4];
            for (int i = 0; i < 4; i++) {
                teas[i] = new Tea(in.nextLong(), 1 << i);
            }
            Arrays.sort(teas, new Comparator<Tea>() {

                public int compare(Tea o1, Tea o2) {
                    return Long.compare(o1.yen * o2.liter, o2.yen * o1.liter);
                }
            });
            long N = in.nextLong() * 4;
            long ans = 0;
            for (int i = 0; i < 4; i++) {
                ans += N / teas[i].liter * teas[i].yen;
                N %= teas[i].liter;
            }
            out.println(ans);
        }

        class Tea {
            long yen;
            int liter;

            public Tea(long yen, int liter) {
                this.yen = yen;
                this.liter = liter;
            }

        }

    }

    static class InputReader {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(nextLine());
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

