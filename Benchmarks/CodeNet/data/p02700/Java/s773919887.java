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
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());
            int d = Integer.parseInt(in.next());

            while (true) {
                c = c - b;
                if (c <= 0) break;
                a = a - d;
                if (a <= 0) break;

            }
            // 出力
            if (a <= 0) {
                out.println("No");
            } else {
                out.println("Yes");
            }

        }

    }
}

