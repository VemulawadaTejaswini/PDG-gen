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
        ABC114_A solver = new ABC114_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC114_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            if (x == 3 | x == 5 | x == 7) {
                out.print("YES");
            } else {
                out.print("NO");
            }
        }

    }
}

