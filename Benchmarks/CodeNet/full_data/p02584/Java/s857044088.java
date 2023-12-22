/*
 * author: Anuj Sahai
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    private static class Solution {
        void solve() {
            long x = or.nextLong();
            final long k = or.nextLong();
            final long d = or.nextLong();
            if (x < 0) {
                x = -x;
            }
            BigInteger bigX = BigInteger.valueOf(x);
            BigInteger bigK = BigInteger.valueOf(k);
            BigInteger bigD = BigInteger.valueOf(d);
            BigInteger totalD = bigK.multiply(bigD);
            BigInteger rem = totalD.subtract(bigX);

            if (rem.compareTo(BigInteger.ZERO) < 0) {
                pw.println(rem.abs());
                return;
            }

            if (rem.compareTo(BigInteger.ZERO) == 0) {
                pw.println(0);
                return;
            }

            BigInteger bigMod = rem.mod(bigD);
            if (bigMod.compareTo(BigInteger.ZERO) == 0) {
                if ((rem.divide(bigD)
                        .mod(BigInteger.TWO)
                        .compareTo(BigInteger.ZERO) == 0)) {
                    pw.println(0);
                } else {
                    pw.println(bigD);
                }
                return;
            }

            pw.println(bigD.subtract(bigMod));
        }

        final PrintWriter pw; // pw.println(...);
        final OpReader or; // or.next...();

        Solution() {
            pw = new PrintWriter(System.out);
            or = new OpReader();
        }

        void tearDown() {
            pw.close();
        }
    }

    private static class OpReader {
        final BufferedReader br;
        StringTokenizer st;

        public OpReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32 * 1024);
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }

    public static void main(String[] args) {
        final Solution solution = new Solution();
        solution.solve();
        solution.tearDown();
    }
}
