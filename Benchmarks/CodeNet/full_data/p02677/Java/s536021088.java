import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CColon solver = new CColon();
        solver.solve(1, in, out);
        out.close();
    }

    static class CColon {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            double a = in.nextInt();
            double b = in.nextInt();
            double h = in.nextInt();
            double m = in.nextInt();
            double res = solveMe1(a, b, h, m);
            out.println(res);
            //out.print("Case #"+ testNumber + ": ");
        }

        private double solveMe1(double a, double b, double h, double m) {
            double angleHour = h / 12.0 + (m / 60.0 / 12.0);
            double angle = 2 * Math.PI * (m / 60.0 - angleHour);
            return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(angle));
        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

