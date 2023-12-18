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
        ABC_108_A solver = new ABC_108_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_108_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            if (n % 2 == 0) {
                out.print((int) Math.pow(n / 2, 2));
            } else {
                out.print(n / 2 * (n / 2 + 1));
            }
        }

    }
}

