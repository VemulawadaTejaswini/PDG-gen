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
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // input
            int X, Y, Z, K;
            X = in.nextInt();
            Y = in.nextInt();
            Z = in.nextInt();
            K = in.nextInt();

            long[] A = new long[X];
            long[] B = new long[Y];
            long[] C = new long[Z];

            for (int i1 = 0; i1 < X; i1++) {
                A[i1] = in.nextLong();
            }

            for (int i1 = 0; i1 < Y; i1++) {
                B[i1] = in.nextLong();
            }

            for (int i1 = 0; i1 < Z; i1++) {
                C[i1] = in.nextLong();
            }

            long[] D = new long[X * Y];
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    D[i * Y + j] = A[i] + B[j];
                }
            }
            Arrays.sort(D);

            long[] result = new long[Math.min(K, D.length) * Z];
            for (int i = 0; i < Math.min(K, D.length); i++) {
                for (int j = 0; j < Z; j++) {
                    result[i * Z + j] = D[D.length - 1 - i] + C[j];
                }
            }
            Arrays.sort(result);


            for (int i = 0; i < K; i++) {
                out.println(result[result.length - 1 - i]);
            }
        }

    }
}

