import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
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
        ERoadwork solver = new ERoadwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoadwork {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), q = in.nextInt();

            int[] s = new int[n], t = new int[n], x = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = in.nextInt();
                t[i] = in.nextInt();
                x[i] = in.nextInt();
            }

            int[] d = new int[q];
            for (int i = 0; i < q; i++) {
                d[i] = in.nextInt();
            }

            ERoadwork.RangeMin r = new ERoadwork.RangeMin();

            for (int i = 0; i < n; i++) {
                r.set(s[i] - x[i], t[i] - x[i], x[i]);
            }

            for (int i = 0; i < q; i++) {
                int o = r.get(d[i]);
                if (o == Integer.MAX_VALUE) {
                    o = -1;
                }
                out.println(o);
            }
        }

        static class Pair {
            final int left;
            final int right;

            public int hashCode() {
                return Objects.hash(left, right);
            }

            public boolean equals(Object obj) {
                if (obj instanceof ERoadwork.Pair) {
                    return left == ((ERoadwork.Pair) obj).left && right == ((ERoadwork.Pair) obj).right;
                }
                return false;
            }

            Pair(int left, int right) {
                this.left = left;
                this.right = right;
            }

            public String toString() {
                return String.format("[%d, %d)", left, right);
            }

        }

        static class RangeMin {
            HashMap<ERoadwork.Pair, Integer> map = new HashMap<>();
            int n = 1;

            RangeMin() {
            }

            void set(int left, int right, int value) {
                int n = 1;
                while (n <= right) {
                    n *= 2;
                }
                this.n = Math.max(n, this.n);
                for (int width = n; width >= 1; width /= 2) {
                    if ((right / width - 1) * width >= left) {
                        int innerLeft = (right / width - 1) * width;
                        int innerRight = (right / width) * width;
                        set(left, innerLeft, value);
                        set(innerRight, right, value);
                        ERoadwork.Pair p = new ERoadwork.Pair(innerLeft, innerRight);
                        map.put(p, Math.min(value, map.getOrDefault(p, Integer.MAX_VALUE)));
//                    System.out.println(map);
                        return;
                    }
                }
            }

            int get(int x) {
                int answer = Integer.MAX_VALUE;
                for (int width = n; width >= 1; width /= 2) {
                    int left = (x / width) * width;
                    int right = left + width;
                    answer = Math.min(answer, map.getOrDefault(new ERoadwork.Pair(left, right), Integer.MAX_VALUE));
                }
                return answer;
            }

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

