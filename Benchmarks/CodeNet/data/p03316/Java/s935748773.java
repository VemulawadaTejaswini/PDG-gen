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
        ABC101_B solver = new ABC101_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC101_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String n = in.nextLine();
            long l = Long.parseLong(n);

            long sum = 0;

            for (char c : n.toCharArray()) {
                sum += Character.digit(c, 10);
            }

            if (l % sum == 0) {
                out.print("Yes");
            } else {
                out.print("No");
            }
        }

    }
}

