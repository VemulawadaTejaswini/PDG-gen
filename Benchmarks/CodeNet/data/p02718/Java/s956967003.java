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
        abc161_b solver = new abc161_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc161_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int A[] = new int[N];
            long ttl = 0;
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                ttl += A[i];
            }
            int count = 0;
            double quort = ttl * (1 / (4 * (double) M));
            for (int val : A
            ) {
                if (val >= (int) quort) {
                    count++;
                }
                if (count >= M) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");

        }

    }
}

