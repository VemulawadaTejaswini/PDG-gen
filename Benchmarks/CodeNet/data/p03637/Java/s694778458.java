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
        Fouradjacent solver = new Fouradjacent();
        solver.solve(1, in, out);
        out.close();
    }

    static class Fouradjacent {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int is_two = 0;
            int is_four = 0;
            int is_one = 1;
            for (int i = 0; i < n; i++) {
                long a = in.nextLong();
                if (a % 4 == 0) {
                    is_four++;
                } else if (a % 2 == 0) {
                    is_two++;
                } else {
                    is_one++;
                }
            }
            if (n % 2 == 0) {
                int zan = n - (is_four * 2);
                if (zan <= 0) {
                    out.print("Yes");
                    return;
                }
                if (zan <= is_two) {
                    out.print("Yes");
                    return;
                }
            } else {
                int zan = (n - 1) - (is_four * 2);
                if (zan <= 0) {
                    out.print("Yes");
                    return;
                }
                zan++;
                if (zan <= is_two) {
                    out.print("Yes");
                    return;
                }
            }
            out.print("No");
        }

    }
}

