import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            List<Long> H = new ArrayList<>();
            H.add(Long.parseLong(in.next()));
            int cnt = 0;
            long cnt2 = 1;
            long ans = 0;

            while (true) {
                if (H.get(cnt) == 1) {
                    ans++;
                    break;
                }

                if (H.get(cnt) > 1) {
                    H.add((long) Math.floor(H.get(cnt) / 2));
                    cnt++;
                    ans = ans + cnt2 * 2;
                    cnt2 *= 2;
                }
            }


            // 出力
            out.println(ans);

        }

    }
}

