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
        ABC148_b solver = new ABC148_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC148_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String A = in.next();
            String B = in.next();
            String[] aA = A.split("");
            String[] aB = B.split("");
            for (int i = 0; i < N; i++) {
                out.print(aA[i]);
                out.print(aB[i]);
            }
            out.println();
        }

    }
}

