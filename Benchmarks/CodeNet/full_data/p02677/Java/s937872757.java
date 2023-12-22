import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CompuWare
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CColon solver = new CColon();
        solver.solve(1, in, out);
        out.close();
    }

    static class CColon {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            double h = in.nextInt();
            int m = in.nextInt();

            double r = m / 5;
            r += ((m % 5) / 10);
            h = Math.abs(h - r);
            h *= 30;
            double res = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(h));
            out.printf("%.20", res);
        }

    }
}

