import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BTollGates solver = new BTollGates();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTollGates {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < m; i++) set.add(in.nextInt());
            int lcost = 0, rcost = 0, cost;
            for (int i = x + 1; i < n; i++) {
                if (set.contains(i)) rcost++;
            }
            for (int i = x - 1; i > 0; i--) {
                if (set.contains(i)) lcost++;
            }
            cost = Math.min(lcost, rcost);
            out.println(cost);
        }

    }
}

