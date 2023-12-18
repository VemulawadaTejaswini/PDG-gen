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
        ESecondSum solver = new ESecondSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESecondSum {
        int[][] max;

        public int findIt(int l, int r) {
            int j = (int) (Math.log10(r - l + 1) / Math.log10(2));
            return Math.max(max[l][j], max[r - (1 << j) + 1][j]);
        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = in.scanInt();
            max = new int[n][17];
            for (int i = 0; i < n; i++) Arrays.fill(max[i], -1);
            for (int i = 0; i < n; i++) max[i][0] = p[i];
            for (int j = 1; (1 << j) <= n; j++) {
                for (int i = 0; (i + (1 << j) - 1) < n; i++) {
                    max[i][j] = Math.max(max[i][j - 1], max[i + (1 << (j - 1))][j - 1]);
                }
            }
            long ans = 0;
            int[] left = new int[n];
            for (int i = 0; i < n; i++) {
                left[i] = -1;
                {
                    int low = 0;
                    int high = i - 1;
                    while (low <= high) {
                        int mid = (low + high) >> 1;
                        if (findIt(mid, i - 1) >= p[i]) {
                            left[i] = mid;
                            low = mid + 1;
                        } else {
                            high = mid - 1;
                        }
                    }
                }
            }
            int[] right = new int[n];
            for (int i = 0; i < n; i++) {
                right[i] = n;
                {
                    int low = i + 1;
                    int high = n - 1;
                    while (low <= high) {
                        int mid = (low + high) >> 1;
                        if (findIt(i + 1, mid) >= p[i]) {
                            right[i] = mid;
                            high = mid - 1;
                        } else {
                            low = mid + 1;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (left[i] != -1) {
                    int low = 0;
                    int high = left[i] - 1;
                    int index = -1;
                    while (low <= high) {
                        int mid = (low + high) >> 1;
                        if (findIt(mid, left[i] - 1) >= p[i]) {
                            index = mid;
                            low = mid + 1;
                        } else {
                            high = mid - 1;
                        }
                    }
                    ans += ((left[i] - index + 0l) * (right[i] - i + 0l) * p[i]);
                }
                if (right[i] != n) {
                    int low = right[i] + 1;
                    int high = n - 1;
                    int index = n;
                    while (low <= high) {
                        int mid = (low + high) >> 1;
                        if (findIt(right[i] + 1, mid) >= p[i]) {
                            index = mid;
                            high = mid - 1;
                        } else {
                            low = mid + 1;
                        }
                    }
                    ans += ((i - left[i] + 0l) * (index - right[i] + 0l) * p[i]);
                }

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

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

