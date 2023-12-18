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
            int n = Integer.parseInt(in.next());
            int h[] = new int[n];
            boolean is = true;
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(in.next());
            }
            int diff = 0;
            for (int i = 0; i < n; i++) {
                if (diff < h[i]) {
                    h[i]--;
                    diff = h[i];
                } else if (diff > h[i]) {
                    is = false;
                    break;
                }
            }

            // 出力
            if (is) out.println("Yes");
            else out.println("No");

        }

    }
}

