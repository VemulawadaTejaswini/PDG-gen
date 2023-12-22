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
        ATherefore solver = new ATherefore();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATherefore {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x = in.nextLong();
            if (x % 10 == 2 || x % 10 == 9 || x % 10 == 7 || x % 10 == 5 || x % 10 == 4) {
                out.print("hon");
            } else if (x % 10 == 3) {
                out.print("bon");
            } else {
                out.print("pon");
            }
        }

    }
}

