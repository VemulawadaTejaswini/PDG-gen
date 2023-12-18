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
        DCrossing solver = new DCrossing();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCrossing {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int np = 0;
            boolean can = false;
            for (int i = 0; i <= n; i++) {
                if (i * (i - 1) / 2 == n) {
                    can = true;
                    np = i;
                    break;
                }
            }

            if (can) {
                out.println("Yes");
                int[][] num = new int[np][np - 1];
                int x = 1;
                for (int i = 0; i < num.length; i++) {
                    for (int j = i; j < num[0].length; j++) {
                        num[i][j] = x + j;
                        num[j + 1][i] = x + j;
                    }
                    x += np - 2 - i;
                }

                for (int i = 0; i < num.length; i++) {
                    out.print(num[0].length + " ");
                    for (int j = 0; j < num[0].length; j++) {
                        out.print(num[i][j] + " ");
                    }
                    out.println();
                }
            } else {
                out.println("No");
            }
        }

    }
}

