import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] = in.next().toCharArray();
            }

            for (int i = -1; i <= n; i++) {
                for (int j = -1; j <= m; j++) {

                    if (i < 0 || j < 0) out.print("#");
                    else if (i == n || j == m) out.print("#");
                    else out.print(arr[i][j]);

                }
                out.println();
            }

        }

    }
}

