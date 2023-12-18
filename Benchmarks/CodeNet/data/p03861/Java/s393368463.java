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
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            long x = Long.parseLong(in.next());
            long ans = 0;

            if (b - a == 0) {
                ans = 0;
            } else if ((b - a) % 2 == 0) {
                ans = (b - a) / x + 1;
            } else {
                ans = (b - a + 1) / x;
            }


            out.println(ans);
        }

    }
}

