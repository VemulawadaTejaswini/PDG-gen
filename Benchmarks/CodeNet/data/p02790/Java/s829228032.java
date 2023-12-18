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
        ABC152_b solver = new ABC152_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC152_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int cyc = 0;
            if (a <= b) {
                cyc = b;
                for (int i = 0; i < cyc; i++) {
                    out.print(a);
                }
            } else {
                cyc = a;
                for (int i = 0; i < cyc; i++) {
                    out.print(b);
                }
            }
            out.println();
        }

    }
}

