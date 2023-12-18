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
        static final long inf = (long) 1e17;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long X = Long.parseLong(in.next());
            long Y = Long.parseLong(in.next());
            long ans = 0;
            long tmp = X * 2;
            boolean ok = false;
            while (true) {
                if (tmp > inf) {
                    break;
                }
                if (tmp % Y != 0) {
                    ok = true;
                    ans = tmp;
                    break;
                }
                tmp *= 2;

            }
            if (ok) out.println(ans);
            else out.println(-1);
        }

    }
}

