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
        abc154_b solver = new abc154_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc154_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            for (int i = 0; i < S.length(); i++) {
                out.print("x");
            }
            out.println();
        }

    }
}

