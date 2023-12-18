import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
        D2017LikeNumber solver = new D2017LikeNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class D2017LikeNumber {
        ArrayList<Integer> primes = Prime.eratosthenes(100000);

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] acc = new int[100001];
            for (int i = 1; i <= 100000; i++) {
                acc[i] = acc[i - 1] + (isLike(i) && isLike((i + 1) / 2) ? 1 : 0);
            }
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                out.println(acc[r] - acc[l - 1]);
            }
        }

        boolean isLike(int x) {
            int ng = -1;
            int ok = primes.size();
            while (Math.abs(ok - ng) > 1) {
                int mid = (ok + ng) / 2;
                if (primes.get(mid) > x) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }
            if (ng == -1) return false;
            return x == primes.get(ng);
        }

    }

    static class Prime {
        public static ArrayList<Integer> eratosthenes(int n) {
            // n以下の素数をすべて列挙する(計算量は O(N log(log N)))
            // ただし10^5が耐用限界っぽい感じはする

            ArrayList<Integer> res = new ArrayList<>();
            ArrayList<Integer> primes = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                res.add(i);
            }
            while (res.size() > 0) {
                primes.add(res.get(0));
                res.removeIf(a -> a % res.get(0) == 0);
            }
            return primes;
        }

    }
}

