import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int[][] ans = new int[n][2];

            for (int i = 0; i < n; i++) {
                int cnt = 0;
                int tmp = i + 1;
                while (tmp >= 1) {
                    if (tmp % 2 == 0) {
                        cnt++;
                        tmp /= 2;
                    } else {
                        break;
                    }
                }
                ans[i][0] = i + 1;
                ans[i][1] = cnt;
            }

            Arrays.sort(ans, (x, y) -> Integer.compare(x[1], y[1]));
            // 出力
            out.println(ans[n - 1][0]);

        }

    }
}

