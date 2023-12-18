import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        abc157_b solver = new abc157_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc157_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a[][] = new int[3][3];
            boolean is[][] = new boolean[3][3];
            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    a[x][y] = in.nextInt();
                }
            }
            int N = in.nextInt();
            for (int i = 0; i < N; i++) {
                int inp = in.nextInt();
                for (int y = 0; y < 3; y++) {
                    for (int x = 0; x < 3; x++) {
                        if (a[x][y] == inp) {
                            is[x][y] = true;
                        }
                    }
                }
            }
            for (int y = 0; y < 3; y++) {
                if (is[0][y] && is[1][y] && is[2][y]) {
                    out.println("Yes");
                    return;
                }
            }
            for (int x = 0; x < 3; x++) {
                if (is[x][0] && is[x][1] && is[x][2]) {
                    out.println("Yes");
                    return;
                }
            }
            if (is[0][0] && is[1][1] && is[2][2]) {
                out.println("Yes");
                return;
            }
            if (is[2][0] && is[1][1] && is[0][2]) {
                out.println("Yes");
                return;
            }
            out.println("No");
        }

    }
}

