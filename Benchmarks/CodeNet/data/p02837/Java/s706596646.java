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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int N = in.nextInt();
            int[] A = new int[N];
            int[][] x = new int[N][];
            int[][] y = new int[N][];
            for (int i = 0; i < N; ++i) {
                A[i] = in.nextInt();
                x[i] = new int[A[i]];
                y[i] = new int[A[i]];
                for (int j = 0; j < A[i]; ++j) {
                    x[i][j] = in.nextInt();
                    y[i][j] = in.nextInt();
                    --x[i][j];
                }
            }
            int ans = 0;
            out:
            for (int s = 1; s < (1 << N); ++s) {
                for (int i = 0; i < N; ++i) {
                    if ((s >> i) % 2 == 0)
                        continue;
                    for (int j = 0; j < A[i]; ++j) {
                        if ((s >> x[i][j]) % 2 != y[i][j])
                            continue out;
                    }
                }
                ans = Math.max(ans, Integer.bitCount(s));
            }
            out.println(ans);

        }

    }
}

