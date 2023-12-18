import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSkip solver = new CSkip();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSkip {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int x = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>(n);

            for (int i = 0; i < n; i++)
                a.add(in.nextInt());

            a.add(x);

            Collections.sort(a);

            ArrayList<Integer> diff = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                diff.add(a.get(i) - a.get(i - 1));
            }

            //Collections.sort(diff);

            int ans = 1;

            int t = 0;

            //ans = Math.max(ans,t);

            for (int i = 0; i < diff.size(); i++) {

                t = gcd(t, diff.get(i));
                ans = Math.max(ans, t);
            }

            out.println(ans);

        }

        int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

    }
}

