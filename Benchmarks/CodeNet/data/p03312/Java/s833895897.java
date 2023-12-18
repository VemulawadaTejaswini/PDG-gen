import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyScan in, PrintWriter out) {

            int n = in.nextInt();
            int[] data = in.na(n);
            TaskD.SumOver sumOver = new TaskD.SumOver(data);


            long[][] best = new long[n][0];


            int e = n - 1;

            for (int t = n - 2; t > 1; t--) {
                best[t] = new long[]{sumOver.sum(t, e - 1), sumOver.sum(e, n - 1)};
                Arrays.sort(best[t]);
                while (Math.min(sumOver.sum(t, e - 2), sumOver.sum(e - 1, n - 1)) > best[t][0]) {
                    e--;
                    best[t] = new long[]{sumOver.sum(t, e - 1), sumOver.sum(e, n - 1)};
                    Arrays.sort(best[t]);
                }
            }

            long ans = Long.MAX_VALUE;
            e = 1;
            for (int s = 1; s < n - 2; s++) {
                long[] b = new long[]{sumOver.sum(0, e - 1), sumOver.sum(e, s)};
                Arrays.sort(b);
                while (Math.min(sumOver.sum(0, e), sumOver.sum(e + 1, s)) > b[0]) {
                    e++;
                    b = new long[]{sumOver.sum(0, e - 1), sumOver.sum(e, s)};
                    Arrays.sort(b);
                }
                ans = Math.min(Math.max(b[1], best[s + 1][1]) - Math.min(b[0], best[s + 1][0]), ans);
            }

            out.println(ans);
        }

        public static class SumOver {
            private long[] sum;

            public SumOver(int[] data) {
                sum = new long[data.length + 1];
                for (int i = 0; i < data.length; i++) {
                    sum[i + 1] = sum[i] + data[i];
                }
            }

            public long sum(int from, int to) {
                return sum[to + 1] - sum[from];
            }

        }

    }

    static class MyScan {
        private final InputStream in;
        private byte[] inbuf = new byte[1024];
        public int lenbuf = 0;
        public int ptrbuf = 0;

        public MyScan(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = in.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public int[] na(int n) {
            int[] k = new int[n];
            for (int i = 0; i < n; i++) {
                k[i] = nextInt();
            }
            return k;
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

    }
}

