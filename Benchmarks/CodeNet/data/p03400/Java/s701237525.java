import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC092B solver = new ABC092B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC092B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int D = in.nextInt();
            int X = in.nextInt();
            int[] A = new int[N];
            int ans = X;
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                int l = 0;
                for (int j = 0; j < D; j++) {
                    if (l == 0) {
                        ans++;
                        l = A[i] - 1;
                    } else {
                        l--;
                    }
                }
            }
            out.println(ans);
        }

    }
}

