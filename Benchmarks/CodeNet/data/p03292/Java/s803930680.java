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
            int a1 = Integer.parseInt(in.next());
            int a2 = Integer.parseInt(in.next());
            int a3 = Integer.parseInt(in.next());
            int ans = 1000;

            ans = Math.min(ans, Math.abs(a1 - a2) + Math.abs(a2 - a3));
            ans = Math.min(ans, Math.abs(a1 - a3) + Math.abs(a3 - a2));
            ans = Math.min(ans, Math.abs(a2 - a1) + Math.abs(a1 - a3));
            ans = Math.min(ans, Math.abs(a2 - a3) + Math.abs(a3 - a1));
            ans = Math.min(ans, Math.abs(a3 - a1) + Math.abs(a1 - a2));
            ans = Math.min(ans, Math.abs(a3 - a2) + Math.abs(a2 - a1));

            // 出力
            out.println(ans);

        }

    }
}

