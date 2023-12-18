import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.BitSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        CYutori solver = new CYutori();
        solver.solve(1, in, out);
        out.close();
    }

    static class CYutori {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int c = in.nextInt();
            char[] sin = in.next().toCharArray();
            boolean[] s = new boolean[n];
            for (int i = 0; i < n; i++) {
                s[i] = sin[i] == 'x';
            }

            // let's say he works on the earliest possible days
            BitSet first = new BitSet(n);
            outer:
            for (int d = 0; d < n; d += c + 1) {
                while (s[d]) {
                    d++;
                    if (d >= n)
                        break outer;
                }
                first.set(d);
            }
            BitSet last = new BitSet(n);
            outer:
            for (int d = n - 1; d >= 0; d -= c + 1) {
                while (s[d]) {
                    d--;
                    if (d < 0)
                        break outer;
                }
                last.set(d);
            }

            if (first.cardinality() > k) {
                return;
            }

            first.and(last);
            for (int i = first.nextSetBit(0); i != -1; i = first.nextSetBit(i + 1)) {
                out.println(i + 1);
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

