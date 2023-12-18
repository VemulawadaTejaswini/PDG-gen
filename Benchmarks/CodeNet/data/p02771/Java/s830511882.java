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
        abc155_a solver = new abc155_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc155_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();

            boolean ret = false;
            if ((A == B) && (A != C)) {
                ret = true;
            } else if ((A == C) && (A != B)) {
                ret = true;
            } else if ((B == C) && (A != C)) {
                ret = true;
            }
            out.println((ret ? "Yes" : "No"));

        }

    }
}

