import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        FTakahashisBasicsInEducationAndLearning solver = new FTakahashisBasicsInEducationAndLearning();
        solver.solve(1, in, out);
        out.close();
    }

    static class FTakahashisBasicsInEducationAndLearning {
        long l;
        long a;
        long b;
        long modulus;
        ModM m;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            l = in.nextLong();
            a = in.nextLong();
            b = in.nextLong();
            modulus = in.nextInt();

            m = new ModM();
//        modulus = 1_000_000_007;

            long lastElement = s(l - 1);

            NumberTheory.ModularNumber<ModM> answer = m.create(0);
            for (long tens = 1L; tens <= lastElement; tens *= 10) {
                long first = Math.max(0, firstIndexAtLeast(tens));
                long last;
                if (tens * 10 > 0) {
                    last = Math.min(l - 1, lastIndexStrictlyLess(tens * 10));
                } else {
                    last = l - 1;
                }
//            System.out.println(first + " " + last);
                if (first > last || first < 0) continue;
                long count = last - first + 1;
                answer = answer.mult(m.create(tens).mult(10).pow(count));
//            System.out.println(answer);
                answer = answer.add(arithmeticGeometricSum3(tens, first, last));
//            System.out.println("   " + arithmeticGeometricSum3(tens * 10, first, last));
//            System.out.println(answer);
                if (tens * 10 < 0) {
                    break;
                }
            }
            out.println(answer);
        }

        NumberTheory.ModularNumber<ModM> safeDiv(NumberTheory.ModularNumber<ModM> a, NumberTheory.ModularNumber<ModM> b) {
            long g = NumberTheory.gcd(a.value, b.value);
            return m.create(a.value / g).div(m.create(b.value / g));
        }

        NumberTheory.ModularNumber<ModM> arithmeticGeometricSum3(long ratio, long first, long last) {
            long n = last - first + 1;
            NumberTheory.ModularNumber<ModM> r = m.create(ratio).mult(10);
            if (r.value == 1) {
                return safeDiv(m.create(s(last)).add(m.create(s(first))).mult(n), m.create(2));
            }
            if (r.pow(2).value == 1) {
                if (n % 2 == 0) {
                    return m.create(this.b).mult(n / 2);
                } else {
                    return m.create(this.b).mult(n / 2).subtract(s(first));
                }
            }
            NumberTheory.ModularNumber<ModM> a = m.create(s(last));
            NumberTheory.ModularNumber<ModM> d = m.create(-this.b);
            NumberTheory.ModularNumber<ModM> t1 = a.subtract(a.add(d.mult(n)).mult(r.pow(n)));
            NumberTheory.ModularNumber<ModM> t1r = safeDiv(t1, m.create(1).subtract(r));
            NumberTheory.ModularNumber<ModM> t2 = d.mult(r).mult(m.create(1).subtract(r.pow(n)));
            NumberTheory.ModularNumber<ModM> t2r = safeDiv(t2, m.create(1).subtract(r).pow(2));

            return t1r.add(t2r);
        }

        long firstIndexAtLeast(long lowerBound) {
            long i = (lowerBound - a) / b;
            if (s(i) < lowerBound) i++;
            return i;
        }

        long lastIndexStrictlyLess(long upperBound) {
            long i = (upperBound - a) / b;
            if (s(i) >= upperBound) i--;
            return i;
        }

        long s(long i) {
            return a + b * i;
        }

        class ModM extends NumberTheory.Modulus<ModM> {
            public long modulus() {
                return modulus;
            }

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

        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<NumberTheory.ModularNumber<M>> factorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(create(1));
            }

            public NumberTheory.ModularNumber<M> create(long value) {
                return new NumberTheory.ModularNumber(value, this);
            }

        }

        public static class ModularNumber<M extends NumberTheory.Modulus<M>> {
            public final long value;
            public final M m;
            public final long MOD;

            public ModularNumber(long value, M m) {
                this.m = m;
                this.MOD = m.modulus();
                this.value = (value % MOD + MOD) % MOD;
            }

            public NumberTheory.ModularNumber<M> add(NumberTheory.ModularNumber<M> other) {
                return this.add(other.value);
            }

            public NumberTheory.ModularNumber<M> add(long other) {
                return m.create(value + other);
            }

            public NumberTheory.ModularNumber<M> subtract(NumberTheory.ModularNumber<M> other) {
                return this.subtract(other.value);
            }

            public NumberTheory.ModularNumber<M> subtract(long other) {
                return m.create(value - other);
            }

            public NumberTheory.ModularNumber<M> mult(NumberTheory.ModularNumber<M> other) {
                return this.mult(other.value);
            }

            public NumberTheory.ModularNumber<M> mult(long other) {
                return m.create(value * other);
            }

            public NumberTheory.ModularNumber<M> div(NumberTheory.ModularNumber<M> other) {
                return this.mult(other.inv());
            }

            public NumberTheory.ModularNumber<M> pow(int e) {
                if (e == 0) return m.create(1);
                if ((e & 1) > 0) return this.mult(this.pow(e - 1));
                return (this.mult(this)).pow(e / 2);
            }

            public NumberTheory.ModularNumber<M> pow(long e) {
                if (e == 0) return m.create(1);
                if ((e & 1) > 0) return this.mult(this.pow(e - 1));
                return (this.mult(this)).pow(e / 2);
            }

            public NumberTheory.ModularNumber<M> inv() {
                long g = m.modulus(), x = 0, y = 1;
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

                return m.create(x);
            }

            public String toString() {
                return String.valueOf(value);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

