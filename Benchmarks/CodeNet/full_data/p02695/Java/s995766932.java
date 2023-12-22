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
        static int n;
        static int m;
        static int q;
        static int atod;
        static int suuretu;
        static int ans = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            n = Integer.parseInt(in.next());
            m = Integer.parseInt(in.next());
            q = Integer.parseInt(in.next());
            atod = new int[q][4];
            suuretu = new int[n];
            for (int i = 0; i < q; i++) {
                atod[i][0] = Integer.parseInt(in.next()) - 1;
                atod[i][1] = Integer.parseInt(in.next()) - 1;
                atod[i][2] = Integer.parseInt(in.next());
                atod[i][3] = Integer.parseInt(in.next());
            }

            dfs(1, 0);
//        List<Integer> A = new ArrayList<>(1);
//        Collections.fill(A, 1);
//        dfs(A);

            // 出力
            out.println(ans);

        }

        public static void dfs(int now, int cnt) {
            suuretu[cnt] = now;
            if (cnt == n - 1) {
                int tmp = 0;
                for (int i = 0; i < q; i++) {
                    if (suuretu[atod[i][1]] - suuretu[atod[i][0]] == atod[i][2]) tmp += atod[i][3];
                }
                ans = Math.max(ans, tmp);
                return;
            }
            for (int i = now; i <= m; i++) {
                dfs(i, cnt + 1);
            }
        }

    }
}

