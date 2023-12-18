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
        DIslandsWar solver = new DIslandsWar();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIslandsWar {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[] inc = new int[n];
            int[] dec = new int[n];
            int[] a = new int[2 * n];
            for (int i = 0; i < m; i++) {
                inc[in.nextInt() - 1]++;
                dec[in.nextInt() - 1]--;
            }
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                int j = i / 2;
                if (i % 2 == 0) { // we are on an island
                    count += dec[j];
                    a[i] = count;
                } else { // we are on a bridge
                    count += inc[j];
                    a[i] = count;
                }
            }
            boolean fueru = false;
            int ans = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] < a[i]) {
                    fueru = true;
                } else if (a[i - 1] > a[i] && fueru) {
                    fueru = false;
                    ans++;
                }
            }
            out.println(ans);
        }

    }
}

