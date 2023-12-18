import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMultipleGift solver = new CMultipleGift();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMultipleGift {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x = in.nextLong();
            long y = in.nextLong();
            long now = x;
            int res = 0;
            while (now <= y) {
                res++;
                now <<= 1;
            }
            out.println(res);
        }

    }
}

