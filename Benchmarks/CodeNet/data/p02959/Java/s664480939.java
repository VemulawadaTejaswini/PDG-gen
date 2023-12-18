import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Xinyi Tao
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CCitySaversABC135 solver = new CCitySaversABC135();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCitySaversABC135 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[n];
            for (int i = 0; i < n + 1; i++)
                a[i] = in.nextInt();
            int c = 0;
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                int c1 = Math.min(a[i], v);
                c += c1;
                int c2 = Math.min(v - c1, a[i + 1]);
                c += c2;
                a[i + 1] -= c2;
            }
            out.println(c);


        }

    }
}

