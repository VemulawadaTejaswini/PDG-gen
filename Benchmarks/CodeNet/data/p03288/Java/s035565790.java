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
        ARatedForMe solver = new ARatedForMe();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARatedForMe {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int r = in.nextInt();
            out.println(r < 1200 ? "ABC" : r < 2800 ? "ARC" : "AGC");
        }

    }
}

