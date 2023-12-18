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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String s1 = in.next();
            String s2 = in.next();

            String cc = "abcdefghijklmnopqrstuvwxyz";

            for (int i = 0; i < s1.length(); i++) {
                if (cc.charAt(s1.charAt(i) - 'a') != s2.charAt(i)) {
                    char temp = cc.charAt(s1.charAt(i) - 'a');
                    cc = cc.replace(s2.charAt(i), 'T');
                    cc = cc.replace(cc.charAt(s1.charAt(i) - 'a'), s2.charAt(i));
                    cc = cc.replace('T', temp);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s1.length(); i++) {
                sb.append(cc.charAt(s1.charAt(i) - 'a'));
            }

            out.println(sb.toString().equals(s2) ? "Yes" : "No");
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
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

