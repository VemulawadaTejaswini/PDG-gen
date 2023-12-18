import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            int A = in.nextInt();
            int B = in.nextInt();

            if (N * M < 2 * (A + B)) {
                out.println("NO");
                return;
            }
            boolean rotated = false;
            char[][] grid = new char[N][M];
            for (char[] x : grid) Arrays.fill(x, '.');
            if (N > M) {
                rotated = true;
                grid = rotate(grid);
                int tmp = N;
                N = M;
                M = tmp;
                tmp = A;
                A = B;
                B = tmp;
            }
            boolean simple = false;

            if (N == 1 && M == 1) {
                if (A == 0 && B == 0) {
                    out.println("YES");
                    out.println(".");
                    return;
                } else {
                    out.println("NO");
                    return;
                }
            }

            if (N == 1) {
                if (B > 0 || 2 * A > M) {
                    out.println("NO");
                    return;
                }
                simple = true;
                coverHorizontal(grid, 0, 0);
            }

            boolean success = true;
            if (!simple) {
                if (N % 2 != 0 && M % 2 != 0) {
                    //first row and first col
                    char[][] grid2 = clone(grid);
                    int TA = A;
                    int TB = B;
                    A = coverRow(grid, 0, 0, A, B);
                    B = coverColumn(grid, 1, 0, A, B);
                    success = coverEven(grid, 1, 1, N - 1, M - 1, A, B);

                    if (!success) {
                        grid = grid2;
                        A = TA;
                        B = TB;
                        B = coverColumn(grid, 0, 0, A, B);
                        A = coverRow(grid, 0, 1, A, B);
                        success = coverEven(grid, 1, 1, N - 1, M - 1, A, B);
                    }
                } else if (N % 2 != 0) {
                    //first row;
                    A = coverRow(grid, 0, 0, A, B);
                    success = coverEven(grid, 1, 0, N - 1, M - 1, A, B);
                } else if (M % 2 != 0) {
                    //first col;
                    B = coverColumn(grid, 0, 0, A, B);
                    success = coverEven(grid, 0, 1, N - 1, M - 1, A, B);
                } else {
                    //everything even
                    success = coverEven(grid, 0, 0, N - 1, M - 1, A, B);
                }
            }
            if (!success) {
                out.println("NO");
                return;
            }

            if (rotated) {
                grid = rotate(grid);
                rotated = true;
                int tmp = N;
                N = M;
                M = tmp;
                tmp = A;
                A = B;
                B = tmp;
            }

            if (success) {

                out.println("YES");

                for (int i = 0; i < N; i++) {
                    out.println(new String(grid[i]));
                }
            }
        }

        private char[][] clone(char[][] grid) {
            int N = grid.length;
            int M = grid[0].length;
            char[][] ans = new char[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    ans[i][j] = grid[i][j];
                }
            }
            return ans;
        }

        private int coverRow(char[][] grid, int sx, int sy, int A, int B) {
            int y = sy;
            int M = grid[0].length;
            while (y < M && y + 1 < M && A > 0) {
                coverHorizontal(grid, sx, y);
                A--;
                y += 2;
            }
            return A;
        }

        private int coverColumn(char[][] grid, int sx, int sy, int A, int B) {
            int x = sx;
            int N = grid.length;
            while (x < N && x + 1 < N && B > 0) {
                coverVertical(grid, x, sy);
                B--;
                x += 2;
            }
            return B;
        }

        private boolean coverEven(char[][] grid, int sx, int sy, int ex, int ey, int A, int B) {
            if (sx > ex || sy > ey) return true;
            for (int i = sx; i <= ex; i += 2) {
                for (int j = sy; j <= ey; j += 2) {
                    if (A > B) {
                        if (A >= 2) {
                            coverHorizontal(grid, i, j);
                            coverHorizontal(grid, i + 1, j);
                            A -= 2;
                        } else if (A >= 1) {
                            coverHorizontal(grid, i, j);
                            A -= 1;
                        }
                    } else {
                        if (B >= 2) {
                            coverVertical(grid, i, j);
                            coverVertical(grid, i, j + 1);
                            B -= 2;
                        } else if (B >= 1) {
                            coverVertical(grid, i, j);
                            B -= 1;
                        }
                    }
                }
            }
            return A == 0 && B == 0;
        }

        private void coverHorizontal(char[][] grid, int sx, int sy) {
            grid[sx][sy] = '<';
            grid[sx][sy + 1] = '>';
        }

        private void coverVertical(char[][] grid, int sx, int sy) {
            grid[sx][sy] = '^';
            grid[sx + 1][sy] = 'v';
        }

        private char[][] rotate(char[][] grid) {
            int R = grid.length;
            int C = grid[0].length;
            char[][] ans = new char[C][R];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    ans[j][i] = grid[i][j];
                    if (ans[j][i] == '^') {
                        ans[j][i] = '<';
                    }
                    if (ans[j][i] == '<') {
                        ans[j][i] = '^';
                    }
                    if (ans[j][i] == 'v') {
                        ans[j][i] = '>';
                    }
                    if (ans[j][i] == '>') {
                        ans[j][i] = 'v';
                    }
                }
            }
            return ans;
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

