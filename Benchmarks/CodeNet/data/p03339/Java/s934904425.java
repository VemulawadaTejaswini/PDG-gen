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
        Attention solver = new Attention();
        solver.solve(1, in, out);
        out.close();
    }

    static class Attention {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();

            int cost = 0;
            int maxcost = 0;
            int pos = 0;

            int result = 0;
            for (int i = 0; i < n; i++) {
                if (s[i] == 'W') {
                    cost--;
                } else if (s[i] == 'E') {
                    cost++;
                }
                if (maxcost < cost) {
                    maxcost = cost;
                    pos = i;
                }
            }

            for (int i = 0; i < n; i++) {
                if (i < pos) {
                    if (s[i] == 'W') {
                        result++;
                    }
                } else if (pos < i) {
                    if (s[i] == 'E') {
                        result++;
                    }

                }
            }

            out.println(result);
        }

    }
}

