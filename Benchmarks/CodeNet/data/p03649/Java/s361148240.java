import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
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
        EDecreaseJudgeVer solver = new EDecreaseJudgeVer();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDecreaseJudgeVer {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];

            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                sum += a[i];
            }

            PriorityQueue<Long> max = new PriorityQueue<>(Comparator.reverseOrder());
            for (long x : a) {
                max.add(x);
            }

            long answer = 0;
            long target = n - 1;
            while (max.peek() > target) {
                long cur = max.poll();
                long diff = cur - target;
                long ops = diff / (n + 1);
                if (ops * (n + 1) < diff) ops++;

                cur -= ops * (n + 1);
                answer += ops;
                target -= ops;
                max.add(cur);
            }

            out.println(answer);
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

