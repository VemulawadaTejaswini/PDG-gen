import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EBullet solver = new EBullet();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBullet {
        public static final int MOD = 1_000_000_007;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int nbZeros = 0;

            HashMap<EBullet.Fraction, EBullet.MyPair> fractions = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long p = in.nextLong();
                long q = in.nextLong();
                if (p == 0 && q == 0) {
                    nbZeros++;
                } else {
                    boolean isNb1 = true;
                    if (Math.abs(p) > Math.abs(q) || (Math.abs(p) == Math.abs(q) && p == -1)) {
                        long tmp = p;
                        p = -q;
                        q = tmp;
                        isNb1 = false;
                    }
                    EBullet.Fraction f = new EBullet.Fraction(p, q);
                    EBullet.MyPair pair = fractions.getOrDefault(f, new EBullet.MyPair(0, 0));
                    fractions.put(f, new EBullet.MyPair(pair.first + (isNb1 ? 1 : 0), pair.second + (isNb1 ? 0 : 1)));
                }
            }

            long res = 0;
            for (Entry<EBullet.Fraction, EBullet.MyPair> entry : fractions.entrySet()) {
                EBullet.MyPair pair = entry.getValue();
                long tmp = 0;
                tmp = pow(2, pair.first, MOD) - 1 + pow(2, pair.second, MOD) - 1;
                tmp *= res + 1;
                tmp %= MOD;
                res += tmp;
            }
            res += nbZeros;
            res %= MOD;


            out.println(res);

            //out.print("Case #"+ testNumber + ": ");
        }

        private static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        private static long pow(long a, long b, long mod) {
            if (b == 0)
                return 1;
            if (b == 1)
                return a;
            long c = a * a;
            c %= mod;
            if (a % 2 == 1) {
                return (a * c) % mod;
            } else {
                return c;
            }
        }

        public static void assertTrue(boolean shouldBeTrue) {
            assertTrue(shouldBeTrue, "");
        }

        public static void assertTrue(boolean shouldBeTrue, String message) {
            if (!shouldBeTrue)
                throw new RuntimeException(message);
        }

        public static class Fraction {
            long p;
            long q;

            public Fraction(long p, long q) {
                assertTrue(q != 0);
                if (q < 0) {
                    p = -p;
                    q = -q;
                }
                long res = gcd(Math.abs(p), Math.abs(q));
                this.p = p / res;
                this.q = q / res;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EBullet.Fraction fraction = (EBullet.Fraction) o;
                return p == fraction.p &&
                        q == fraction.q;
            }

            public int hashCode() {
                return Objects.hash(p, q);
            }

        }

        public static class MyPair implements Comparable<EBullet.MyPair> {
            long first;
            long second;

            public MyPair(long first, long second) {
                this.first = first;
                this.second = second;
            }

            public String toString() {
                //return "[" + first + ", " + second + "]";
                return first + ";" + second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EBullet.MyPair myPair = (EBullet.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(EBullet.MyPair p2) {
                int res = Long.compare(first, p2.first);
                return res != 0 ? res : Long.compare(second, p2.second);
            }

        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

