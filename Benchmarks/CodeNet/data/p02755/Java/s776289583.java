import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTaxIncrease solver = new CTaxIncrease();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTaxIncrease {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int a = in.nextInt();
            int b = in.nextInt();
            int i = 1;
            while (i < 10000) {
                int e = (int) ((double) i * 0.08);
                int t = (int) ((double) i * 0.1);
                if (e == a && t == b) break;
                i++;
            }

            out.println(i == 10000 ? -1 : i);

        }

    }
}

