import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'W') {
                    for (int j = 0; j < i; j++) {
                        seen[j]++;
                    }
                } else {
                    for (int j = i + 1; j < n; j++) {
                        seen[j]++;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, seen[i]);
            }
            System.out.println(n - max - 1);
        }

    }
}

