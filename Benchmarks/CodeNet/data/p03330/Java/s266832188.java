import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt(), C = in.nextInt();
            int[][] d = new int[C + 1][C + 1];
            for (int i = 1; i <= C; ++i) {
                for (int j = 1; j <= C; ++j) {
                    d[i][j] = in.nextInt();
                }
            }
            int[][] c = new int[N + 1][N + 1];
            int[][] foo = new int[3][C + 1];
            for (int i = 0; i < 3; ++i) Arrays.fill(foo[i], 0);
            for (int i = 1; i <= N; ++i) {
                for (int j = 1; j <= N; ++j) {
                    c[i][j] = in.nextInt();
                    foo[(i + j) % 3][c[i][j]]++;
                }
            }

            int res = Integer.MAX_VALUE;

            for (int x = 1; x <= C; ++x) {
                int cost1 = 0;
                for (int o = 1; o <= C; ++o) {
                    cost1 += foo[0][o] * d[o][x];
                }
                for (int y = 1; y <= C; ++y) {
                    if (y == x) continue;
                    int cost2 = 0;
                    for (int o = 1; o <= C; ++o) {
                        cost2 += foo[1][o] * d[o][y];
                    }
                    for (int z = 1; z <= C; ++z) {
                        if (z == x || z == y) continue;
                        int cost3 = 0;
                        for (int o = 1; o <= C; ++o) {
                            cost3 += foo[2][o] * d[o][z];
                        }
                        int sum = cost1 + cost2 + cost3;
                        if (sum < res) {
                            res = sum;
                        }
                    }
                }
            }

            out.print(res);
        }

    }
}

