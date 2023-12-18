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
        TaskGA solver = new TaskGA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskGA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] ar = in.next().toCharArray();

            int N, S, E, W;
            N = S = E = W = 0;
            for (char c : ar) {
                if (c == 'N') {
                    N++;
                } else if (c == 'S') {
                    S++;
                } else if (c == 'E') {
                    E++;
                } else if (c == 'W') {
                    W++;
                }
            }

            if (N == 0 && S > 0) {
                out.println("No");
            } else if (S == 0 && N > 0) {
                out.println("No");
            } else if (E == 0 && W > 0) {
                out.println("No");
            } else if (W == 0 && E > 0) {
                out.println("No");
            } else {
                out.println("Yes");
            }
        }

    }
}
