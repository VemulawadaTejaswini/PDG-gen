import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author phantom11
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String A = in.next(), B = in.next(), C = in.next();
            int nA = A.length(), nB = B.length(), nC = C.length();
            int turn = 0;
            int iA = 0, iB = 0, iC = 0;
            char winner = ' ';
            while (nA >= 0 && nB >= 0 && nC >= 0) {
                char c;
                if (turn == 0) {
                    if (nA == 0) {
                        winner = 'A';
                        break;
                    }
                    c = A.charAt(iA++);
                    if (c == 'b') {
                        turn = 1;
                    } else if (c == 'c') {
                        turn = 2;
                    }
                    nA--;

                } else if (turn == 1) {
                    if (nB == 0) {
                        winner = 'B';
                        break;
                    }
                    c = B.charAt(iB++);
                    if (c == 'a') {
                        turn = 0;
                    } else if (c == 'c') {
                        turn = 2;
                    }
                    nB--;

                } else {
                    if (nC == 0) {
                        winner = 'C';
                        break;
                    }
                    c = C.charAt(iC++);
                    if (c == 'b') {
                        turn = 1;
                    } else if (c == 'a') {
                        turn = 0;
                    }
                    nC--;

                }
            }

            out.printLine(winner);
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
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tokenizer = null;

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(in.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                return null;
            }
        }

    }
}

