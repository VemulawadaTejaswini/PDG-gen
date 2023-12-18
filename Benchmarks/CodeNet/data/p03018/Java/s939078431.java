import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < aLen - Math.min(aLen, bcLen); j++)
                        sb.append("A");
                    for (int j = 0; j < abcLen + Math.min(aLen, bcLen); j++)
                        sb.append("ABC");
                    for (int j = 0; j < bcLen + Math.min(aLen, bcLen); j++)
                        sb.append("BC");

                    int sLen = (int) (aLen + abcLen * 3 + bcLen * 2);
                    s = s.substring(0, i - sLen) + sb.toString() + s.substring(i);

                    System.out.println(sb);
                    bcLen = 0;
                    abcLen = 0;
                    preABC = false;
                }
            }

            System.out.println(s);

            aLen = 0;
            bcLen = 0;
            abcLen = 0;
            preABC = false;

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
                        ans += (abcLen * (abcLen + 1)) / 2;
                        ans += Math.max(aLen, bcLen) - Math.min(aLen, bcLen);
                        ans += (abc - abcLen) * (abc + abcLen) / 2;
                    }
                    aLen = s.charAt(i) == 'A' ? 1 : 0;
                    if (preABC)
                        aLen++;
                    bcLen = 0;
                    abcLen = 0;
                    preABC = false;
                }
            }
            if (preABC) {
                long abc = Math.min(aLen, bcLen) + abcLen;
                ans += (abcLen * (abcLen + 1)) / 2;
                ans += Math.max(aLen, bcLen) - Math.min(aLen, bcLen);
                ans += (abc - abcLen) * (abc + abcLen) / 2;
            }


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

