import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] v1 = new int[n / 2];
            int[] v2 = new int[n / 2];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    v1[i / 2] = in.nextInt();
                } else {
                    v2[i / 2] = in.nextInt();
                }
            }

            HashMap<Integer, Integer> c1 = count(v1);
            HashMap<Integer, Integer> c2 = count(v2);

            int answer = n - Math.max(maxCount(c1, -1) + maxCount(c2, mode(c1)), maxCount(c1, mode(c2)) + maxCount(c2, -1));

            out.println(answer);
        }

        static HashMap<Integer, Integer> count(int[] v) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int x : v) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }
            int max = 0;
            for (int c : count.values()) {
                max = Math.max(max, c);
            }

            return count;
        }

        static int mode(HashMap<Integer, Integer> count) {
            int max = 0;
            int mode = -1;
            for (Map.Entry<Integer, Integer> e : count.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    mode = e.getKey();
                }
            }

            return mode;
        }

        static int maxCount(HashMap<Integer, Integer> count, int banned) {
            int max = 0;
            for (Map.Entry<Integer, Integer> e : count.entrySet()) {
                if (e.getValue() > max && e.getKey() != banned) {
                    max = e.getValue();
                }
            }

            return max;
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

