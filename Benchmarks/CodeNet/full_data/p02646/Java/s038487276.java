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
            int a = Integer.parseInt(in.next());
            int v = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());
            int t = Integer.parseInt(in.next());
            int ans = 0;

            long a_l = a - v * t;
            long a_r = a + v * t;
            long b_l = b - w * t;
            long b_r = b + w * t;

            boolean ok = true;

            if (b_l < a_l || a_r < b_r) ok = false;

            out.println(ok ? "YES" : "NO");

        }

    }
}

