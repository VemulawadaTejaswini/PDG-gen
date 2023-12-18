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
        b solver = new b();
        solver.solve(1, in, out);
        out.close();
    }

    static class b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] T = new int[N];
            for (int i = 0; i < N; i++) {
                T[i] = in.nextInt();
            }

            int M = in.nextInt();
            int[] P = new int[M];
            int[] X = new int[M];
            for (int i = 0; i < M; i++) {
                P[i] = in.nextInt();
                X[i] = in.nextInt();
            }

            for (int i = 0; i < M; i++) {
                int sum = 0;
                for (int j = 0; j < N; j++) {
                    if (j + 1 == P[i]) {
                        sum += X[i];
                    } else {
                        sum += T[j];
                    }
                }
                out.println(sum);
            }
        }

    }
}

