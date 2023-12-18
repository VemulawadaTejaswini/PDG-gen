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
            int d = Integer.parseInt(in.next());
            int n = Integer.parseInt(in.next());
            int ans = 0;

            if (n != 100) ans = (int) (n * Math.pow(100, d));
            else ans = (int) (101 * Math.pow(100, d));

            // 出力
            out.println(ans);

        }

    }
}

