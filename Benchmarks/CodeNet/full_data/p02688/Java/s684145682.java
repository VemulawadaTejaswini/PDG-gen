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
            int k = Integer.parseInt(in.next());
            int ans = 0;
            int d[] = new int[k];
            int a[][] = new int[k][100];
            int b[][] = new int[100][1];
            for (int i = 0; i < k; i++) {
                d[i] = Integer.parseInt(in.next());
                for (int j = 0; j < d[i]; j++) {
                    a[i][j] = Integer.parseInt(in.next());
                    b[a[i][j] - 1][0]++;
                }
            }

            for (int i = 0; i < n; i++) {
                if (b[i][0] == 0) ans++;
            }
            // 出力
            out.println(ans);

        }

    }
}

