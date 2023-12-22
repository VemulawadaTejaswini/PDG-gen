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
        abc167_b solver = new abc167_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc167_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int K = in.nextInt();

            int sum = 0;
            int diff = 0;
            if (A < K) {
                sum += A;
                diff = K - A;
            } else {
                out.println(K);
                return;
            }
            if (diff < B) {
                out.println(sum);
                return;
            } else {
                diff = diff - B;
            }
            sum -= diff;
            out.println(sum);


        }

    }
}

