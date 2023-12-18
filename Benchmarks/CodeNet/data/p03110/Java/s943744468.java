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
        ABC119_2 solver = new ABC119_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC119_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            double total = 0;
            for (int i = 0; i < N; i++) {
                double x = in.nextDouble();
                String u = in.next();
                if (u.compareTo("BTC") == 0) {
                    total += x * 380000;
                } else {
                    total += x;
                }

            }
            out.println(total);
        }

    }
}

