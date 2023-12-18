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
            int x = Integer.parseInt(in.next());

            int tmp = 0;
            int ans = 0;

            tmp = x / 500;
            ans += tmp * 1000;

            x -= tmp * 500;

            tmp = x / 5;
            ans += tmp * 5;

            // 出力
            out.println(ans);

        }

    }
}

