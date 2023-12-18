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
        ABC094_B solver = new ABC094_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC094_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int cost0 = 0, costN = 0;

            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                if (a < x) {
                    cost0++;
                } else {
                    costN++;
                }
            }

            out.print(Math.min(cost0, costN));
        }

    }
}

