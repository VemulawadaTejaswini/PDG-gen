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
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AStillTBD solver = new AStillTBD();
        solver.solve(1, in, out);
        out.close();
    }

    static class AStillTBD {
        public void solve(int testNumber, inclass in, PrintWriter out) {
            String str = in.readLine();
            String arr[] = str.split("/");
            String y = arr[0];
            if (Integer.parseInt(y) < 2019) {
                out.println("Heisei");
                return;
            }
            if (Integer.parseInt(arr[1]) <= 4 && Integer.parseInt(y) <= 2019) {
                out.println("Heisei");
                return;
            }
            if (Integer.parseInt(arr[1]) <= 4 && Integer.parseInt(y) <= 2019 && Integer.parseInt(arr[2]) <= 30) {
                out.println("Heisei");
                return;
            }
            out.println("TBD");
            return;
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public inclass(InputStream stream) {
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

