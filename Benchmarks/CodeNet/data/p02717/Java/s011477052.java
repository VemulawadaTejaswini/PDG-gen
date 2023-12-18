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
            int x = Integer.parseInt(in.next());
            int y = Integer.parseInt(in.next());
            int z = Integer.parseInt(in.next());

            int tmp = 0;
            tmp = x;
            x = y;
            y = tmp;

            tmp = x;
            x = z;
            z = tmp;

            out.printf("%d %d %d", x, y, z);
        }

    }
}

