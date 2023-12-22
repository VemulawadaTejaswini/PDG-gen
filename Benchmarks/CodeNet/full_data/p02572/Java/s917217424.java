import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author test
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc177_c solver = new abc177_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc177_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextLong();
            }
            Arrays.sort(A);
            long sum = 0;
            long mod = 1000000007;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (A[i] < A[j]) {
                        sum = (sum + ((A[i] * A[j]) % mod)) % mod;
                    }
                }
            }
            out.println(sum);
        }

    }
}

