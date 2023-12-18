import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        TaskS solver = new TaskS();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskS {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] ints = in.nextLine().chars().map(i -> i - '0').toArray();
            for (int mask = 0; mask <= (1 << 3) - 1; mask++) {
                int sum = ints[0];
                String s = Integer.toString(ints[0]);
                for (int i = 0; i < 3; i++) {
                    sum += ((mask >> i) & 1) == 1 ? ints[i + 1] : -ints[i + 1];
                    s += ((mask >> i) & 1) == 1 ? '+' : '-';
                    s += Integer.toString(ints[i + 1]);
                }
                if (sum == 7) {
                    out.println(s + "=7");
                    return;
                }
            }
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

        public String nextLine() {
            return nextLine(16);
        }

        public String nextLine(int size) {
            int c = read();
            while (c == '\n' || c == '\t' || c == '\r') {
                c = read();
            }
            if (c == -1) {
                return null;
            }
            StringBuilder sb = new StringBuilder(size);
            while (c != -1 && c != '\n' && c != '\t' && c != '\r') {
                sb.appendCodePoint(c);
                c = read();
            }
            return sb.toString();
        }

    }
}

