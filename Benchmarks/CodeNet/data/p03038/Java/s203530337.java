import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.util.Collections;
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
        DIntegerCards solver = new DIntegerCards();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIntegerCards {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
            for (int i = 0; i < n; ++i) {
                map.merge(in.nextInt(), 1, (k, v) -> k + 1);
            }
            for (int i = 0; i < m; ++i) {
                int cnt = in.nextInt();
                map.merge(in.nextInt(), cnt, (k, v) -> k + cnt);
            }
            long sum = 0;
            for (Integer val : map.keySet()) {
                if (n == 0) break;
                sum += (long) val * Math.min(map.get(val), n);
                n -= Math.min(map.get(val), n);
            }
            out.println(sum);
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

