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
        CPaintingMachines solver = new CPaintingMachines();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPaintingMachines {
        static final NumberTheory.Mod107 mod = new NumberTheory.Mod107();
        NumberTheory.ModularNumber<NumberTheory.Mod107>[] fact;

        public NumberTheory.ModularNumber<NumberTheory.Mod107> ncr(int n, int r) {
            if (r < 0 || n < r) return mod.create(0);
            return fact[n].div(fact[r].mult(fact[n - r]));
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt() - 1;

            fact = new NumberTheory.ModularNumber[n + 1];
            fact[0] = mod.create(1);
            for (int i = 1; i <= n; i++) {
                fact[i] = fact[i - 1].mult(i);
            }

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = fact[n].mult(n);

            for (int i = 1; i <= n - 2; i++) {
                answer = answer.subtract(fact[i].mult(fact[n - i]).mult(ncr(n - 1 - i, i)));
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

            public NumberTheory.ModularNumber<M> subtract(NumberTheory.ModularNumber<M> other) {
                return m.create(value - other.value);
            }

            public NumberTheory.ModularNumber<M> mult(NumberTheory.ModularNumber<M> other) {
                return m.create(value * other.value);
            }

            public NumberTheory.ModularNumber<M> mult(long other) {
                return m.create(value * other);
            }

            public NumberTheory.ModularNumber<M> div(NumberTheory.ModularNumber<M> other) {
                return this.mult(other.inv());
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

                assert (g == 1);
                assert (y == MOD || y == -MOD);

                return m.create(x);
            }

            public String toString() {
                return String.valueOf(value);
            }

        }

    }
}

