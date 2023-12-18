import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
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
        EDivisibleSubstring solver = new EDivisibleSubstring();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDivisibleSubstring {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int p = in.nextInt();
            String x = in.next();
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int m = 0;
            long ans = 0;
            int xx = 1;
            for (int i = n - 1; i >= 0; i--) {
                int c = x.charAt(i) - '0';
                m = (((c % p) * (xx)) % p + m) % p;
                ans += map.getOrDefault(m, 0);
                map.put(m, map.getOrDefault(m, 0) + 1);
                xx *= 10;
                xx %= p;
            }
            out.println(ans);
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

