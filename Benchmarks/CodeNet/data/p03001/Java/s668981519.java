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
        RectangleCutting solver = new RectangleCutting();
        solver.solve(1, in, out);
        out.close();
    }

    static class RectangleCutting {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int w = in.nextInt();
            int h = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            out.print((double) w * h / 2 + " ");
            if (2 * x == w && 2 * y == h) {
                out.print(1);
            } else {
                out.print(0);
            }
        }

    }
}

