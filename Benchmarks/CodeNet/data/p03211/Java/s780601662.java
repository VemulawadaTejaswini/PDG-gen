import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        B754 solver = new B754();
        solver.solve(1, in, out);
        out.close();
    }

    static class B754 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long x = in.NextLong();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= 10; i++) {
                int x1 = (int) ((x / (long) Math.pow(10, i)) % 1000);
                min = Math.min(min, Math.abs(x1 - 753));
            }
            out.println(min);
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long NextLong() {
            return Long.parseLong(next());
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(Writer out) {
            super(out);
        }

        public OutputWriter(File file) throws FileNotFoundException {
            super(file);
        }

        public OutputWriter(OutputStream out) {
            super(out);
        }

    }
}

