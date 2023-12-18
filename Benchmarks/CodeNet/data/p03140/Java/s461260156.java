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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            String A = in.next();
            String B = in.next();
            String C = in.next();
            int ans = 0;

            for (int i = 0; i < N; i++) {
                if (A.charAt(i) != B.charAt(i) && B.charAt(i) != C.charAt(i) && C.charAt(i) != A.charAt(i)) {
                    ans += 2;
                } else if ((A.charAt(i) == B.charAt(i) && B.charAt(i) != C.charAt(i)) ||
                        (B.charAt(i) == C.charAt(i) && C.charAt(i) != A.charAt(i)) ||
                        (A.charAt(i) == C.charAt(i) && A.charAt(i) != B.charAt(i))) {
                    ans += 1;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

