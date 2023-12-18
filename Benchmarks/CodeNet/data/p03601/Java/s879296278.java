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
 * @author HossamDoma
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            int f = in.nextInt();

            a = Math.min(a, b);
            if (c > d) {
                int tmp = d;
                d = c;
                c = tmp;
            }

            double den = 0;
            int tot = 0, ss = 0;
            for (int i = 1; i * a * 100 < f; ++i) {
                int water_taken = i * a * 100;
                int perfect_sugar = i * a * e;

                int taken = perfect_sugar / d;
                perfect_sugar -= taken * d;
                int sugar = taken * d;
                taken = perfect_sugar / c;
                sugar += taken * c;

                double cur_den = (100. * sugar) / (sugar + water_taken);

                if (cur_den > den) {
                    den = cur_den;
                    tot = water_taken + sugar;
                    ss = sugar;
                }

            }

            out.println(tot + " " + ss);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public String test_string;

        public InputReader(InputStream test_stringeam) {
            reader = new BufferedReader(new InputStreamReader(test_stringeam), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    String line = null;
                    if (test_string != null) {
                        line = test_string;
                        test_string = null;
                    } else
                        line = reader.readLine();

                    tokenizer = new StringTokenizer(line);
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

