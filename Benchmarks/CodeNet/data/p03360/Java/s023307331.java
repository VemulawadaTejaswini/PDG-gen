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
        ABC096_B solver = new ABC096_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC096_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int ans = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int k = in.nextInt();

            int doubled = Math.max(Math.max(a, b), c);
            for (int i = 0; i < k; i++) {
                doubled *= 2;
            }

            out.print(a + b + c + doubled - Math.max(Math.max(a, b), c));
        }

    }
}

