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
        C4N solver = new C4N();
        solver.solve(1, in, out);
        out.close();
    }

    static class C4N {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            long n = in.nextLong();
            for (int i = 1; i <= 3500; i++) {
                for (int j = 1; j <= 3500; j++) {
                    long x = n * i * j;
                    long y = 4 * i * j - n * (i + j);
                    if (x > y && y > 0) {
                        if (x % y == 0 && x / y > 0) {
                            out.println(i + " " + j + " " + x / y);
                            return;
                        }
                    }

                }
            }

        }

    }
}

