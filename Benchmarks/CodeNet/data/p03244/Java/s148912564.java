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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] odd = new int[100001];
            int[] even = new int[100001];
            for (int i = 0; i < n / 2; i++) {
                even[in.nextInt()]++;
                odd[in.nextInt()]++;
            }
            int oddmax = -1;
            int oddsmax = -1;
            int oddmaxi = 0;
            int evenmax = -1;
            int evensmax = -1;
            int evenmaxi = 0;
            for (int i = 1; i <= 100000; i++) {
                if (odd[i] > oddmax) {
                    oddsmax = oddmax;
                    oddmax = odd[i];
                    oddmaxi = i;
                } else if (odd[i] > oddsmax) {
                    oddsmax = odd[i];
                }
                if (even[i] > evenmax) {
                    evensmax = evenmax;
                    evenmax = even[i];
                    evenmaxi = i;
                } else if (even[i] > evensmax) {
                    evensmax = even[i];
                }
            }
            if (oddmaxi != evenmaxi) {
                out.println(n - oddmax - evenmax);
            } else {
                out.println(Math.min(n - oddsmax - evenmax, n - oddmax - evensmax));
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

