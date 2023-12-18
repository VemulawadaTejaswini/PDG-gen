import java.io.*;
import java.util.*;

/**
 * AtCode's challenges: https://atcoder.jp/contests/dp/tasks/dp_b
 *
 * @author hai
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scan scan = new Scan();

        // Reading input
        int n = scan.scanInt();
        int k = scan.scanInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scan.scanInt();
        }

        int[] minCosts = new int[n];
        // n >= 2
        minCosts[0] = 0;
        minCosts[1] = Math.abs(heights[0] - heights[1]);
      
        for (int i = 2; i < n; i++) {
            // max index for current k
            int sliding = i > k ? k : i;

            int minCost = Integer.MAX_VALUE;
            for (int j = i - 1; j >= Math.abs(i - sliding); j--) {
                int currCost = minCosts[j] + Math.abs(heights[i] - heights[j]);
                
                minCost = Math.min(minCost, currCost);
            }
            minCosts[i] = minCost;
        }

        System.out.println(minCosts[n - 1]);
    }
  
  public static class Scan {
        private byte[] buf = new byte[1024];
        private int index;
        private InputStream in;
        private int total;

        public Scan() {
            in = System.in;
        }

        public int scan() throws IOException {
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

        public int scanInt() throws IOException {
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

    class Print {
        private final BufferedWriter bw;

        public Print() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(String str) throws IOException {
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