import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.LongStream;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            int[] B = new int[M];
            int[] C = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = in.nextInt();
                C[i] = in.nextInt();
            }

            for (int i = 0; i < M; i++) {
                Arrays.sort(A);
                for (int j = 0; j < B[i]; j++) {
                    if (A[j] < C[i]) {
                        A[j] = C[i];
                    } else {
                        break;
                    }
                }
            }

            out.println(Arrays.stream(A).asLongStream().sum());
        }

    }
}

