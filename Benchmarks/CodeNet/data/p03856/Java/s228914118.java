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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CDaydream solver = new CDaydream();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDaydream {
        static final String[] blocks = {"maerd",
                                        "remaerd",
                                        "esare",
                                        "resare"};

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String input = in.next();
            final int n = input.length();
            char[] rev = new char[n];
            for (int i = 0; i < n; i++) {
                rev[i] = input.charAt(n - 1 - i);
            }
            String s = String.valueOf(rev);

            int index = 0;
            outer:
            while (index < s.length()) {
                for (String b : blocks) {
                    if (s.startsWith(b, index)) {
                        index += b.length();
                        continue outer;
                    }
                }
                out.println("NO");
                return;
            }

            out.println("YES");
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

    }
}

