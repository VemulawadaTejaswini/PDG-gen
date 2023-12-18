import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int d = in.nextInt();

            String color = "RYGB";

            if (d % 2 == 1) {
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        out.print(color.charAt((i + j) % 2));
                    }
                    out.println();
                }
                return;
            }

            int half = d / 2;

            char[][] ans = new char[h + d][w + d];
            for (int i = 0; i * half < h + d; i++) {
                for (int j = 0; j * half < w + d; j++) {
                    if ((i + j) % 2 == 0) {
                        int c = 0;
                        if (i % 2 == 0) c += 2;
                        if ((i + j) / 2 % 2 == 0) c++;

                        int y = i * half;
                        int x = j * half;

                        for (int k = -(half - 1); k <= half - 1; k++) {
                            for (int l = -(half - 1 - Math.abs(k)); l <= half - Math.abs(k); l++) {
                                if (RangeUtils.isInside(y + k, x + l, h + d, w + d)) {
                                    ans[y + k][x + l] = color.charAt(c);
                                }
                            }
                        }
                    }
                }
            }

            for (int i = 0; i * (d - 1) + half < h; i++) {
                ans[i * (d - 1) + half][0] = color.charAt(1 - i % 2);
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    out.print(ans[i][j]);
                }
                out.println();
            }
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }

    static class RangeUtils {
        public static boolean isInside(int y, int x, int h, int w) {
            return y >= 0 && x >= 0 && y < h && x < w;
        }

    }
}

