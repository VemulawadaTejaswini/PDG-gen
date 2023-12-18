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
            long n = Long.parseLong(in.next());
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());

            long rep = n / (a + b);
            long am = n % (a + b);

            long add = 0;
            if (am > a) {
                add = a;
            } else {
                add = am;
            }

            out.println(rep * a + add);
        }

    }
}

