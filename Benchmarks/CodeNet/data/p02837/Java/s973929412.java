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
            // 整数の入力
            int N = Integer.parseInt(in.next());
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(in.next());
                out.println(String.valueOf(A[i]));
                int[][] XY = new int[A[i]][2];
                for (int j = 0; j < A[i]; j++) {
                    XY[j][0] = Integer.parseInt(in.next());
                    XY[j][1] = Integer.parseInt(in.next());
                    out.println(String.valueOf(XY[j][0]) + String.valueOf(XY[j][1]));
                }
            }

            int ans = 0;

            // 出力
            out.println(ans);

        }

    }
}

