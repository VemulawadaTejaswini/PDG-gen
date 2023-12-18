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
        CMaximumVolume solver = new CMaximumVolume();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMaximumVolume {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            double l = Integer.parseInt(in.next());
            out.println(String.format("%.12f", Math.pow(l / 3, 3)));
        }

    }
}

