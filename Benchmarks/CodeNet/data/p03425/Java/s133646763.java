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
        CMarch solver = new CMarch();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMarch {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long[] c = new long[256];
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                c[in.next().charAt(0)]++;
            }
            long ans = 0;
            ans += c['M'] * c['A'] * c['R'];
            ans += c['M'] * c['A'] * c['C'];
            ans += c['M'] * c['A'] * c['H'];
            ans += c['M'] * c['R'] * c['C'];
            ans += c['M'] * c['R'] * c['H'];
            ans += c['M'] * c['C'] * c['H'];
            ans += c['A'] * c['R'] * c['C'];
            ans += c['A'] * c['R'] * c['H'];
            ans += c['A'] * c['C'] * c['H'];
            ans += c['R'] * c['C'] * c['H'];
            out.println(ans);
        }

    }
}

