import static java.lang.Math.*;
// import java.math.BigInteger;
import java.io.*;
import java.util.*;

// solution code is in solve()

public class Main {
    final static long mod = 1_000_000_007l;
    final static int maxv = 1_000_07;
    final static long infty = 1_000_000_00009l  ;

    // final static boolean DEBUG = true;
    final static boolean DEBUG = false;

    static class Solver {

        
        public void matexp(long[][] A, long ex, long[][] Z) {
            int n = A.length;
            long[][] C = new long[n][n];
            long[][] T = new long[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    Z[i][j] = (i == j) ? 1 : 0;
                    C[i][j] = A[i][j];
                    T[i][j] = 0l;
                }
            }

            for (; ex > 0; ex >>= 1l) {
                if ((ex & 1l) > 0) {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            T[i][j] = Z[i][j];
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            Z[i][j] = 0;
                            for (int k = 0; k < n; k++) {
                                Z[i][j] = (Z[i][j] + T[i][k] * C[k][j]) % mod;
                            }
                        }
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        T[i][j] = C[i][j];
                    }
                }
            
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        C[i][j] = 0l;
                        for (int k = 0; k < n; k++) {
                            C[i][j] = (C[i][j] + T[i][k] * T[k][j]) % mod;
                        }
                    }
                } 
            }
        }

        public void solve() {
            int n = in.gi(); long k = in.gl();
            long[][] A = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = in.gl();
                }
            }

            long[][] B = new long[n][n];
            matexp(A, k, B);

            long ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans += B[i][j];
                    ans %= mod;
                }
            }

            println(ans);
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
