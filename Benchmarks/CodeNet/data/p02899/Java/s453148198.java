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
            int[] A = new int[N + 1];
            for (int i = 0; i < N; i++) {
                A[in.nextInt()] = i + 1;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(A[i + 1]).append(' ');
            }
            out.println(sb.substring(0, sb.length() - 1));
        }

    }
}

