import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CBigArray solver = new CBigArray();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBigArray {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int k = in.nextInt();
            int[] back = new int[100001];
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                back[a] += b;
            }

            int res = 0;
            while (k > 0) {
                res++;
                k -= back[res];
            }
            out.println(res);
        }

    }
}

