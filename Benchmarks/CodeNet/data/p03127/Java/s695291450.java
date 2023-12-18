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
        MonstersBattleRoyale solver = new MonstersBattleRoyale();
        solver.solve(1, in, out);
        out.close();
    }

    static class MonstersBattleRoyale {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            long result = a[0];
            for (int i = 1; i < a.length; i++) {
                result = gcd(result, a[i]);
            }
            out.println(result);

        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }
}

