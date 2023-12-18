import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
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
        DSumOfLargeNumbers solver = new DSumOfLargeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfLargeNumbers {
        private static final long MOD = 1_000_000_007;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long res = solveMe3(n, k);
            out.println(res);
            //out.print("Case #"+ testNumber + ": ");
        }

        private long solveMe3(int n, int k) {
            DSumOfLargeNumbers.MyPair[] dp = new DSumOfLargeNumbers.MyPair[n + 2];
            long res = 1;
            for (int i = 0; i < 100; i++) {
                res *= 10;
                res %= MOD;
            }
            //res = 10;

            long firsts = 0;
            long lasts = 0;
            int firstI = 0;
            int lastI = n;
            long resJ = 0;
            ArrayList<DSumOfLargeNumbers.MyPair> list = new ArrayList<>();
            for (int j = 1; j <= n + 1; j++) {
                firsts += firstI;
                lasts += lastI;
                firsts %= MOD;
                lasts %= MOD;
                firstI++;
                lastI--;
                resJ += res;
                resJ %= MOD;
                long first = (resJ + firsts) % MOD;
                long second = (resJ + lasts) % MOD;
                //long first = resJ+firsts;
                //long second = resJ+lasts;
                if (j >= k) {
                    if (first <= second) {
                        list.add(new DSumOfLargeNumbers.MyPair(first, second));
                    } else {
                        assertTrue(false);
                        list.add(new DSumOfLargeNumbers.MyPair(first, MOD - 1));
                        list.add(new DSumOfLargeNumbers.MyPair(0, second));
                    }
                }

            }


            Collections.sort(list);
            //d(stringMeDeb(list.toArray()));
            //d("dp2 = " + stringMeDeb(dp2));
            dp = null;
            long next = 0;
            long nb = 0;
            for (int i = 0; i < list.size(); i++) {
                if (next < list.get(i).first) {
                    next = list.get(i).first;
                }
                if (next <= list.get(i).second) {
                    nb += list.get(i).second - next + 1;
                    next = list.get(i).second + 1;
                }

            }

            return nb;
        }

        public static void assertTrue(boolean shouldBeTrue) {
            assertTrue(shouldBeTrue, "");
        }

        public static void assertTrue(boolean shouldBeTrue, String message) {
            if (!shouldBeTrue)
                throw new RuntimeException(message);
        }

        public static class MyPair implements Comparable<DSumOfLargeNumbers.MyPair> {
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
                DSumOfLargeNumbers.MyPair myPair = (DSumOfLargeNumbers.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(DSumOfLargeNumbers.MyPair p2) {
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

    }
}

