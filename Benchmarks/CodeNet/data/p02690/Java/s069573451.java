import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DIHateFactorization solver = new DIHateFactorization();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIHateFactorization {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.nextInt();

            HashMap<Long, Integer> root = new HashMap<>();
            for (int i = -200; i < 200; i++) {
                root.put(NumberTheory.pow(i, 5), i);
            }
            for (int a = 1; ; a++) {
                long d = NumberTheory.pow(a, 5) - x;
                if (root.containsKey(d)) {
                    out.println(Util.join(a, root.get(d)));
                    return;
                }
            }
        }

    }

    static class Util {
        public static String join(int... i) {
            StringBuilder sb = new StringBuilder();
            for (int o : i) {
                sb.append(o);
                sb.append(" ");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        }

        private Util() {
        }

    }

    static class NumberTheory {
        public static long pow(long x, long e) {
            if (e == 0)
                return 1;
            if ((e & 1) > 0)
                return x * pow(x, e - 1);
            return pow(x * x, e / 2);
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

