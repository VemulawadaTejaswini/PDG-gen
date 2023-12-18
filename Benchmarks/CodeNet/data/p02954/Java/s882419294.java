import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        DGatheringChildren solver = new DGatheringChildren();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGatheringChildren {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.nextString();
            int n = s.length();
            int i = 0;
            int j = 0;
            int ar[] = new int[n];
            for (int k = n - 1; k >= 0; k--) {
                if (s.charAt(k) == 'L')
                    i = k;
                ar[k] = i;
            }
            int ar2[] = new int[n];
            for (int k = 0; k < n; k++) {
                if (s.charAt(k) == 'R')
                    j = k;
                ar2[k] = j;
            }
            int arr[] = new int[n];
            for (int ii = 0; ii < n; ii++) {
                if (s.charAt(ii) == 'L')
                    continue;
                int dif = ar[ii] - ii;
                System.out.println(dif);
                if (dif % 2 == 0)
                    arr[ar[ii]]++;
                else
                    arr[ar[ii] - 1]++;
            }
            for (int ii = 0; ii < n; ii++) {
                if (s.charAt(ii) == 'R')
                    continue;
                int dif = ii - ar2[ii];
                if (dif % 2 == 0)
                    arr[ar2[ii]]++;
                else
                    arr[ar2[ii] + 1]++;
            }
            StringBuilder sb = new StringBuilder();
            for (int ii : arr)
                sb.append(ii).append(" ");
            out.println(sb.toString());
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

