import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.BitSet;
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
        EVirusTree2 solver = new EVirusTree2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EVirusTree2 {
        static final NumberTheory.Mod107 m = new NumberTheory.Mod107();
        List<Integer>[] adj;
        int k;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            k = in.nextInt();

            adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                adj[a].add(b);
                adj[b].add(a);
            }

            BitSet visited = new BitSet(n);
            visited.set(0);

            long answer;
            int childCount = adj[0].size();
            long childColors = m.npr(k, childCount + 1).value;
            long sum = 1;
            for (int j : adj[0]) {
                if (visited.get(j))
                    continue;

                visited.set(j);
                sum = m.mult(sum, f(j, visited));
            }
            //        System.out.println(i + " " +childColors + " " + childCount + " " + sum);
            answer = m.mult(childColors, sum);

            out.println(answer);
        }

        long f(int i, BitSet visited) {
            int childCount = adj[i].size() - 1;
            if (childCount > 0) {
                long childColors = k - 2 < 0 ? 0 : m.npr(k - 2, childCount).value;

                long sum = 1;
                for (int j : adj[i]) {
                    if (visited.get(j))
                        continue;

                    visited.set(j);
                    sum = m.mult(sum, f(j, visited));
                }

                return m.mult(childColors, sum);
            } else {
                return 1;
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
        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<Long> factorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(1L);
            }

            public NumberTheory.ModularNumber<M> fact(int n) {
                while (factorial.size() <= n) {
                    factorial.add(mult(factorial.get(factorial.size() - 1), factorial.size()));
                }

                return create(factorial.get(n));
            }

            public NumberTheory.ModularNumber<M> npr(int n, int r) {
                ASSERT(n >= 0);
                if (r < 0 || n < r)
                    return create(0);
                return fact(n).div(fact(n - r));
            }

            public long normalize(long x) {
                x %= modulus();
                if (x < 0)
                    x += modulus();
                return x;
            }

            public long mult(long a, long b) {
                return normalize(a * b);
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

            public ModularNumber(long value, M m) {
                this.m = m;
                value = value % m.modulus();
                if (value < 0)
                    value += m.modulus();
                this.value = value;
            }

            public NumberTheory.ModularNumber<M> mult(NumberTheory.ModularNumber<M> other) {
                ASSERT(m.modulus() == other.m.modulus());
                return this.mult(other.value);
            }

            public NumberTheory.ModularNumber<M> mult(long other) {
                return m.create(value * other);
            }

            public NumberTheory.ModularNumber<M> div(NumberTheory.ModularNumber<M> other) {
                ASSERT(m.modulus() == other.m.modulus());
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

                ASSERT(g == 1);
                ASSERT(y == m.modulus() || y == -m.modulus());

                return m.create(x);
            }

            public String toString() {
                return String.valueOf(value);
            }

        }

    }
}

