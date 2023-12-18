import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
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
        EActiveInfants solver = new EActiveInfants();
        solver.solve(1, in, out);
        out.close();
    }

    static class EActiveInfants {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
        /*if (testNumber==1) {
            random();
            return;
        }*/
            int n = in.nextInt();
            int[] a = in.nextArrInt(n);
            //long res = solveMe(n, a);
            long res = solveMe(n, a);
            //out.print("Case #"+ testNumber + ": ");
            out.println(res);

        }

        private long solveMe(int n, int[] a) {
            EActiveInfants.MyPair[] pair = new EActiveInfants.MyPair[n];
            for (int i = 0; i < n; i++) {
                pair[i] = new EActiveInfants.MyPair(a[i], i);
            }

            Arrays.sort(pair, Collections.reverseOrder());
            Long[][] dp = new Long[n + 1][n + 1];
            //arrayFill(dp[0], 0L);
            dp[0][0] = 0L;
            long res = 0;
            for (int i = 0; i < n; i++) {
                //dp[i+1][0] = 0L;
                for (int nbLeft = 0; nbLeft <= i + 1; nbLeft++) {
                    int nbRight = i + 1 - nbLeft;
                    //This element was put on the left => he occupies the position: left
                    int posIfOnLeft = nbLeft - 1;
                    int posIfOnRight = n - nbRight;

                    dp[i + 1][nbLeft] = Math.max(
                            nbLeft == 0 ? 0 : (dp[i][nbLeft - 1] + pair[i].first * Math.abs(pair[i].second - posIfOnLeft)),
                            nbRight == 0 ? 0 : (dp[i][nbLeft]) + pair[i].first * Math.abs(pair[i].second - posIfOnRight));

                    if (i == n - 1) {
                        res = Math.max(res, dp[i + 1][nbLeft]);
                    }
                }
                //d("i=" + i + "; " + stringMeDeb(dp));
            }
            return res;
        }

        public static class MyPair implements Comparable<EActiveInfants.MyPair> {
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
                EActiveInfants.MyPair myPair = (EActiveInfants.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(EActiveInfants.MyPair p2) {
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

        public int[] nextArrInt(int n) {
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++)
                a[i] = nextInt();
            return a;
        }

    }
}

