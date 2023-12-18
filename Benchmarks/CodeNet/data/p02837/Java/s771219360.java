import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HonestOrUnkind2 solver = new HonestOrUnkind2();
        solver.solve(1, in, out);
        out.close();
    }

    static class HonestOrUnkind2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[][] map = new int[n][n];
            for (int[] a : map) {
                Arrays.fill(a, -1);
            }

            for (int i = 0; i < n; i++) {
                int anum = in.nextInt();
                for (int j = 0; j < anum; j++) {
                    int x = in.nextInt() - 1;
                    int y = in.nextInt();
                    map[i][x] = y;
                }
            }

            long result = 0;
            for (int bit = 0; bit < (1 << n); bit++) {
                if (judge(bit, map)) {
                    long c = 0;
                    for (int i = 0; i < n; i++) {
                        if ((bit & (1 << i)) != 0) {
                            c++;
                        }
                    }
                    result = Math.max(result, c);
                }
            }

            out.println(result);
        }

        public boolean judge(int bit, int[][] map) {
            for (int i = 0; i < map.length; i++) {
                if ((bit & (1 << i)) == 0) {
                    continue;
                }
                int[] pair = map[i];
                for (int j = 0; j < pair.length; j++) {
                    if (pair[j] != -1) {
                        int x = j;
                        int y = pair[j];

                        if (((bit >> x & 1) ^ y) == 1) {
                            return false;
                        }
                    }

                }
            }
            return true;
        }

    }
}

