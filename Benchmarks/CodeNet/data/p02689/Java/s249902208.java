import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
            int m = Integer.parseInt(in.next());
            int h[] = new int[n];
            boolean tower[][] = new boolean[n][1];
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(in.next());
            }
            int load[][] = new int[m * 2][3];
            for (int i = 0; i < m; i++) {
                load[i][0] = Integer.parseInt(in.next()) - 1;
                load[i][1] = Integer.parseInt(in.next()) - 1;
                tower[load[i][0]][0] = true;
                tower[load[i][1]][0] = true;
            }
            for (int i = m; i < m * 2; i++) {
                load[i][0] = load[i - m][1];
                load[i][1] = load[i - m][0];
            }
            int ans = 0;

            for (int j = 0; j < m * 2; j++) {
                if (h[load[j][0]] > h[load[j][1]]) load[j][2]++;
            }

            Set<Integer> tmp = new HashSet<>();
            for (int i = 0; i < m * 2; i++) {
                if (load[i][2] >= 1) tmp.add(load[i][0]);
                if (load[i][2] == 0) tmp.remove(load[i][0]);
            }
            ans = tmp.size();
            for (int i = 0; i < n; i++) {
                if (tower[i][0] == false) ans++;
            }

            // 出力
            out.println(ans);

        }

    }
}

