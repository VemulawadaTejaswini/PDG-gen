import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        EMsSolution solver = new EMsSolution();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMsSolution {
        private long[] answer;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            Point[] a = new Point[n];
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Point.of(in.nextLong(), in.nextLong());
                p[i] = in.nextLong();
            }

            answer = new long[n + 1];
            Arrays.fill(answer, Long.MAX_VALUE);
            f(a, p);
            for (int k = 0; k <= n; k++) {
                out.println(answer[k]);
            }
        }

        private void f(Point[] a, long[] p) {
            final int n = a.length;

            int maxConfig = NumberTheory.powInt(3, n);
            for (int config = 0; config < maxConfig; config++) {
                TreeSet<Long> x = new TreeSet<>();
                TreeSet<Long> y = new TreeSet<>();
                x.add((long) Integer.MIN_VALUE); // intentionally not Long.MIN/MAX to avoid overflow
                x.add((long) Integer.MAX_VALUE);
                y.add((long) Integer.MIN_VALUE);
                y.add((long) Integer.MAX_VALUE);
                x.add(0L);
                y.add(0L);
                int c = config;
                int k = n;
                for (int i = 0; i < n; i++) {
                    int type = c % 3;
                    if (type == 0)
                        x.add(a[i].x);
                    else if (type == 1)
                        y.add(a[i].y);
                    else
                        k--;
                    c /= 3;
                }
                Util.ASSERT(c == 0);

                long score = 0;
                for (int i = 0; i < n; i++) {
                    score += sc(a[i], x, y) * p[i];
                }
                answer[k] = Math.min(answer[k], score);
            }
        }

        private long sc(Point point, TreeSet<Long> x, TreeSet<Long> y) {
            long answer = Long.MAX_VALUE;
            answer = Math.min(answer, Math.abs(point.x - x.floor(point.x)));
            answer = Math.min(answer, Math.abs(point.x - x.ceiling(point.x)));
            answer = Math.min(answer, Math.abs(point.y - y.floor(point.y)));
            answer = Math.min(answer, Math.abs(point.y - y.ceiling(point.y)));
            return answer;
        }

    }

    static class NumberTheory {
        public static int powInt(int x, int e) {
            if (e == 0)
                return 1;
            if ((e & 1) > 0)
                return x * powInt(x, e - 1);
            return powInt(x * x, e / 2);
        }

    }

    static class Util {
        public static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        private Util() {
        }

    }

    static class InputReader {
        public final BufferedReader reader;
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

    static class Point implements Comparable<Point> {
        public long x;
        public long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public static Point of(long x, long y) {
            return new Point(x, y);
        }

        public String toString() {
            return String.format("(%d, %d)", x, y);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

        public int compareTo(Point o) {
            int ret = Long.compare(x, o.x);
            if (ret != 0)
                return ret;
            return Long.compare(y, o.y);
        }

    }
}

