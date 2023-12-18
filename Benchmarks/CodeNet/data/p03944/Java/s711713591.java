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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int W = in.nextInt();
            int H = in.nextInt();
            int N = in.nextInt();
            int[][] arr = new int[W + 1][H + 1];
            for (int i = 0; i < N; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int a = in.nextInt();
                if (a == 1) {
                    for (int j = 0; j < x; j++) {
                        for (int k = 0; k <= H; k++) {
                            arr[j][k] = 1;
                        }
                    }
                } else if (a == 2) {
                    for (int j = x + 1; j <= W; j++) {
                        for (int k = 0; k <= H; k++) {
                            arr[j][k] = 1;
                        }
                    }
                } else if (a == 3) {
                    for (int j = 0; j < y; j++) {
                        for (int k = 0; k <= W; k++) {
                            arr[k][j] = 1;
                        }
                    }
                } else if (a == 4) {
                    for (int j = y + 1; j <= H; j++) {
                        for (int k = 0; k <= W; k++) {
                            arr[k][j] = 1;
                        }
                    }
                }
            }
            int x1 = W, x2 = 0, y1 = H, y2 = 0;
            boolean exact = false;
            for (int i = 0; i <= W; i++) {
                for (int j = 0; j <= H; j++) {
                    if (arr[i][j] == 0) {
                        x1 = Math.min(x1, i);
                        x2 = Math.max(x2, i);
                        y1 = Math.min(y1, i);
                        y2 = Math.max(y2, i);
                        exact = true;
                    }
                }
            }
            out.println(exact ? (x2 - x1) * (y2 - y1) : 0);
        }

    }
}

