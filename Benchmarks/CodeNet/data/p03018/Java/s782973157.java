import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String s = in.next();
            long ans = 0;
            long aLen = 0;
            long bcLen = 0;
            boolean preABC = false;
            long abcLen = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.length() - i >= 3 && s.substring(i, i + 3).equals("ABC")) {
                    preABC = true;
                    abcLen++;
                    i += 2;
                } else if (preABC && s.length() - i >= 2 && s.substring(i, i + 2).equals("BC")) {
                    bcLen++;
                    i++;
                } else if (!preABC && s.charAt(i) == 'A') {
                    aLen++;
                } else {
                    if (preABC) {
                        long abc = Math.min(aLen, bcLen) + abcLen;
                        ans += (abc * (abc + 1)) / 2;
                        ans += Math.max(aLen, bcLen) - abc;
                        ans += abc;
                    }
                    aLen = preABC ? 2 : 0;
                    bcLen = 0;
                    abcLen = 0;
                    preABC = false;
                }
            }
            if (preABC)
                ans += aLen + bcLen + (abcLen * (abcLen + 1)) / 2;

            out.println(ans);
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
            this.bufPointer = 0;
            this.bufLength = 0;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isPrintableChar(int c) {
            return c >= 33 && c <= 126;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();

            int b = readByte();
            while (!isPrintableChar(b))
                b = readByte();

            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }

            return sb.toString();
        }

    }
}

