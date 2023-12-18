import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            String s = in.next();
            long res = solveMe(s);
            out.println(res);
            //out.print("Case #"+ testNumber + ": ");
        }

        private long solveMe(String s) {
            int[] values = new int[2019];
            int cur = 0;
            int mult = 1;
            values[0]++;
            for (int i = 0; i < s.length(); i++) {
                cur = cur * 10 + (s.charAt(i) - '0');
                cur %= 2019;
                int ans = cur * mult;
                values[ans % 2019]++;
                //d("cur = " + cur);
                mult *= 202;
                mult %= 2019;

            }
            //d(stringMeDeb(toArray(values)));
            long res = 0;
            for (int i = 0; i < 2019; i++) {
                res += (values[i] - 1) * (values[i]) / 2;
            }
            return res;
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

    }
}

