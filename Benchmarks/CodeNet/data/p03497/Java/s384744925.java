import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        NotsoDiverse solver = new NotsoDiverse();
        solver.solve(1, in, out);
        out.close();
    }

    static class NotsoDiverse {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int x = in.nextInt();
                map.compute(x, (k, v) -> v == null ? 1 : v + 1);
            }

            int ans = 0;

            TreeSet<int[]> set = new TreeSet<>((a1, a2) -> {
                if (a1[1] == a2[1]) {
                    return a1[0] - a2[0];
                }
                return a1[1] - a2[1];
            });
            for (int k : map.keySet()) {
                set.add(new int[]{k, map.get(k)});
            }

            while (set.size() > K) {
                ans += set.pollFirst()[1];
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

