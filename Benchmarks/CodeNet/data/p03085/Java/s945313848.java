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
        ADoubleHelix solver = new ADoubleHelix();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADoubleHelix {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char c = in.next().charAt(0);
            if (c == 'A') out.println('T');
            if (c == 'T') out.println('A');
            if (c == 'G') out.println('C');
            if (c == 'C') out.println('G');
        }

    }
}

