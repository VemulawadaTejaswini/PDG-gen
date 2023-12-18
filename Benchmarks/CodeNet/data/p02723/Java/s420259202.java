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
        abc160_a solver = new abc160_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc160_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String[] S = in.next().split("");
            boolean pair = false;
            for (int i = 1; i < S.length; i++) {
                if (S[i - 1].compareToIgnoreCase(S[i]) == 0) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");

        }

    }
}

