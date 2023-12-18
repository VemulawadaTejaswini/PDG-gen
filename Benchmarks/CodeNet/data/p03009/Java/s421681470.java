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
        EBalancedPiles solver = new EBalancedPiles();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBalancedPiles {
        private NumberTheory.Mod107 m = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), h = in.nextInt(), d = in.nextInt();

//        out.println(solveSlow(n, h, d));
            out.println(solveFast(n, h, d));
        }

        public long solveFast(int n, int h, int d) {

            NumberTheory.ModularNumber[] mult1 = new NumberTheory.ModularNumber[n + 1];
            mult1[0] = m.create(1);
            mult1[1] = m.create(1);
            for (int i = 2; i <= n; i++) {
                mult1[i] = mult1[i - 1].mult(n + 1 - i);
            }

            NumberTheory.ModularNumber[] mult2 = new NumberTheory.ModularNumber[n + 1];
            mult2[0] = m.create(0);
            for (int i = 1; i < n; i++) {
                mult2[i] = mult2[i - 1].add(mult1[i].mult(n - i));
            }
            mult2[n] = mult2[n - 1].add(mult1[n].mult(n));

            NumberTheory.ModularNumber[] ans = new NumberTheory.ModularNumber[h + 1];
            NumberTheory.ModularNumber[] sum = new NumberTheory.ModularNumber[h + 1];
            NumberTheory.ModularNumber sumLastD = m.create(0);

            sum[0] = m.create(n);
            sumLastD = sumLastD.add(sum[0]);
            for (int i = 1; i <= h; i++) {
                ans[i] = sumLastD;
                sum[i] = ans[i].mult(mult2[n]);
                sumLastD = sumLastD.add(sum[i]);
                if (i - d >= 0)
                    sumLastD = sumLastD.subtract(sum[i - d]);
            }

//        System.out.println(Arrays.toString(mult1));
//        System.out.println(Arrays.toString(mult2));
//        System.out.println(Arrays.toString(ans));

            NumberTheory.ModularNumber answer = m.create(0);
            answer = ans[h].mult(mult1[n]);
            return answer.value;
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
        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
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
                ASSERT(m.modulus() == other.m.modulus());
                return this.add(other.value);
            }

            public NumberTheory.ModularNumber<M> add(long other) {
                return m.create(value + other);
            }

            public NumberTheory.ModularNumber<M> subtract(NumberTheory.ModularNumber<M> other) {
                ASSERT(m.modulus() == other.m.modulus());
                return this.subtract(other.value);
            }

            public NumberTheory.ModularNumber<M> subtract(long other) {
                return m.create(value - other);
            }

            public NumberTheory.ModularNumber<M> mult(NumberTheory.ModularNumber<M> other) {
                ASSERT(m.modulus() == other.m.modulus());
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

