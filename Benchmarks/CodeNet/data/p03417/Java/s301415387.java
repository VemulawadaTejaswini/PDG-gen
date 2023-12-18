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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int ans = 0;

            if (n == 1 && m == 1) {
                ans = 1;
            } else if (n == 1 && m != 1) {
                ans = m - 2;
            } else {
                ans = (n - 2) * (m - 2);
            }

            // 出力
            out.println(ans);

        }

    }
}

