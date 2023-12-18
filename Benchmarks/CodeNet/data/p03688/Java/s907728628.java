import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        BColorfulHats solver = new BColorfulHats();
        solver.solve(1, in, out);
        out.close();
    }

    static class BColorfulHats {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] hat = new int[n];
            for (int i = 0; i < n; i++) {
                hat[i] = in.nextInt();
            }
            Arrays.sort(hat);
            if (hat[n - 1] - hat[0] > 1) {
                out.println("No");
                return;
            }
            if (hat[n - 1] == hat[0]) {
                out.println((hat[n - 1] <= n / 2) || hat[n - 1] == n - 1
                        ? "Yes"
                        : "No");
                return;
            }

            int unique = 0;
            for (int i = 1; i < n; i++) {
                if (hat[i] != hat[i - 1]) unique = i;
            }

            out.println(unique + 1 <= hat[n - 1]
                    && hat[n - 1] <= unique + (n - unique) / 2
                    ? "Yes"
                    : "No");
        }

    }
}

