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
        CAttention solver = new CAttention();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAttention {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int[] seen = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'W') {
                    seen[i] = count++;
                } else {
                    seen[i] = count;
                }
            }
            count = 0;
            int min = n;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'E') {
                    min = Math.min(min, seen[i] = seen[i] + count++);
                } else {
                    min = Math.min(min, seen[i] = seen[i] + count);
                }
            }
            out.println(min);
        }

    }
}

