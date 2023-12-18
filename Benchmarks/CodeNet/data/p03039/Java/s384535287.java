import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
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
        ECellDistance solver = new ECellDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECellDistance {
        NumberTheory.Mod107 mod = new NumberTheory.Mod107();
        NumberTheory.ModularNumber<NumberTheory.Mod107>[] fact;

        public NumberTheory.ModularNumber<NumberTheory.Mod107> ncr(int n, int r) {
            if (r < 0 || n < r) return mod.create(0);
            return fact[n].div(fact[r].mult(fact[n - r]));
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();

            fact = new NumberTheory.ModularNumber[n * m + 1];
            fact[0] = mod.create(1);
            for (int i = 1; i <= n * m; i++) {
                fact[i] = fact[i - 1].mult(i);
            }

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = mod.create(0);
            answer = answer.add(compute(n, m, k));
//        answer = answer.add(compute(m, n, k));

            answer = answer.mult(ncr(n * m, k));
            answer = answer.mult(ncr(k, 2));
//        answer = answer.mult(ncr(k, 2));

            out.println(answer);
        }

        NumberTheory.ModularNumber<NumberTheory.Mod107> compute(int n, int m, int k) {
            NumberTheory.ModularNumber<NumberTheory.Mod107> result = mod.create(0);

            for (int i = 0; i < n; i++) {
                NumberTheory.ModularNumber<NumberTheory.Mod107> avg1 = mod.create(n - 1 - i).add(1).div(2).mult(n - 1 - i);
                avg1 = avg1.add(mod.create(i + 1).div(2).mult(i));
                avg1 = avg1.mult(m);
                for (int j = 0; j < m; j++) {
                    NumberTheory.ModularNumber<NumberTheory.Mod107> avg2 = mod.create(m - 1 - j).add(1).div(2).mult(m - 1 - j);
                    avg2 = avg2.add(mod.create(j + 1).div(2).mult(j));
                    avg2 = avg2.mult(n);

                    NumberTheory.ModularNumber<NumberTheory.Mod107> avg = avg1.add(avg2).div(mod.create(n).mult(m).subtract(1));

//                System.out.println(avg1 + " " + avg2 + " " + avg);
                    result = result.add(avg);
                }
            }

            return result.div(n).div(m);
        }

    }

    static class NumberTheory {
        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            public abstract long modulus();

            public NumberTheory.ModularNumber<M> create(long value) {
                return new NumberTheory.ModularNumber(value, this);
            }

        }

        public static class Mod107 extends NumberTheory.Modulus<NumberTheory.Mod107> {
            public long modulus() {
                return 1_000_000_007L;
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

            public NumberTheory.ModularNumber<M> div(long other) {
                return this.div(m.create(other));
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

    }
}

