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
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());
            int y = Integer.parseInt(in.next());
            int ans = a * x + b * y;
            ans = Math.min(ans, c * Math.max(x, y) * 2);

            ans = Math.min(ans, c * x * 2 + b * Math.abs(y - x));
            ans = Math.min(ans, a * Math.abs(x - y) + c * y * 2);

            // 出力
            out.println(ans);

        }

    }
}

