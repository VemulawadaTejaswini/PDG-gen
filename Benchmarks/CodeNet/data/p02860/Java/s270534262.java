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
        BEcho solver = new BEcho();
        solver.solve(1, in, out);
        out.close();
    }

    static class BEcho {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();

            int[] z = ZAlgorithm.zAlgorithm(s);
            boolean answer = n % 2 == 0 && z[n / 2] == n / 2;
            out.println(answer ? "Yes" : "No");
        }

    }

    static class ZAlgorithm {
        private ZAlgorithm() {
        }

        public static int[] zAlgorithm(char[] s) {
            int n = s.length;
            int[] z = new int[n];
            z[0] = n;

            for (int i = 1, l = -1, r = -1; i < n; i++) {
                z[i] = r > i ? Math.min(r - i, z[i - l]) : 0;
                while (i + z[i] < n && s[i + z[i]] == s[z[i]])
                    z[i]++;
                if (i + z[i] > r) {
                    l = i;
                    r = i + z[i];
                }
            }
            return z;
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

