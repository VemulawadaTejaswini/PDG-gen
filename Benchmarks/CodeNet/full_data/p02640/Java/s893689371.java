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

            for (int i = 0; i < 101; i++) {
                for (int j = 0; j < 101; j++) {
                    if (i + j == x && i * 2 + j * 4 == y) ok = true;
                }
            }

            out.println(ok ? "Yes" : "No");

        }

    }
}

