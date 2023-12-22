import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ahmad Hamadneh
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
            long x = in.nextLong();
            out.print(getString(x));
        }

        private static String getString(long n) {
            char[] buf = new char[(int) StrictMath.floor(StrictMath.log(25 * (n + 1)) / StrictMath.log(26))];
            for (int i = buf.length - 1; i >= 0; i--) {
                n--;
                buf[i] = (char) ('a' + n % 26);
                n /= 26;
            }
            return new String(buf);
        }

    }
}

