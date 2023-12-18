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
            String s = in.next();
            String t = in.next();
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            String u = in.next();

            if (u.equals(s)) a--;
            if (u.equals(t)) b--;
            // 出力
            out.println(String.valueOf(a) + " " + String.valueOf(b));

        }

    }
}

