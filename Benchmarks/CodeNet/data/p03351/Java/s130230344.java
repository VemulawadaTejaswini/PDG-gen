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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());
            int d = Integer.parseInt(in.next());
            boolean ok = false;
            if (a <= b && b <= c) {
                if (Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
                    ok = true;
                }
            } else {
                if (Math.abs(a - c) <= d) {
                    ok = true;
                }
            }
            out.println(ok ? "Yes" : "No");

        }

    }
}

