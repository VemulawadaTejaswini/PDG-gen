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
        AtCoder solver = new AtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String a = in.next();
            String b = in.next();
            String c = in.next();
            out.println("" + a.charAt(0) + b.charAt(0) + c.charAt(0));
        }
    }
}

