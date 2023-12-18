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
        ABC121_1 solver = new ABC121_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC121_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            int h = in.nextInt();
            int w = in.nextInt();

            int ttl = H * W;
            out.println(ttl - ((h * W) + ((H - h) * w)));

        }

    }
}

