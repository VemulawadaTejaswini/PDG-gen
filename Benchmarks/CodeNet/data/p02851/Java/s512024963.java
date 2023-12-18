import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

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
        ERemOfSumIsNum solver = new ERemOfSumIsNum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERemOfSumIsNum {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

        /*
        連続する部分列の和 - 要素数 = Kの倍数
        部分列からそれぞれ1を引いておくことで、
        連続する部分列の和 = Kの倍数
        とすればよいことがわかる。
        あとはzero-sum-rangesみたいな要領でよさそう。

        k個以上集めてはいけないことが分かった。
        どうすればいいんだ…？
        まずk個入れて、一個入れたら一個抜く？
        それはありな感じがする。
         */

            int n = in.nextInt();
            int k = in.nextInt();
            int[] acc = new int[n + 1];
            long res = 0;

            for (int i = 1; i <= n; i++) {
                acc[i] = (acc[i - 1] + (in.nextInt() - 1)) % k;
            }

            HashMap<Integer, Integer> hm = new HashMap<>();

            // まず左からk-1個の中でどうにかできるようにしている
            for (int i = 0; i < Math.min(n + 1, k); i++) {
                hm.merge(acc[i], 1, Integer::sum);
            }

            for (Integer i :
                    hm.keySet()) {
                res += (long) hm.get(i) * (long) (hm.get(i) - 1) / 2;
            }

            for (int i = k; i <= n; i++) {
                // まず一つ抜く
                hm.merge(acc[i - k], -1, Integer::sum);
                // 足して一つ入れる
                if (hm.containsKey(acc[i])) {
                    res += hm.get(acc[i]);
                }
                hm.merge(acc[i], 1, Integer::sum);
            }

            out.println(res);

        }

    }
}

