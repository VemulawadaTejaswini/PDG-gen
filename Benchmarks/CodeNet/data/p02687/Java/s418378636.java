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
        abc166_a solver = new abc166_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc166_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            if ((in.next().compareTo("ARC") == 0)) {
                out.println("ABC");
            } else {
                out.println("ARC");
            }

        }

    }
}

