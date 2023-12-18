import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBingo solver = new BBingo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBingo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[][] bingo = new int[3][3];
            boolean[][] open = new boolean[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    bingo[i][j] = in.nextInt();
                    open[i][j] = false;
                }
            }

            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int now = in.nextInt();
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (bingo[j][k] == now) {
                            open[j][k] = true;
                        }
                    }
                }
            }

            // よこ
            for (int i = 0; i < 3; i++) {
                boolean f = true;
                for (int j = 0; j < 3; j++) {
                    f = f && open[i][j];
                }
                if (f) {
                    out.println("Yes");
                    return;
                }
            }

            for (int i = 0; i < 3; i++) {
                boolean f = true;
                for (int j = 0; j < 3; j++) {
                    f = f && open[j][i];
                }
                if (f) {
                    out.println("Yes");
                    return;
                }
            }

            if (open[0][0] && open[1][1] && open[2][2]) {
                out.println("Yes");
                return;
            }

            if (open[2][0] && open[1][1] && open[0][2]) {
                out.println("Yes");
                return;
            }

            out.println("No");


        }

    }
}

