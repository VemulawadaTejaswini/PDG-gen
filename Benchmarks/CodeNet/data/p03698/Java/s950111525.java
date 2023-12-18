import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author David Wu
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.readLine();
            String o = "";
            for (int i = 0; i < s.length(); i++) {
                if (TaskB.StringUtils.countMatches(s, String.valueOf(s.charAt(i))) > 1) {
                    o = "no";
                }
            }
            if (o.equals("no")) {
                out.print(o);
            } else {
                out.print("yes");
            }
            // /end program
        }

        static class StringUtils {
            public static final int INDEX_NOT_FOUND = -1;

            public static boolean isEmpty(final CharSequence cs) {
                return cs == null || cs.length() == 0;
            }

            public static int countMatches(final CharSequence str, final CharSequence sub) {
                if (isEmpty(str) || isEmpty(sub)) {
                    return 0;
                }
                int count = 0;
                int idx = 0;
                while ((idx = indexOf(str, sub, idx)) != INDEX_NOT_FOUND) {
                    count++;
                    idx += sub.length();
                }
                return count;
            }

            static int indexOf(final CharSequence cs, final CharSequence searchChar, final int start) {
                return cs.toString().indexOf(searchChar.toString(), start);
                //        if (cs instanceof String && searchChar instanceof String) {
                //            // TODO: Do we assume searchChar is usually relatively small;
                //            //       If so then calling toString() on it is better than reverting to
                //            //       the green implementation in the else block
                //            return ((String) cs).indexOf((String) searchChar, start);
                //        } else {
                //            // TODO: Implement rather than convert to String
                //            return cs.toString().indexOf(searchChar.toString(), start);
                //        }
            }

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

        public void close() {
            writer.close();
        }

    }
}

