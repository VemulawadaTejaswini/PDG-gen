import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BCanYouSolveThis solver = new BCanYouSolveThis();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCanYouSolveThis {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int c = in.nextInt();
            int[] b = new int[m];
            for (int i = 0; i < m; i++) b[i] = in.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) a[i][j] = in.nextInt();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int sum = c;
                for (int j = 0; j < m; j++) {
                    sum += a[i][j] * b[j];
                }
                if (sum > 0) cnt++;
            }
            out.println(cnt);
        }

    }
}

