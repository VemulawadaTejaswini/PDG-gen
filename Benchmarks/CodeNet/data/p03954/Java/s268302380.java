import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Denis Nedelyaev
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD(in, out);
        solver.solve(1);
        out.close();
    }

    static class TaskD {
        private final FastScanner in;
        private final PrintWriter out;

        public TaskD(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) {
            int n = in.nextInt();
            int[] a = in.nextInts(2 * n - 1);
            int left = 0;
            int right = a.length;
            int[] alts = new int[a.length];
            int altCount = 0;
            boolean[] isAlt = new boolean[a.length];

            for (int i = 1; i + 1 < a.length; i++) {
                if ((a[i] - a[i - 1] < 0) != (a[i + 1] - a[i] < 0)) {
                    alts[altCount++] = i;
                    isAlt[i] = true;
                }
            }

            int[] toChange = new int[a.length];
            int[] toChangePos = new int[a.length];
            int[] temp = new int[3];

            while (left + 1 < right) {
                int toChangeCount = 0;

                for (int j = 0; j < altCount; j++) {
                    int i = alts[j];
                    isAlt[i] = false;
                    temp[0] = a[i - 1];
                    temp[1] = a[i];
                    temp[2] = a[i + 1];
                    Arrays.sort(temp);
                    toChange[toChangeCount] = temp[1];
                    toChangePos[toChangeCount] = i;
                    toChangeCount++;
                }

                for (int i = 0; i < toChangeCount; i++) {
                    a[toChangePos[i]] = toChange[i];
                }

                altCount = 0;

                left++;
                right--;

                for (int i = 0; i < toChangeCount; i++) {
                    int j = toChangePos[i];
                    for (int k = j - 1; k <= j + 1; k++) {
                        if (k > left && k + 1 < right && !isAlt[k]) {
                            if (a[k] != a[k - 1] && a[k + 1] != a[k] && (a[k] - a[k - 1] < 0) != (a[k + 1] - a[k] < 0)) {
                                alts[altCount++] = k;
                                isAlt[k] = true;
                            }
                        }
                    }
                }
            }

            out.println(a[left]);
        }

    }

    static class FastScanner {
        private final static int BUFFER_SIZE = 4096;
        private final InputStream in;
        private byte[] buffer = new byte[BUFFER_SIZE];
        private int pos = 0;
        private int size;

        public FastScanner(InputStream inputStream) throws IOException {
            in = inputStream;
            size = 0;
        }

        public int nextInt() {
            int c = skipWhitespace();

            int sign = -1;
            if (c == '-') {
                sign = 1;
                c = read();
            }

            int ans = 0;

            while (c > ' ') {
                ans *= 10;
                ans -= c - '0';
                c = read();
            }

            return sign * ans;
        }

        public int[] nextInts(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        private int skipWhitespace() {
            while (true) {
                int c = read();
                if (c > ' ' || c == -1) {
                    return c;
                }
            }
        }

        private int read() {
            if (pos >= size) {
                try {
                    size = in.read(buffer, 0, BUFFER_SIZE);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (size <= 0) {
                    return -1;
                }
                pos = 0;
            }
            return buffer[pos++];
        }

    }
}

