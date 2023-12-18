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
            solveMatrix(testNumber, in, out);
        }

        public void solveMatrix(int testNumber, InputReader in, PrintWriter out) {
            l = in.nextLong();
            a = in.nextLong();
            b = in.nextLong();
            modulus = in.nextInt();

            m = new ModM();
//        modulus = 1_000_000_007;

            long lastElement = s(l - 1);

            NumberTheory.ModularNumber<ModM> answer = m.create(0);
            long CAP = 1_000_000_000_000_000_000L;
            for (long tens = 1L; tens <= CAP; tens *= 10) {
                long first = Math.max(0, firstIndexAtLeast(tens));
                long last;
                if (tens != CAP) {
                    last = Math.min(l - 1, firstIndexAtLeast(tens * 10) - 1);
                } else {
                    last = l - 1;
                }

                if (first <= last) {
                    long count = last - first + 1;
//                answer = answer.mult(m.create(tens).mult(10).pow(count));

//                answer = answer.add(arithmeticGeometricSum3(tens, first, last));

                    NumberTheory.ModularNumber[][] x = {{answer, m.create(s(first)), m.create(1)}};
                    NumberTheory.ModularNumber[][] transform = {{m.create(tens).mult(10), m.create(0), m.create(0)}, {m.create(1), m.create(1), m.create(0)}, {m.create(0), m.create(b), m.create(1)}};

                    transform = matPow(transform, count);
                    x = matMult(x, transform);
//                System.out.println(Arrays.deepToString(x));
                    answer = x[0][0];
                }
                if (tens == CAP) {
                    break;
                }
            }
            out.println(answer);
        }

        NumberTheory.ModularNumber<ModM>[][] matMult(NumberTheory.ModularNumber[][] x, NumberTheory.ModularNumber[][] y) {
            NumberTheory.ModularNumber[][] result = new NumberTheory.ModularNumber[x.length][y[0].length];

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = m.create(0);
                    for (int k = 0; k < x[i].length; k++) {
                        result[i][j] = result[i][j].add(x[i][k].mult(y[k][j]));
                    }
                }
            }

            return result;
        }

        NumberTheory.ModularNumber<ModM>[][] matI(int n) {
            NumberTheory.ModularNumber<ModM>[][] result = new NumberTheory.ModularNumber[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = i == j ? m.create(1) : m.create(0);
                }
            }
            return result;
        }

        NumberTheory.ModularNumber<ModM>[][] matPow(NumberTheory.ModularNumber<ModM>[][] mat, long e) {
            if (e == 0) return matI(mat.length);
            if ((e & 1) > 0) return matMult(mat, matPow(mat, e - 1));
            return matPow(matMult(mat, mat), e / 2);
        }

        long firstIndexAtLeast(long lowerBound) {
            long i = (lowerBound - a) / b;
            if (s(i) < lowerBound) i++;
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

    static class NumberTheory {
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

