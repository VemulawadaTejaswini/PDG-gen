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
        abc164_b solver = new abc164_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc164_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int D = in.nextInt();

            while (true) {
                C -= B;
                if (C <= 0) {
                    out.println("Yes");
                    return;
                }
                A -= D;
                if (A <= 0) {
                    out.println("No");
                    return;
                }

            }


        }

    }
}

