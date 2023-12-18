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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            // 出現する頭文字の回数
            int[] ins = new int[5];
            for (int i = 0; i < n; i++) {
                String tmp = in.next();
                if (tmp.startsWith("M")) ins[0]++;
                if (tmp.startsWith("A")) ins[1]++;
                if (tmp.startsWith("R")) ins[2]++;
                if (tmp.startsWith("C")) ins[3]++;
                if (tmp.startsWith("H")) ins[4]++;
            }
            long ans = 0;
            // ありうるMARCHの組合せ
            int[] c1 = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2};
            int[] c2 = {1, 1, 1, 2, 2, 3, 2, 2, 3, 3};
            int[] c3 = {2, 3, 4, 3, 4, 4, 3, 4, 4, 4};

            for (int i = 0; i < 10; i++) {
                ans += ins[c1[i]] * ins[c2[i]] * ins[c3[i]];
            }

            // 出力
            out.println(ans);

        }

    }
}

