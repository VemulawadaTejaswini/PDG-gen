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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 第5回 ドワンゴからの挑戦状 予選
            // A - Thumbnail
            // 平均値を算出する
            // 平均値との距離の最小値を探索する
            // 距離が最小値のフレーム番号を答える
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                sum += a[i];
            }
            double dist = 110000.0;
            double median = (double) sum / (double) n;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                double tmp = Math.abs(median - (double) a[i]);
                if (dist > tmp) {
                    dist = tmp;
                    ans = i;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

