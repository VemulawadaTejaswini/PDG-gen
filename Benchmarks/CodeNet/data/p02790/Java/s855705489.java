import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.StringBuilder;

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
            // 整数の入力
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            StringBuilder sba = new StringBuilder();
            StringBuilder sbb = new StringBuilder();
            for (int i = 0; i < b; i++) {
                sba.append(a);
            }
            for (int i = 0; i < a; i++) {
                sbb.append(b);
            }
            if (sba.toString().compareTo(sbb.toString()) > 0) {
                out.println(sbb.toString());
            } else {
                out.println(sba.toString());
            }


        }

    }
}

