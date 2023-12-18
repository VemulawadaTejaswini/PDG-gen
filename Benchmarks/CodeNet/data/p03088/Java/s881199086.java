import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
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
        DWeLikeAGC solver = new DWeLikeAGC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLikeAGC {
        NumberTheory.Mod107 m = new NumberTheory.Mod107();
        static final int F = 4;
        static final String[] bannedStrings = {"AGCX",
                                               "GACX",
                                               "ACGX",
                                               "XAGC",
                                               "XGAC",
                                               "XACG",
                                               "AXGC",
                                               "AGXC"};
        static final String alphabet = "AGCT";

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            HashSet<Integer> banned = new HashSet<>();

            for (String b : bannedStrings) {
                for (int fill = 0; fill < F; fill++) {
                    int val = 0;
                    for (char c : b.toCharArray()) {
                        int cur = (c == 'X') ? fill : alphabet.indexOf(c);
                        val = val * F + cur;
                    }
                    banned.add(val);
                }
            }

            NumberTheory.ModularNumber[][] dp = new NumberTheory.ModularNumber[n + 1][F * F * F];
            for (int k = 0; k <= n; k++) {
                for (int i = 0; i < F * F * F; i++) {
                    dp[k][i] = m.create(0);
                }
            }
            for (int i = 0; i < F * F * F; i++) {
                dp[3][i] = m.create(1);
            }
            for (int banned3 : new int[]{0 * F * F + 1 * F + 2,
                                         1 * F * F + 0 * F + 2,
                                         0 * F * F + 2 * F + 1}) {
                dp[3][banned3] = m.create(0);
            }

            for (int i = 4; i <= n; i++) {
                NumberTheory.ModularNumber[] prev = dp[i - 1];
                NumberTheory.ModularNumber[] cur = dp[i];

                for (int three = 0; three < F * F * F; three++) {
                    int lastThree = (three * F) % (F * F * F);
                    for (int next = 0; next < F; next++) {
                        int newThree = lastThree + next;
                        if (banned.contains(three * F + next))
                            continue;
                        cur[newThree] = cur[newThree].add(prev[three]);
                    }
                }
            }

            NumberTheory.ModularNumber<NumberTheory.Mod107> answer = m.create(0);
            for (NumberTheory.ModularNumber x : dp[n]) {
                answer = answer.add(x);
            }

            out.println(answer);
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

