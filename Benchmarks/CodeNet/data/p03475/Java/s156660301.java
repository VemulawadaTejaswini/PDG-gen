import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int nstations = in.nextInt();
            int[] duration = new int[nstations - 1];
            int[] delay = new int[nstations - 1];
            int[] period = new int[nstations - 1];
            for (int i = 0; i < nstations - 1; i++) {
                duration[i] = in.nextInt();
                delay[i] = in.nextInt();
                period[i] = in.nextInt();
            }

            for (int i = 0; i < nstations - 1; i++) {
                int time = delay[i] + duration[i];
                for (int j = i + 1; j < nstations - 1; j++) {
                    if (time <= delay[j]) {
                        time = delay[j] + duration[j];
                        continue;
                    }
                    int nTrainDeparts = (time - delay[j] - period[j]) / period[j] + 1;
                    int nextDepartTime = period[j] * nTrainDeparts + delay[j];
                    time = nextDepartTime + duration[j];
                }
                out.println(time);
            }

            out.println(0);
        }

    }

    static class InputReader {
        final InputStream is;
        final byte[] buffer = new byte[1024];
        int curCharIdx;
        int nChars;

        public InputReader(InputStream is) {
            this.is = is;
        }

        public int read() {
            if (curCharIdx >= nChars) {
                try {
                    curCharIdx = 0;
                    nChars = is.read(buffer);
                    if (nChars == -1) {
                        return -1;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return buffer[curCharIdx++];
        }

        public int nextInt() {
            int sign = 1;
            int c = skipDelims();
            if (c == '-') {
                sign = -1;
                c = read();
                if (isDelim(c)) {
                    throw new RuntimeException("Incorrect format");
                }
            }
            int val = 0;
            while (c != -1 && !isDelim(c)) {
                if (!isDigit(c)) {
                    throw new RuntimeException("Incorrect format");
                }
                val = 10 * val + (c - '0');
                c = read();
            }
            return val * sign;
        }

        private final int skipDelims() {
            int c = read();
            while (isDelim(c)) {
                c = read();
            }
            return c;
        }

        private static boolean isDelim(final int c) {
            return c == ' ' ||
                   c == '\n' ||
                   c == '\t' ||
                   c == '\r' ||
                   c == '\f';
        }

        private static boolean isDigit(final int c) {
            return '0' <= c && c <= '9';
        }

    }
}

