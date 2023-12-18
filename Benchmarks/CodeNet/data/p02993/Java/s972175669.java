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
        ABC131_a solver = new ABC131_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC131_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            String[] spri = S.split("");
            for (int i = 1; i < spri.length; i++) {
                if (spri[i].compareTo(spri[i - 1]) == 0) {
                    out.println("Bad");
                    return;
                }

            }
            out.println("Good");
        }

    }
}

