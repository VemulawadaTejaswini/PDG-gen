import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

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
        COneStrokePath solver = new COneStrokePath();
        solver.solve(1, in, out);
        out.close();
    }

    static class COneStrokePath {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] per = new int[n];
            boolean[][] hasEdge = new boolean[n][n];
            int cnt = 0;
            Operation op = new Operation();
            for (int i = 0; i < n; i++) {
                per[i] = i;
                Arrays.fill(hasEdge[i], false);
            }

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                hasEdge[a][b] = true;
                hasEdge[b][a] = true;
            }

            while (true) {
                if (per[0] != 0) break;
                boolean f = true;
                for (int i = 0; i < n - 1; i++) f = f && hasEdge[per[i]][per[i + 1]];
                if (f) cnt++;
                if (op.nextPermutation(per) == null) break;
            }

            out.println(cnt);

        }

    }

    static class Operation {
        public int[] nextPermutation(int[] array) {
            int k = -1;
            int i = array.length - 2;
            while (i >= 0) {
                if (array[i] < array[i + 1]) {
                    k = i;
                    break;
                }
                i--;
            }

            // 存在しない場合nullを返す
            if (k == -1) return null;
            int l = k + 1;
            i = array.length - 1;
            while (i > k + 1) {
                if (array[k] < array[i]) {
                    l = i;
                    break;
                }
                i--;
            }

            int tmp = array[k];
            array[k] = array[l];
            array[l] = tmp;
            int[] res = new int[array.length];
            // k+1 <-> n-1
            for (int j = k + 1; j < array.length + k - j; j++) {
                tmp = array[j];
                array[j] = array[array.length + k - j];
                array[array.length + k - j] = tmp;
            }
            return array;
        }

    }
}

