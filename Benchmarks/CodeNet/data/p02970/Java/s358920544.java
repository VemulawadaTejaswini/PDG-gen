import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGoldenApple solver = new BGoldenApple();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGoldenApple {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            double n = in.nextDouble();
            double d = in.nextDouble();
            d = 2 * d + 1;
            out.println((int) Math.ceil(n / d));
        }

    }
}

