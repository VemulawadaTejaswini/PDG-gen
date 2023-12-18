import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC108B solver = new ABC108B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC108B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int x3 = x2 - (y2 - y1);
            int y3 = y2 + (x2 - x1);
            int x4 = x3 - (x2 - x1);
            int y4 = y3 - (y2 - y1);

        /*
        if (y1 == y2 && x1 > x2) {
            x3 = x2;
            y3 = y2 - (x1 - x2);
            x4 = x1;
            y4 = y2 - (x1 - x2);
        } else if (x1 == x2 && y2 < y1) {
            x3 = x2 + (y1 - y2);
            y3 = y2;
            x4 = x2 + (y1 - y2);
            y4 = y1;
        } else if (y1 == y2 && x1 < x2) {
            x3 = x2;
            y3 = x1 + (x2 - x1);
            x4 = x1;
            y4 = x1 + (x2 - x1);
        } else if (x1 == x2 && y1 < y2) {
            x3 = x2 - (y2 - y1);
            y3 = y2;
            x4 = x2 - (y2 - y1);
            y4 = y1;
        }
        */

            out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }

    }
}

