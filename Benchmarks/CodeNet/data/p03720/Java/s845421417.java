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
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int a[] = new int[m];
            int b[] = new int[m];
            for (int i = 0; i < m; i++) {
                // 0-indexed
                a[i] = Integer.parseInt(in.next()) - 1;
                b[i] = Integer.parseInt(in.next()) - 1;
            }
            int ans[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                ans[i][0] = i;
                ans[i][1] = 0;
            }

            for (int i = 0; i < m; i++) {
                ans[a[i]][1]++;
                ans[b[i]][1]++;
            }

            // 出力
            for (int i = 0; i < n; i++) {
                out.println(ans[i][1]);
            }

        }

    }
}

