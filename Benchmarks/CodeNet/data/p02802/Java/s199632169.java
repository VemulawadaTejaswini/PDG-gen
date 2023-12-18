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
 *
 * @author Vishal Burman
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CWelcomeToAtCoder solver = new CWelcomeToAtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class CWelcomeToAtCoder {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String str[] = in.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int track[] = new int[n + 1];
            Arrays.fill(track, 0);
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < m; i++) {
                String str2[] = in.readLine().split(" ");
                int index = Integer.parseInt(str2[0]);
                String verdict = str2[1];
                if (verdict.equals("WA") && track[index] == 0)
                    count2++;
                if (verdict.equals("AC") && track[index] == 0) {
                    count1++;
                    track[index] = 1;
                }
            }
            out.println(count1 + " " + count2);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

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

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
        }

    }
}

