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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskAdiverse solver = new TaskAdiverse();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAdiverse {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String str = in.readLine();
            if (str.charAt(0) == 'z') {
                out.println(-1);
                return;
            }
            char[] arr = str.toCharArray();
            int flag = 0, ind = 0;
            for (int i = 1; i < str.length(); i++) {
                if (arr[i] == 'z') {
                    int find[] = new int[26];
                    for (int j = 0; j < i + 1; j++) {
                        find[arr[j] - 'a']++;
                    }
                    char ch = ' ';
                    for (int j = 0; j < 26; j++) {
                        if (find[j] == 0) {
                            ch = (char) (i + 'a');
                            break;
                        }
                    }
                    arr[i - 1] = ch;
                    ind = i - 1;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                int find[] = new int[26];
                for (int i = 0; i < str.length(); i++) {
                    find[arr[i] - 'a']++;
                }
                char ch = ' ';
                for (int i = 0; i < 26; i++) {
                    if (find[i] == 0) {
                        ch = (char) (i + 'a');
                        break;
                    }
                }
                out.println(str + ch);
            } else {
                for (int i = 0; i <= ind; i++) {
                    out.print(arr[i]);
                }
                out.println();
            }
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

        public void println() {
            writer.println();
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void print(char i) {
            writer.print(i);
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

