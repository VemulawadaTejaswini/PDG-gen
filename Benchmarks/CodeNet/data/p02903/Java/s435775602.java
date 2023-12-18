import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */

public class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }

    void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        A01Matrix solver = new A01Matrix();
        solver.solve(1, in, out);
        out.close();
    }

    static class A01Matrix {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int h = in.scanInt();
            int w = in.scanInt();
            int a = in.scanInt();
            int b = in.scanInt();
            int[] column = new int[w];
            Arrays.fill(column, b);
            int[][] ar = new int[h][w];
            for (int i = 0; i < h; i++) {
                int rem = a;
                int ct = 0;
                for (int j = 0; j < w; j++) if (column[j] > 0) ct++;
                if (ct >= a) {
                    for (int j = 0; j < w && ct > 0 && rem > 0; j++) {
                        if (column[j] > 0) {
                            ar[i][j] = 1;
                            ct--;
                            rem--;
                            column[j]--;
                        }
                    }
                } else {
                    rem = w - rem;
                    Arrays.fill(ar[i], 1);
                    for (int j = 0; j < w && ct > 0 && rem > 0; j++) {
                        if (column[j] > 0) {
                            ar[i][j] = 0;
                            ct--;
                            rem--;
                            column[j]--;
                        }
                    }
                }
            }
            for (int j = 0; j < w; j++)
                if (column[j] != 0) {
                    out.println(-1);
                    return;
                }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    out.print(ar[i][j]);
                }
                out.println();
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

