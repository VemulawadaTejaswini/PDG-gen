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
        CHalfAndHalf solver = new CHalfAndHalf();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHalfAndHalf {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = Integer.parseInt(in.next());
            int B = Integer.parseInt(in.next());
            int C = Integer.parseInt(in.next());
            int X = Integer.parseInt(in.next());
            int Y = Integer.parseInt(in.next());

            int ans = 0;
            if (A + B < 2 * C) {
                ans += (A + B) * Math.min(X, Y);
            } else {
                ans += 2 * C * Math.min(X, Y);
            }

            int rest = Math.abs(X - Y);
            if (A < B) {
                ans += rest * Math.min(A, 2 * C);
            } else {
                ans += rest * Math.min(B, 2 * C);
            }
            out.println(ans);
        }

    }
}

