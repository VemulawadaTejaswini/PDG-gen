import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWaterBottle solver = new DWaterBottle();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWaterBottle {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            double a = in.nextInt();
            double b = in.nextInt();
            double x = in.nextInt();
            double y = (a * a * b - x) / (a * a / 2);
            if (b - y >= 0) {
                out.println(Math.atan(y / a) * 180 / Math.PI);
                return;
            }
            out.println(Math.atan((a * b * b) / (2 * x)) * 180 / Math.PI);

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

