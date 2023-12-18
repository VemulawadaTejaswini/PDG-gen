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
        ERemOfSumIsNum solver = new ERemOfSumIsNum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERemOfSumIsNum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long ans = 0;
            HashMap<Long, Long> map = new HashMap<>();
            long pre[] = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                pre[i] += pre[i - 1] + in.nextLong();
            }
            map.put(0L, 1L);
            for (int i = 1; i <= n; i++) {
                if (i - k >= 0) {
                    if (map.containsKey((pre[i - k] - (i - k)) % k) && map.get((pre[i - k] - (i - k)) % k) > 0)
                        map.put(((pre[i - k] - (i - k)) % k), map.get((pre[i - k] - (i - k)) % k) - 1);
                    else {
                        map.remove((pre[i - k] - (i - k)) % k);
                    }
                }
//            out.println(map.get((pre[i]-i)%k));
                if (map.containsKey((pre[i] - i) % k) && map.get((pre[i] - i) % k) > 0) {
                    ans += map.get((pre[i] - i) % k);
                }
                if (map.containsKey((pre[i] - i) % k) && map.get((pre[i] - i) % k) >= 0) {
                    map.put((pre[i] - i) % k, map.get((pre[i] - i) % k) + 1);
                } else {
                    map.put((pre[i] - i) % k, 1L);
                }

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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

