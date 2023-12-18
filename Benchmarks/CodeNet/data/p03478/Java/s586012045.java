import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC083BSomeSums solver = new ABC083BSomeSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC083BSomeSums {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                int sum = 0, d = i;
                while (d > 0) {
                    sum += d % 10;
                    d /= 10;
                }
                if (a <= sum && sum <= b) {
                    ans += i;
                }
            }
            out.println(ans);
        }

    }
}

