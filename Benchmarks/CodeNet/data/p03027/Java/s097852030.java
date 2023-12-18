import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

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
        EProductOfArithmeticProgression solver = new EProductOfArithmeticProgression();
        solver.solve(1, in, out);
        out.close();
    }

    static class EProductOfArithmeticProgression {
        static final EProductOfArithmeticProgression.Mod103 m = new EProductOfArithmeticProgression.Mod103();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int q = in.nextInt();

            NumberTheory.ModularNumber<EProductOfArithmeticProgression.Mod103>[] fact = new NumberTheory.ModularNumber[(int) m.modulus()];

            for (int query = 0; query < q; query++) {
                long x = in.nextInt(), d = in.nextInt();
                int n = in.nextInt();

                if (n >= m.modulus() || x == 0) {
                    out.println(0);
                    continue;
                }

                NumberTheory.ModularNumber<EProductOfArithmeticProgression.Mod103> answer = m.create(1);
                answer = answer.mult(m.create(d).pow(n));
                int a1d = (int) m.create(x).div(d).subtract(1).value;
                if (a1d + n >= m.modulus() || a1d == 1) {
                    out.println(0);
                    continue;
                } else {
                    answer = answer.mult(m.fact(a1d + n));
                    answer = answer.div(m.fact(a1d));
                }
                out.println(answer);
            }

        }

        public static class Mod103 extends NumberTheory.Modulus<EProductOfArithmeticProgression.Mod103> {
            public long modulus() {
                return 1_000_003L;
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

    static class NumberTheory {
        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<NumberTheory.ModularNumber<M>> factorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(create(1));
            }

            public NumberTheory.ModularNumber<M> fact(int n) {
                while (factorial.size() <= n) {
                    factorial.add(factorial.get(factorial.size() - 1).mult(factorial.size()));
                }

                return factorial.get(n);
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

            public NumberTheory.ModularNumber<M> pow(int e) {
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
}

