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
        AtCoder solver = new AtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int times = in.nextInt();
            int x = 800;
            int discount = 200;

            out.println(x * times - (int) (times / 15) * discount);
        }

    }
}

