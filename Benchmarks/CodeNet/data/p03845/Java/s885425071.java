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
            int t[] = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = Integer.parseInt(in.next());
            }
            int m = Integer.parseInt(in.next());
            int px[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
                px[i][0] = Integer.parseInt(in.next());
                px[i][1] = Integer.parseInt(in.next());

            }
            int ans = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    ans += t[j];
                }
                ans = ans - t[px[i][0] - 1] + px[i][1];
                // 出力
                out.println(ans);
                ans = 0;
            }

        }

    }
}

