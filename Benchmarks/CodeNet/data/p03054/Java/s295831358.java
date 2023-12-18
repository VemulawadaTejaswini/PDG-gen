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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            int n = in.nextInt();
            int sr = in.nextInt() - 1;
            int sc = in.nextInt() - 1;
            String s1 = in.next();
            String s2 = in.next();
            if (remains(height, s1, s2, 'U', 'D', sr) && remains(width, s1, s2, 'L', 'R', sc)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

        private boolean remains(int size, String s1, String s2, char dec, char inc, int start) {
            int min = 0;
            int max = size - 1;
            for (int pos = s1.length() - 1; pos >= 0; --pos) {
                char p2 = s2.charAt(pos);
                if (p2 == inc) {
                    min = Math.max(0, min - 1);
                }
                if (p2 == dec) {
                    max = Math.min(size - 1, max + 1);
                }
                char p1 = s1.charAt(pos);
                if (p1 == inc) {
                    --max;
                }
                if (p1 == dec) {
                    ++min;
                }
                if (min > max) {
                    return false;
                }
            }
            return (min <= start && start <= max);
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

