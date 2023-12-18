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
            int N = Integer.parseInt(in.next());
            int preT = 0;
            int preX = 0;
            int preY = 0;

            for (int i = 0; i < N; i++) {
                int postT = Integer.parseInt(in.next());
                int postX = Integer.parseInt(in.next());
                int postY = Integer.parseInt(in.next());

                int dt = postT - preT;
                int dist = Math.abs(postX - preX) + Math.abs(postY - preY);
                if ((dt < dist) || (((dist - dt) & 1) != 0)) {
                    out.println("No");
                    return;
                }

                preT = postT;
                preX = postX;
                preY = postY;
            }

            out.println("Yes");
        }

    }
}

