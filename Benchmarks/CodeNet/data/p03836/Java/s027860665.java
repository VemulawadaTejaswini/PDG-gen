import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CBackAndForth solver = new CBackAndForth();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBackAndForth {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int sx = in.ints(), sy = in.ints(), tx = in.ints(), ty = in.ints();
            int dx = tx - sx, dy = ty - sy;
            IntStream.range(0, dy).forEach(i -> out.print('U'));
            IntStream.range(0, dx).forEach(i -> out.print('R'));
            IntStream.range(0, dy).forEach(i -> out.print('D'));
            IntStream.range(0, dx).forEach(i -> out.print('L'));
            out.print('L');
            IntStream.range(0, dy + 1).forEach(i -> out.print('U'));
            IntStream.range(0, dx + 1).forEach(i -> out.print('R'));
            out.print('D');
            out.print('R');
            IntStream.range(0, dy + 1).forEach(i -> out.print('D'));
            IntStream.range(0, dx + 1).forEach(i -> out.print('L'));
            out.println('U');
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

