import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        BRuinedSquare solver = new BRuinedSquare();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRuinedSquare {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
            for (int i = 0; i < 2; i++) {
                int x = x2 + (y1 - y2);
                int y = y2 + (x2 - x1);
                out.print(x);
                out.print(' ');
                out.print(y);
                out.print(' ');
                x1 = x2;
                y1 = y2;
                x2 = x;
                y2 = y;
            }
        }

    }
}

