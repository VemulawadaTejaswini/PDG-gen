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
            int y = Integer.parseInt(in.next());
            int turtle = 0;

            boolean ok = false;

            turtle = (y - 2 * x) / 2;
            int crane = x - turtle;
            if (crane > 0 && crane + turtle == x) ok = true;

            out.println(ok ? "Yes" : "No");

        }

    }
}

