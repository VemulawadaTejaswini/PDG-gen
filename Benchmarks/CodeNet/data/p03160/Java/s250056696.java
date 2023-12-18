import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;

/**
 * Codechef's challenges: https://www.codechef.com/problems/COUPON#
 *
 * @author hai
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scan scan = new Scan();

        // Reading input
        int n = scan.scanInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scan.scanInt();
        }

        int[] smallestCost = new int[n];
        // because n > 2
        smallestCost[0] = 0;
        smallestCost[1] = Math.abs(heights[0] - heights[1]);

        for (int i = 2; i < n; i++) {
            int costPrev2 = smallestCost[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            int costPrev1 = smallestCost[i - 1] + Math.abs(heights[i] - heights[i - 1]);

            // compute the smallest cost for current i
            smallestCost[i] = costPrev1 < costPrev2 ? costPrev1 : costPrev2;
        }

        System.out.print(smallestCost[n-1]);
    }

    public static class Scan {
        private byte[] buf = new byte[1024];
        private int index;
        private InputStream in;
        private int total;

        Scan() {
            in = System.in;
        }

        int scan() throws IOException {
            if (total < 0)
                throw new InputMismatchException();
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0)
                    return -1;
            }
            return buf[index++];
        }

        int scanInt() throws IOException {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n))
                n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                } else throw new InputMismatchException();
            }
            return neg * integer;
        }

        public double scanDouble() throws IOException {
            double doub = 0;
            int n = scan();
            while (isWhiteSpace(n))
                n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n) && n != '.') {
                if (n >= '0' && n <= '9') {
                    doub *= 10;
                    doub += n - '0';
                    n = scan();
                } else throw new InputMismatchException();
            }
            if (n == '.') {
                n = scan();
                double temp = 1;
                while (!isWhiteSpace(n)) {
                    if (n >= '0' && n <= '9') {
                        temp /= 10;
                        doub += (n - '0') * temp;
                        n = scan();
                    } else throw new InputMismatchException();
                }
            }
            return doub * neg;
        }

        public String scanString() throws IOException {
            StringBuilder sb = new StringBuilder();
            int n = scan();
            while (isWhiteSpace(n))
                n = scan();
            while (!isWhiteSpace(n)) {
                sb.append((char) n);
                n = scan();
            }
            return sb.toString();
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
                return true;
            return false;
        }
    }

    public static class Print {
        private final BufferedWriter bw;

        Print() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        void print(int num) throws IOException {
            bw.append(String.valueOf(num));
        }

        void print(String str) throws IOException {
            bw.append(str);
        }

        public void printLine(String str) throws IOException {
            print(str);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

}