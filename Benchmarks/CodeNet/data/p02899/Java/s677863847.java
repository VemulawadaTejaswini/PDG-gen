import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGoToSchool solver = new CGoToSchool();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGoToSchool {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[a[i] - 1] = i + 1;
            }
            for (int num : ans) {
                out.print(num + " ");
            }
        }

    }
}

