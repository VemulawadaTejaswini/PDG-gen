import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mehvix
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc167_b solver = new abc167_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc167_b {
        public void solve(int testNumber, Scanner fin, PrintWriter fout) {
            int a = fin.nextInt();
            int b = fin.nextInt();
            int c = fin.nextInt();
            int k = fin.nextInt();

            int sum = 0;

            sum += Math.min(a, Math.max(k, 0));
            k -= a;
            k -= b;
            sum -= Math.min(c, Math.max(k, 0));

            fout.println(sum);
        }

    }
}

