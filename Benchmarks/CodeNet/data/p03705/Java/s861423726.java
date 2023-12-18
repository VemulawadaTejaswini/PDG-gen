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
        static Integer n;
        static Integer a;
        static Integer b;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = Integer.parseInt(in.next());
            a = Integer.parseInt(in.next());
            b = Integer.parseInt(in.next());

            if (a > b || (n == 1 && a != b)) {
                out.println(0);
                return;
            }
            long l = a * (n - 1) + b;
            long r = a + b * (n - 1);
            long ans = r - l + 1;
            if (ans < 0) {
                ans = 0;
            }
            out.println(ans);

        }

    }
}

