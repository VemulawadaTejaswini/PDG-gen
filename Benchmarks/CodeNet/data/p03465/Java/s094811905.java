import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int[] arr = in.readIntArray(n);
            AUtils.sort(arr);
            int sa = AUtils.sum(arr);
            int res = f(arr, n);
            for (int j = 0; j < 10; j++) {
                for (int i = 1; i < n; i++) {
                    int k = (int) (Math.random() * (i + 1));
                    if (k != i) {
                        int t = arr[i];
                        arr[i] = arr[k];
                        arr[k] = t;
                    }
                }
                res = Math.min(res, f(arr, n));
            }
            out.println((sa + res) / 2);
        }

        public int abs(int x) {
            return x < 0 ? -x : x;
        }

        public int f(int[] arr, int n) {
            int MAX = 5000;
            int[] dp = new int[MAX];
            for (int i = 0; i < MAX; i++) dp[i] = i;
            for (int num = n - 1; num >= 0; num--) {
                int[] ndp = new int[MAX];
                Arrays.fill(ndp, 1 << 29);
                for (int j = 0; j < MAX; j++) {
                    {
                        int t = abs(j + arr[num]);
                        if (t < MAX)
                            ndp[j] = Math.min(ndp[j], dp[t]);
                    }
                    {
                        int t = abs(j - arr[num]);
                        if (t < MAX)
                            ndp[j] = Math.min(ndp[j], dp[t]);
                    }
                }
                dp = ndp;
            }
            return dp[0];
        }

    }

    static class AUtils {
        public static int sum(int[] arr) {
            int sum = 0;
            for (int x : arr) {
                sum += x;
            }
            return sum;
        }

        public static void sort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int j = (int) (Math.random() * (i + 1));
                if (i != j) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            Arrays.sort(arr);
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int[] readIntArray(int tokens) {
            int[] ret = new int[tokens];
            for (int i = 0; i < tokens; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

