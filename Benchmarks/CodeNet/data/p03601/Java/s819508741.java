import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int A = in.nextInt(), B = in.nextInt(), C = in.nextInt(), D = in.nextInt(), E = in.nextInt(), F = in.nextInt();
            double maxRatio = 0;
            int maxAmountOfSugar = 0, maxAmountOfWater = 0;
            int maxTimes = F / 100 + 1;
            for (int a = 0; a <= maxTimes; a += A) {
                for (int b = 0; b <= maxTimes; b += B) {
                    int water = (a + b) * 100;
                    int maxSugar = (a + b) * E;
                    for (int c = 0; c <= maxSugar; c += C) {
                        for (int d = 0; d <= maxSugar; d += D) {
                            if (c + d > maxSugar) continue;
                            int sugar = c + d;
                            if (sugar + water > F) continue;
                            if (sugar * 1.0 / water > maxRatio) {
                                maxRatio = sugar * 1.0 / water;
                                maxAmountOfSugar = sugar;
                                maxAmountOfWater = water;
                            }
                        }
                    }
                }
            }
            out.printLine((maxAmountOfSugar + maxAmountOfWater) + " " + maxAmountOfSugar);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

