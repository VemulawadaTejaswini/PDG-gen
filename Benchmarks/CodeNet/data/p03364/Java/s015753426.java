import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            char[][] ar = new char[n][n];
            for (int i = 0; i < n; i++) ar[i] = in.scanChars(n);
            int ans = 0;
            for (int jj = 0; jj < n; jj++) {
                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    for (int j = jj, k = 0; k < n; k++, j = (j + 1) % n) {
                        int temp_j = (j - jj + n) % n;
                        int temp_i = i;
                        if (ar[i][j] != ar[temp_j][(temp_i + jj) % n]) flag = false;
                    }
                }
                if (flag) ans += n;

            }
            out.println(ans);
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

        public char[] scanChars(int n) {
            char[] ar = new char[n];
            int c = scan();
            boolean flag = true;
            while (isWhiteSpace(c)) c = scan();
            ar[0] = (char) c;
            for (int i = 1; i < n; i++) ar[i] = (char) (c = scan());
            return ar;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

