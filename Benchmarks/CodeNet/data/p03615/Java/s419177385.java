import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

            Geometry.Point[] p = new Geometry.Point[n];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt(), y = in.nextInt();
                p[i] = new Geometry.Point(x, y);
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int count = 0;
                    Geometry.Point[] polygon = {p[i],
                                                p[j]};

                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j)
                            continue;

                        if (p[k].classify(polygon) == Geometry.Point.Classification.ON) {
                            count++;
                        }
                    }

                    long overcount = m.pow(2, count);
                    answer = m.subtract(answer, overcount);
                }
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

    }

    static class Geometry {
        public static class Point implements Comparable<Geometry.Point> {
            long x;
            long y;

            public Point(long x, long y) {
                this.x = x;
                this.y = y;
            }

            public Geometry.Point copy() {
                return new Geometry.Point(x, y);
            }

            public Geometry.Point subtract(Geometry.Point o) {
                x -= o.x;
                y -= o.y;
                return this;
            }

            public static Geometry.Point subtract(Geometry.Point a, Geometry.Point b) {
                return a.copy().subtract(b);
            }

            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Geometry.Point point = (Geometry.Point) o;
                return x == point.x && y == point.y;
            }

            public int hashCode() {
                return Objects.hash(x, y);
            }

            public static long cross(Geometry.Point a, Geometry.Point b) {
                return a.x * b.y - a.y * b.x;
            }

            public static long cross(Geometry.Point p, Geometry.Point a, Geometry.Point b) {
                return cross(subtract(a, p), subtract(b, p));
            }

            public int compareTo(Geometry.Point o) {
                int ret = Long.compare(x, o.x);
                if (ret != 0)
                    return ret;
                return Long.compare(y, o.y);
            }

            public Geometry.Point.Classification classify(Geometry.Point[] polygon) {
                boolean ans = false;
                for (int i = 0; i < polygon.length; i++) {
                    Geometry.Point a = polygon[i], b = polygon[(i + 1) % polygon.length];
                    if (cross(a, b, this) == 0 && (a.compareTo(this) <= 0 || b.compareTo(this) <= 0) && (this.compareTo(a) <= 0 || this.compareTo(b) <= 0))
                        return Geometry.Point.Classification.ON;
                    if (a.y > b.y) {
                        Geometry.Point t = a;
                        a = b;
                        b = t;
                    }
                    if (a.y <= y && y < b.y && cross(this, a, b) > 0)
                        ans ^= true;
                }
                return ans ? Geometry.Point.Classification.IN : Geometry.Point.Classification.OUT;
            }

            public enum Classification {
                ON, IN, OUT,
                ;
            }

        }

    }

    static class NumberTheory {
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

