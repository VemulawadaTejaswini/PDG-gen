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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        static final NumberTheory.Mod107 mod = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();

            NumberTheory.ModularNumber<NumberTheory.Mod107>[] x = new NumberTheory.ModularNumber[n];
            NumberTheory.ModularNumber<NumberTheory.Mod107>[] y = new NumberTheory.ModularNumber[m];

            for (int i = 0; i < n; i++) {
                x[i] = mod.create(in.nextInt());
            }
            for (int i = 0; i < m; i++) {
                y[i] = mod.create(in.nextInt());
            }

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = mod.create(1);

            answer = answer.mult(consolidate(x));
            answer = answer.mult(consolidate(y));

            out.println(answer);
        }

        public NumberTheory.ModularNumber<NumberTheory.Mod107> consolidate(NumberTheory.ModularNumber<NumberTheory.Mod107>[] x) {
            int n = x.length;

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = mod.create(0);
            for (int i = 0; i + 1 < n; i++) {
                NumberTheory.ModularNumber<NumberTheory.Mod107> area = x[i + 1].subtract(x[i]);
                NumberTheory.ModularNumber<NumberTheory.Mod107> count = mod.create(1);
                count = count.mult(i + 1); // left
                count = count.mult(n - 1 - (i + 1) + 1); // right

                answer = answer.add(area.mult(count));
            }

            return answer;
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

            public String toString() {
                return String.valueOf(value);
            }

        }

    }
}

