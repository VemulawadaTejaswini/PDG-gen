import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
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
        DistributeNumbers solver = new DistributeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DistributeNumbers {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = 37;
            out.println((n * n + n + 1) + " " + (n + 1));
            for (int i = 1; i <= n + 1; i++) {
                if (i != 1) out.print(" ");
                out.print(i);
            }
            out.println();
            for (int j = 2; j <= n + 1; j++) {
                out.print(1);
                for (int k = 1; k <= n; k++) {
                    out.print(" " + (k + 1 + (j - 1) * n));
                }
                out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    out.print(i + 1);
                    for (int k = 1; k <= n; k++) {
                        out.print(" " + (k * n + 2 + (j + i * k) % n));
                    }
                    out.println();
                }

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

        public void close() {
            writer.close();
        }

        public void print(int i) {
            writer.print(i);
        }

    }

    static class InputReader {
        private InputStream stream;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

    }
}

