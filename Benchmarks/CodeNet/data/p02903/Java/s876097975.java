import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.PriorityQueue;
import java.util.Collections;
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
            int[] row = new int[h];
            Arrays.fill(column, b);
            Arrays.fill(row, a);
            int[][] ar = new int[h][w];
            int aa = -1;
            int bb = -1;
            out:
            for (int i = 0; i <= h; i++) {
                for (int j = 0; j <= w; j++) {
                    if (i * a + (h - i) * (w - a) == j * b + (w - j) * (h - b)) {
                        aa = i;
                        bb = j;
                        break out;
                    }
                }
            }
            if (aa == -1) {
                out.println(-1);
                return;
            }
            for (int i = aa; i < h; i++) {
                row[i] = w - row[i];
            }
            for (int i = bb; i < w; i++) {
                column[i] = h - column[i];
            }

            for (int i = 0; i < h; i++) {
                PriorityQueue<Integer> pw = new PriorityQueue<>(Collections.reverseOrder());
                for (int j = 0; j < w; j++) {
                    if (column[j] != 0) {
                        pw.add((column[j] << 15) | j);
                    }
                }
                if (pw.size() < row[i]) {
                    out.println(-1);
                }
                for (int j = 0; j < row[i]; j++) {
                    int temp = pw.poll();
                    ar[i][temp & (0b111111111111111)] = 1;
                    column[temp & (0b111111111111111)]--;
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

