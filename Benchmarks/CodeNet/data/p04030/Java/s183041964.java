import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
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
            int n = 0;
            char[] c = new char[10];
            String s = in.next();
            for (char ch : s.toCharArray()) {
                if (ch == 'B') n = Math.max(n - 1, 0);
                else {
                    c[n] = ch;
                    n++;
                }
            }
            for (char value : c) {
                if (value != '\0') out.print(value);
            }
            out.println();
        }

    }
}

