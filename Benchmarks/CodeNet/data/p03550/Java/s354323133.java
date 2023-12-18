import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        DABS solver = new DABS();
        solver.solve(1, in, out);
        out.close();
    }

    static class DABS {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), z = in.nextInt(), w = in.nextInt();
            int[] a = IntStream.range(0, n).map(x -> in.nextInt()).toArray();
            out.println(Math.max(Math.abs(w - a[n - 1]), n == 1 ? 0 : Math.abs(a[n - 1] - a[n - 2])));
        }

    }
}

