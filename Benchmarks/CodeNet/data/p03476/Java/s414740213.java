import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author khokharnikunj8
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        boolean[] isPrime;
        int[] calculate;

        private void pre() {
            isPrime = new boolean[2 * 100005];
            Arrays.fill(isPrime, true);
            isPrime[1] = false;
            for (int i = 2; i < 2 * 100005; i++) {
                if (!isPrime[i]) continue;
                for (int j = 2 * i; j < 2 * 100005; j += i) isPrime[j] = false;
            }
            calculate = new int[100005];
            for (int i = 1; i < 100005; i++) {
                calculate[i] += calculate[i - 1];
                if ((i & 1) == 1 && isPrime[i] && (isPrime[(i + 1) / 2])) calculate[i]++;
            }
        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            pre();
            int q = in.scanInt();
            while (q-- > 0) {
                int l = in.scanInt(), r = in.scanInt();
                out.println(calculate[r] - calculate[l - 1]);
            }
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int total;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= total) {
                index = 0;
                try {
                    total = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (total <= 0) return -1;
            }
            return buf[index++];
        }

        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
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
                }
            }
            return neg * integer;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

