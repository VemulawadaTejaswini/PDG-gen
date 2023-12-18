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
            // 入力
            int N = Integer.parseInt(in.next());
            long T = Long.parseLong(in.next());
            long t[] = new long[N];
            for (int i = 0; i < N; i++) {
                t[i] = Long.parseLong(in.next());
            }
            long ans = 0;

            for (int i = 1; i < N; i++) {
                if (t[i] - t[i - 1] < T) ans += t[i] - t[i - 1];
                else ans += T;
            }
            // 出力
            out.println(ans + T);

        }

    }
}

