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
        EDP_C solver = new EDP_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDP_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long happiness[][] = new long[100010][4];
            int a[][] = new int[n + 10][4];


            for (int i = 1; i <= n; i++) {
                a[i][1] = in.nextInt();
                a[i][2] = in.nextInt();
                a[i][3] = in.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                happiness[i][1] = Math.max(happiness[i - 1][2], happiness[i - 1][3]) + a[i][1];
                happiness[i][2] = Math.max(happiness[i - 1][1], happiness[i - 1][3]) + a[i][2];
                happiness[i][3] = Math.max(happiness[i - 1][1], happiness[i - 1][2]) + a[i][3];
            }


            out.print(Math.max(Math.max(happiness[n][1], happiness[n][2]), happiness[n][3]));

        }

    }
}

