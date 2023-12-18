import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSnukeNumbers solver = new DSnukeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSnukeNumbers {
        private double eps = 1e-6;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();
            long n = 1;
            while (k-- > 0) {
                out.println(n);
                StringBuilder digits = new StringBuilder("0" + n);
                int firstNon9pos = 0;
                for (int i = digits.length() - 1; i >= 0; --i) {
                    if (digits.charAt(i) != '9') {
                        firstNon9pos = i;
                        break;
                    }
                }
                digits.setCharAt(firstNon9pos, (char) (digits.charAt(firstNon9pos) + 1));
                double opt = Double.MAX_VALUE;
                char nextdig = '0';
                while (digits.charAt(firstNon9pos) != '9' + 1) {
                    int sn = 0;
                    for (int i = 0; i < digits.length(); ++i) {
                        sn += digits.charAt(i) - '0';
                    }
                    double cur = 1.0 * Long.parseLong(digits.toString()) / sn;

                    if (cur + eps < opt) {
                        opt = cur;
                        nextdig = digits.charAt(firstNon9pos);
                    }
                    digits.setCharAt(firstNon9pos, (char) (digits.charAt(firstNon9pos) + 1));
                }

                digits.setCharAt(firstNon9pos, nextdig);
                n = Long.parseLong(digits.toString());
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

