import static java.lang.Math.*;
// import java.math.BigInteger;
import java.io.*;
import java.util.*;

// solution code is in solve()

public class Main {
    final static long mod = 1_000_000_007l;
    final static int maxn = 1_000_007;
    final static int infty = 1_000_000_009  ;

    // final static boolean DEBUG = true;
    final static boolean DEBUG = false;

    static class Solver {

        int[] A;
        int[] dp;

        public void solve() {
            int n = in.gi();
            A = new int[n + 1];
            dp = new int[n + 1];

            for (int j = 1; j <= n; j++) {
                A[j] = in.gi();
            }
    
            dp[1] = 0; dp[0] = infty;
            for (int j = 2; j <= n; j++) {
                dp[j] = min(dp[j - 2] + abs(A[j - 2] - A[j]), dp[j - 1] + abs(A[j - 1] - A[j]));
            }

            println(dp[n]);
        }





        PrintWriter out;
        FastInput in;
        Random random_source;

        long modexp(long x, long ex) {
            long ans = 1l;
            for (; ex > 0; ex >>= 1l, x = (x * x) % mod) {
                if ((ex & (1l)) > 0) ans = (ans * x) % mod;
            }
            return ans;
        }

        long gcd(long x, long y) {
            while (y > 0) {
                long t = x % y;
                x = y; y = t;
            }
            return x;
        }

        // Random numbers

        void initRandom(Long x) {
            random_source = new Random(x);
        }

        void initRandom() {
            random_source = new Random(System.currentTimeMillis());
        }

        int rand(int bound) { // [0..bound)
            return random_source.nextInt(bound);
        }

        // Convenience functions

        void debug(Object... obj) {
            if (DEBUG) {
                out.print("# ");
                for (Object o : obj) {
                    out.print(o.toString());
                    out.print(" ");
                }
                out.println("");
                out.flush();
            }
        }

       
        String a2s(Object[] A) {
            return Arrays.toString(A);
        }

        String a2s(int[] A) {
            return Arrays.toString(A);
        }

        String a2s(long[] A) {
            return Arrays.toString(A);
        }


        void flush() {
            out.flush();
        }

        void print(Object... obj) {
            for (Object o : obj) {
                out.print(o.toString());
            }
        }

        void println(Object... obj) {
            for (Object o : obj) {
                out.print(o.toString());
            }
            out.println("");
        } 

        void verify(boolean check) {    // equivalent to assert
            if (!check) {
                throw new RuntimeException("Verification error");
            }
        }

        void reverse(long[] A, int l, int r) {
            int i = l, j = r - 1;
            while (i < j) {
                long t = A[i];
                A[i] = A[j];
                A[j] = t;
                i++; j--;
            }
        }

        void reverse(int[] A, int l, int r) {
            int i = l, j = r - 1;
            while (i < j) {
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
                i++; j--;
            }
        }

        // Measure time 

        long initTime;

        public void startWatch() {
            if (DEBUG) {
                initTime = System.nanoTime();
            }
        }

        public void endWatch() {
            if (DEBUG) {
                long current = System.nanoTime();
                long diff = current - initTime;
                long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                println("(Time: ", (double)diff / 1e9, ", Memory: ", memory/1000, "K)");            
            }
        }

        // Solver class constructor

        Solver(PrintWriter out, FastInput in) {
            this.out = out; this.in = in;
        }
    }

    public static void main(String args[]) {
        FastInput in = new FastInput(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(out, in);
        solver.startWatch();
        solver.solve();
        solver.endWatch();
        out.close();
    }
    
    static class FastInput {
        BufferedReader reader;
        StringTokenizer tok;

        public FastInput(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tok = null;
        }

        public String next() {
            while (tok == null || !tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return tok.nextToken();
        }

        public int gi() {
            return Integer.parseInt(next());
        }

        public long gl() {
            return Long.parseLong(next());
        }
    }

    static class Pair<A extends Comparable<A>, B extends Comparable<B>>
            implements Comparable<Pair<A, B>> {
        A F;
        B S;

        Pair(A x, B y) {
            F = x; S = y;
        }

        public boolean equals(Pair<A, B> oth) {
            return this.compareTo(oth) == 0;    
        }

        public int compareTo(Pair<A, B> Q) {
            if (this.F.compareTo(Q.F) == 0) {
                return this.S.compareTo(Q.S);
            } else {
                return this.F.compareTo(Q.F);
            }
        }

        public String toString() {
            return new StringBuilder("{")
                    .append(F.toString())
                    .append(", ")
                    .append(S.toString())
                    .append("}")
                    .toString();
        }
    }

    public static <A extends Comparable<A>, B extends Comparable<B>> Pair<A, B> make_pair(A a, B b) {
        return new Pair<A, B>(a, b);
    }

    static class IntPair extends Pair<Integer, Integer> {
        IntPair(Integer x, Integer y) {
            super(x, y);
        }
    }

    static class LongPair extends Pair<Long, Long> {
        LongPair(Long x, Long y) {
            super(x, y);
        }
    }
}
