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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            int b1 = 0, b2 = 0, len = S.length();
            for (int i = 0; i < len; i++) {
                if (i % 2 == 0) {
                    if (S.charAt(i) == '0') {
                        b1++;
                    }
                }
                if (i % 2 == 1) {
                    if (S.charAt(i) == '0') {
                        b2++;
                    }
                }
            }
            int p1 = Math.abs((int) Math.ceil(len / 2.0) - b1) + Math.abs(len / 2 - (len / 2 - b2));
            int p2 = Math.abs((int) Math.ceil(len / 2.0) - b2) + Math.abs(len / 2 - (len / 2 - b1));
            out.println(Math.min(p1, p2));
        }

    }
}

