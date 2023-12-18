import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
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
        EConvexScore solver = new EConvexScore();
        solver.solve(1, in, out);
        out.close();
    }

    static class EConvexScore {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            NumberTheory.ModM m = new NumberTheory.ModM(998244353L);

            long answer = 0;
            answer = m.add(answer, m.pow(2, n));
            answer = m.subtract(answer, m.ncr(n, 0));
            answer = m.subtract(answer, m.ncr(n, 1));
            answer = m.subtract(answer, m.ncr(n, 2));

            Point[] p = new Point[n];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt(), y = in.nextInt();
                p[i] = new Point(x, y);
            }

            HashSet<Line> lines = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    Line l = new Line(p[i], p[j]);
                    if (lines.contains(l))
                        continue;
                    lines.add(l);

                    int count = 0;
                    for (int k = 0; k < n; k++) {
                        if (l.contains(p[k])) {
                            count++;
                        }
                    }

                    long overcount = m.pow(2, count);
                    overcount = m.subtract(overcount, m.ncr(count, 0));
                    overcount = m.subtract(overcount, m.ncr(count, 1));
                    overcount = m.subtract(overcount, m.ncr(count, 2));

                    answer = m.subtract(answer, overcount);
                }
            }

            out.println(answer);
        }

    }

    static class Point implements Comparable<Point> {
        long x;
        long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
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

    static class Util {
        public static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

    }

    static class Line {
        final long a;
        final long b;
        final long c;

        public Line(Point p1, Point p2) {
            long a = p1.y - p2.y;
            long b = -p1.x + p2.x;

            Util.ASSERT(a != 0 || b != 0);
            long c = -(a * p1.x + b * p1.y);

            long g = NumberTheory.gcd(c, NumberTheory.gcd(a, b));
            a /= g;
            b /= g;
            c /= g;

            if (a < 0) {
                a *= -1;
                b *= -1;
                c *= -1;
            }
            if (a == 0 && b < 0) {
                b *= -1;
                c *= -1;
            }

            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Line(long a, long b, long c) {
            Util.ASSERT(a != 0 || b != 0);

            long g = NumberTheory.gcd(c, NumberTheory.gcd(a, b));
            a /= g;
            b /= g;
            c /= g;

            if (a < 0) {
                a *= -1;
                b *= -1;
                c *= -1;
            }
            if (a == 0 && b < 0) {
                b *= -1;
                c *= -1;
            }

            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean contains(Point p) {
            return a * p.x + b * p.y + c == 0;
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Line l = (Line) o;
            return a == l.a && b == l.b && c == l.c;
        }

        public int hashCode() {
            return Objects.hash(a, b, c);
        }

        public String toString() {
            return String.format("[%dx + %dy + %d]", a, b, c);
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

    static class NumberTheory {
        public static long gcd(long a, long b) {
            long c;
            while (a != 0) {
                c = a;
                a = b % a;
                b = c;
            }
            return b;
        }

        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<Long> factorial = new ArrayList<>();
            ArrayList<Long> invFactorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(1L);
                invFactorial.add(1L);
            }

            public long fact(int n) {
                while (factorial.size() <= n) {
                    factorial.add(mult(factorial.get(factorial.size() - 1), factorial.size()));
                }

                return factorial.get(n);
            }

            public long fInv(int n) {
                while (invFactorial.size() <= n) {
                    invFactorial.add(div(invFactorial.get(invFactorial.size() - 1), invFactorial.size()));
                }

                return invFactorial.get(n);
            }

            public long ncr(int n, int r) {
                ASSERT(n >= 0);
                if (r < 0 || n < r)
                    return 0;
                return mult(fact(n), mult(fInv(r), fInv(n - r)));
            }

            public long normalize(long x) {
                x %= modulus();
                if (x < 0)
                    x += modulus();
                return x;
            }

            public long add(long a, long b) {
                return normalize(a + b);
            }

            public long subtract(long a, long b) {
                return normalize(a - b);
            }

            public long mult(long a, long b) {
                return normalize(a * b);
            }

            public long div(long a, long b) {
                return mult(a, inv(b));
            }

            public long pow(long x, int e) {
                if (e == 0)
                    return 1;
                if ((e & 1) > 0)
                    return mult(x, pow(x, e - 1));
                return pow(mult(x, x), e / 2);
            }

            public long inv(long value) {
                long g = modulus(), x = 0, y = 1;
                for (long r = value; r != 0; ) {
                    long q = g / r;
                    g %= r;

                    long temp = g;
                    g = r;
                    r = temp;

                    x -= q * y;

                    temp = x;
                    x = y;
                    y = temp;
                }

                ASSERT(g == 1);
                ASSERT(y == modulus() || y == -modulus());

                return normalize(x);
            }

        }

        public static class ModM extends NumberTheory.Modulus<NumberTheory.ModM> {
            private final long modulus;

            public ModM(long modulus) {
                this.modulus = modulus;
            }

            public long modulus() {
                return modulus;
            }

        }

    }
}

