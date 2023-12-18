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
        BBishop solver = new BBishop();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBishop {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long h = in.nextLong();
            long w = in.nextLong();
            out.println((h * w) % 2 == 1 ? h * w / 2 + 1 : h * w / 2);
        }

    }
}

