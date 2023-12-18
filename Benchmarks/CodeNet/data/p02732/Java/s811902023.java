import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

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
        DBannedK solver = new DBannedK();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBannedK {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int n = in.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                hm.merge(a[i], 1, Integer::sum);
            }

            ArrayList<Integer> al = new ArrayList<>(hm.values());
            long sum = 0;
            for (int i = 0; i < al.size(); i++) {
                sum += (long)al.get(i) * (long)(al.get(i) - 1) / 2;
            }

            for (int i = 0; i < n; i++) {
                out.println(sum - hm.get(a[i]) + 1);
            }

        }

    }
}

