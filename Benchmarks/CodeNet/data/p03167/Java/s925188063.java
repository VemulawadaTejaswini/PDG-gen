import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HGrid1 solver = new HGrid1();
        solver.solve(1, in, out);
        out.close();
    }

    static class HGrid1 {
        final int MOD = 1_000_000_000 + 7;

        int add(int a, int b) {
            return (a + b) % MOD;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            boolean[][] walls = new boolean[H + 1][W + 1];
            for (int h = 1; h <= H; h++) {
                String row = in.next().trim();
                for (int w = 1; w <= W; w++) {
                    walls[h][w] = row.charAt(w - 1) == '#';
                }
            }
            int[][] ways = new int[H + 1][W + 1];
            ways[0][1] = 1;
            for (int h = 1; h <= H; h++) {
                for (int w = 1; w <= W; w++) {
                    if (!walls[h][w]) {
                        ways[h][w] = add(ways[h - 1][w], ways[h][w - 1]);
                    }
                }
            }
            out.println(ways[H][W]);
        }

    }
}

