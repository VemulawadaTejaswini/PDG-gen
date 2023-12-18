import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.function.Function;
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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            long A = in.Long();
            long B = in.Long();
            long N = in.Long();

            Function<Double, Double> calc = x -> {
                double a = Math.floor((A * x) / B);
                double b = A * Math.floor(x / B);
                return a - b;
            };

            double low = 0, hi = N;
            for (int i = 0; i < 1000; i++) {
                double ll = (low * 2 + hi) / 3;
                double hh = (low + hi * 2) / 3;
                double temp1 = calc.apply(ll);
                double temp2 = calc.apply(hh);
                if (temp1 >= temp2) {
                    hi = hh;
                } else {
                    low = ll;
                }
            }
            out.println((long) Math.max(calc.apply(Math.floor(low)), calc.apply(Math.ceil(low))));
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public long Long() {
            return Long.parseLong(next());
        }

    }
}

