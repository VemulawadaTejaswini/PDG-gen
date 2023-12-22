import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CWalkingTakahashi solver = new CWalkingTakahashi();
        solver.solve(1, in, out);
        out.close();
    }

    static class CWalkingTakahashi {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
        /*
               6 , 4
               =======
               0 = + ; 1 = -

               1) 6 + 2 x 4 = 14
               2) 6 + 4 - 4 = 6
               3) 6 - 2 x 4 = -2 ( .)

               7 , d= 3  k= 4
               =======

               1) 7 + 4 x  3  = 19  hi = 4
               2) 7 + 2 x 3 = 13
               3) 7 + 0 = 7
               4) 7 + (-2) x 3 = 1 (.)
               5) 7 + (-4) x 3 = -5   lo = -4

               -10 , 5 moves , d = 2
               ======================

               1) -10 + 2 x 5 = 0 (.)
               2) -10 + 2 x 3 = -4
               3) -10 + 2 x 1 = -8
               4) -10 + 2 x (-1) = -12
               5) -10 + 2 x (-3) = -16
               6) -10 + 2 x (-5) = -20


               7 , 6 moves , d= 1
               =======

               1) 7 + 4 x  3  = 19
               2) 7 + 2 x 3 = 13
               3) 7 + 0 = 7
               4) 7 + (-2) x 3 = 1 (.)
               5) 7 + (-4) x 3 = -5

         */

            // Since the pattern is decreasing as per the abs value , we can binary search
            // max and min effective ?
            // +k to -k

            long x = in.readLong(), k = in.readLong(), d = in.readLong();

            long lo = -k, hi = k;
            long ans = Long.MAX_VALUE;

            while (lo < hi) {
                long mid = lo + (hi - lo) / 2;

                //Need to decide if mid is valid as we might need to shift + 1
                // if moves are even then always even eff achieved

                // k and mid are same modulo so normal logic
                // if moves are odd then always odd eff achieved
                // k and mid are diff modulo , shift mid to +1 and perform logic
                if (k % 2 != mid % 2) {
                    mid++;
                }

                // is abs value with curr mid (eff) min ,  decrease hi , else increase lo

                long tmp = Math.abs(x + mid * d);
                if (ans > (tmp)) {
                    ans = tmp;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }

            }

            System.out.println(ans);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

