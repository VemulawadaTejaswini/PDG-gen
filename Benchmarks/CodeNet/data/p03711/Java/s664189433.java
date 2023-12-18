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
            int[][] check = {{1, 0}, {2, 2}, {3, 0}, {4, 1}, {5, 0}, {6, 1}, {7, 0}, {8, 0}, {9, 1}, {10, 0}, {11, 1}, {12, 0}};
            boolean ok = false;
            if (check[x - 1][1] == check[y - 1][1]) ok = true;

            out.println(ok ? "Yes" : "No");

        }

    }
}

