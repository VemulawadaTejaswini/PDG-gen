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
        CVacation solver = new CVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CVacation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int h[][] = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    h[i][j] = in.nextInt();
                }
            }
            long[][] best = new long[N][3];
            for (int j = 0; j < 3; j++) {
                best[0][j] = h[0][j];
            }
            for (int i = 1; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (k != j) {
                            best[i][j] = Math.max(best[i][j], best[i - 1][k] + h[i][j]);
                        }
                    }
                }
            }
            long res = 0;
            for (int j = 0; j < 3; j++) {
                res = Math.max(res, best[N - 1][j]);
            }
            out.println(res);
        }

    }
}

