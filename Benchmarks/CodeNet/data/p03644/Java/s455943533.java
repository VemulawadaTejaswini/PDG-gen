import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBreakNumber solver = new BBreakNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBreakNumber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int num = 2;
            while (num <= n) num *= 2;
            out.println(num / 2);
        }

    }
}

