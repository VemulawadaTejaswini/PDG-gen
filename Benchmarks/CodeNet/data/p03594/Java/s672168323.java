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

            int m = d / 2;
            int p = d / 2 - 1;

            char[][] ans = new char[h + d][w + d];
            for (int i = 0; i * d < h + d; i++) {
                for (int j = 0; j * d < w + d; j++) {
                    if ((i + j) % 2 == 0) {
                        for (int k = 0; k < m; k++) {
                            for (int l = 0; l < m; l++) {
                                if (RangeUtils.isInside(i * d - p - k + l, j * d + k + l, h + d, w + d))
                                    ans[i * d - p - k + l][j * d + k + l] = color.charAt(0);
                            }
                        }
                    }
                }
            }
            for (int i = 0; i * d < h + d; i++) {
                for (int j = 0; j * d < w + d; j++) {
                    if ((i + j) % 2 == 1) {
                        for (int k = 0; k < m; k++) {
                            for (int l = 0; l < m; l++) {
                                if (RangeUtils.isInside(i * d - p - k + l, j * d + k + l, h + d, w + d))
                                    ans[i * d - p - k + l][j * d + k + l] = color.charAt(1);
                            }
                        }
                    }
                }
            }
            for (int i = 0; i * d < h; i++) {
                for (int j = 0; j * d < w; j++) {
                    if ((i + j) % 2 == 0) {
                        for (int k = 0; k < m; k++) {
                            for (int l = 0; l < m; l++) {
                                if (RangeUtils.isInside(i * d + m - p - k + l, j * d + m + k + l, h + d, w + d))
                                    ans[i * d + m - p - k + l][j * d + m + k + l] = color.charAt(2);
                            }
                        }
                    }
                }
            }
            for (int i = 0; i * d < h; i++) {
                for (int j = 0; j * d < w; j++) {
                    if ((i + j) % 2 == 1) {
                        for (int k = 0; k < m; k++) {
                            for (int l = 0; l < m; l++) {
                                if (RangeUtils.isInside(i * d + m - p - k + l, j * d + m + k + l, h + d, w + d))
                                    ans[i * d + m - p - k + l][j * d + m + k + l] = color.charAt(3);
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if ((i + j) % 2 == 1) {
                        ans[i][j] = ans[i][j + 1];
                    }
                }
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

