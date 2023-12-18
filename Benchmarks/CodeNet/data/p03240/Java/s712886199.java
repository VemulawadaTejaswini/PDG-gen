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
        CPyramid solver = new CPyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPyramid {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long xi[] = new long[n];
            long yi[] = new long[n];
            long hi[] = new long[n];
            for (int i = 0; i < n; i++) {
                xi[i] = in.nextInt();
                yi[i] = in.nextInt();
                hi[i] = in.nextInt();
            }
            for (long x = 0; x <= 100; x++) {
                for (long y = 0; y <= 100; y++) {
                    long h = 0;
                    boolean ans = true;
                    for (int i = 0; i < n; i++) {
                        if (hi[i] == 0) {
                            continue;
                        }
                        if (h == 0) {
                            h = hi[i] + Math.abs(xi[i] - x) + Math.abs(yi[i] - y);
//                            out.println(h);
                        }
                        if (h - Math.abs(xi[i] - x) - Math.abs(yi[i] - y) == hi[i]) {
                            continue;
                        } else {
                            ans = false;
                            break;
                        }
                    }
                    if (ans) {
                        out.println(x + " " + y + " " + h);
                        return;
                    }
                }
            }
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

