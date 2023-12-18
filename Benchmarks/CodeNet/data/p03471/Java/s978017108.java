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
        COtoshidama solver = new COtoshidama();
        solver.solve(1, in, out);
        out.close();
    }

    static class COtoshidama {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int sum = Integer.parseInt(in.next());
            int x = -1;
            int y = -1;
            int z = -1;

            out:
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    if (10000 * i + 5000 * j + 1000 * (n - i - j) == sum) {
                        x = i;
                        y = j;
                        z = n - i - j;
                        break out;
                    }
                }
            }
            out.println("" + x + " " + y + " " + z);
        }

    }
}

