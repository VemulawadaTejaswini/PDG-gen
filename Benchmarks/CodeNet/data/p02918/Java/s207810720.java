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
        DFaceProducesUnhappiness solver = new DFaceProducesUnhappiness();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFaceProducesUnhappiness {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            String x = in.next();
            StringBuilder ans = new StringBuilder("");
            int count = 0;
            ans.append(x.charAt(0));
            for (int i = 1; i < n; i++) {
                if (x.charAt(i) == ans.charAt(ans.length() - 1)) {
                    count++;
                    continue;
                }
                ans.append(x.charAt(i));
            }
            int l = ans.length();
            if (l % 2 == 1) {
                int temp = l / 2;
                if (temp > k) {
                    count += k * 2;
                } else {
                    count += temp * 2;
                }
            } else {
                int temp = (l - 1) / 2;
                if (temp > k) {
                    count += k * 2;
                    k = 0;
                } else {
                    count += temp * 2;
                    k -= temp;
                }
                if (k > 0) {
                    count++;
                }
            }
            out.println(count);

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

