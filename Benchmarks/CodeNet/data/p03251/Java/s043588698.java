import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.OptionalInt;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B1DimensionalWorldsTale solver = new B1DimensionalWorldsTale();
        solver.solve(1, in, out);
        out.close();
    }

    static class B1DimensionalWorldsTale {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), x = in.nextInt(), y = in.nextInt();
            int xm = IntStream.range(0, n).map(z -> in.nextInt()).max().orElse(0);
            int ym = IntStream.range(0, m).map(z -> in.nextInt()).min().orElse(0);
            if (x < ym && xm < y && xm < ym) {
                out.println("No War");
            } else {
                out.println("War");
            }
        }

    }
}

