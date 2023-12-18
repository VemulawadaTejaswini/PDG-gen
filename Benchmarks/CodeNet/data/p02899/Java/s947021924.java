import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.Random;
import java.util.Comparator;
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
        CGoToSchool solver = new CGoToSchool();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGoToSchool {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int[][] ar = new int[n][2];
            for (int i = 0; i < n; i++) {
                ar[i][0] = in.scanInt();
                ar[i][1] = i + 1;
            }
            CodeHash.shuffle(ar);
            Arrays.sort(ar, new Comparator<int[]>() {

                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            for (int i = 0; i < n; i++)
                out.print(ar[i][1] + " ");
        }

    }

    static class CodeHash {
        public static void shuffle(int[][] ar) {
            Random rd = new Random(new Random().nextInt());
            for (int i = 0; i < ar.length; i++) {
                int index = rd.nextInt(ar.length);
                int[] temp = ar[i];
                ar[i] = ar[index];
                ar[index] = temp;
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

