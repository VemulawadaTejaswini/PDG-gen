import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
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
        DVariousSushi solver = new DVariousSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DVariousSushi {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            pair[] food = new pair[n];
            for (int i = 0; i < n; ++i) {
                food[i] = new pair();
                food[i].t = in.nextInt();
                food[i].d = in.nextInt();
            }
            Arrays.sort(food, (a, b) -> (b.d - a.d));
            PriorityQueue<Integer> dup = new PriorityQueue<>();
            HashSet<Integer> vis = new HashSet<>();
            long sum = 0;
            for (int i = 0; i < k; ++i) {
                if (vis.contains(food[i].t)) dup.add(food[i].d);
                else vis.add(food[i].t);
                sum += food[i].d;
            }

            long ans = sum + vis.size() * vis.size();
            for (int i = k; i < n; ++i) {
                if (!vis.contains(food[i].t)) {
                    vis.add(food[i].t);
                    sum -= dup.poll() - food[i].d;
                    ans = Math.max(ans, sum + vis.size() * vis.size());
                }
            }
            out.println(ans);
        }

        private class pair {
            int d;
            int t;

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

