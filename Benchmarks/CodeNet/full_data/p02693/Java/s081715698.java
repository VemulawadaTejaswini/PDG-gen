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
        abc165_a solver = new abc165_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc165_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int K = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();

            for (int i = K; i <= B; i += K) {
                if ((A <= i) && (i <= B)) {
                    out.println("OK");
                    return;
                }
            }
            out.println("NG");
        }

    }
}

