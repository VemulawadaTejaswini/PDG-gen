import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        ABC088BCardGameForTwo solver = new ABC088BCardGameForTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC088BCardGameForTwo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] a = IntStream.range(0, in.nextInt()).map(x -> in.nextInt()).sorted().toArray();
            int ans = 0;
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0) {
                    ans += a[a.length - i - 1];
                } else {
                    ans -= a[a.length - i - 1];
                }
            }
            out.println(ans);
        }

    }
}

