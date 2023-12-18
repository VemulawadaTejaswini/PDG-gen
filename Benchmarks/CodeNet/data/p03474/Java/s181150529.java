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
            String S = in.next();

            if (S.charAt(a) != '-') {
                out.println("No");
                return;
            }

            for (int i = 0; i <= a - 1; i++) {
                if ('0' > S.charAt(i) || S.charAt(i) > '9') {
                    out.println("No");
                    return;
                }
            }

            for (int i = a + 1; i <= a + b; i++) {
                if ('0' > S.charAt(i) || S.charAt(i) > '9') {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
        }

    }
}

