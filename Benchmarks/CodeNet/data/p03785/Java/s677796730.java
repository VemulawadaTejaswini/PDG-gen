import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Wolfgang Beyer
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AirportBus solver = new AirportBus();
        solver.solve(1, in, out);
        out.close();
    }

    static class AirportBus {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int cap = in.nextInt();
            int maxWait = in.nextInt();
            int[] a = in.readIntArray(n);
            Arrays.sort(a);

            int res = 0;
            int passengers = 0;
            int firstPassTime = a[0];

            for (int i = 0; i < n; i++) {
                if (a[i] - firstPassTime > maxWait) {
                    res++;
                    firstPassTime = a[i];
                    passengers = 1;
                } else {
                    passengers++;
                    if (passengers > cap) {
                        passengers = 1;
                        firstPassTime = a[i];
                        res++;
                    }
                }
            }
            if (passengers > 0) res++;
            out.println(res);
        }

    }

    static class InputReader {
        private static BufferedReader in;
        private static StringTokenizer tok;

        public InputReader(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readIntArray(int n) {
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }

        public String next() {
            try {
                while (tok == null || !tok.hasMoreTokens()) {
                    tok = new StringTokenizer(in.readLine());
                }
            } catch (IOException ex) {
                System.err.println("An IOException was caught :" + ex.getMessage());
            }
            return tok.nextToken();
        }

    }
}

