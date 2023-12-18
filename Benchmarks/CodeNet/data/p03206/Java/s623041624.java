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
        ABC115_A solver = new ABC115_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long d = in.nextInt();
            out.print("Christmas");
            while (d <= 24) {
                out.print(" Eve");
                d++;
            }
        }

    }
}

