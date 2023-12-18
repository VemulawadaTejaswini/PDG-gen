import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CManyRequirements solver = new CManyRequirements();
        solver.solve(1, in, out);
        out.close();
    }

    static class CManyRequirements {

        private int n;
        private int m;
        private int q;
        private int[] a;
        private int[] b;
        private int[] c;
        private int[] d;
        private int max = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            q = in.nextInt();
            a = new int[q];
            b = new int[q];
            c = new int[q];
            d = new int[q];
            for (int i = 0; i < q; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
                c[i] = in.nextInt();
                d[i] = in.nextInt();
            }

            ArrayList<Integer> al = new ArrayList<>();
            dfs(al);
            out.println(max);
        }

        private void dfs(ArrayList<Integer> list) {
            // System.out.println(list.size() + " " + list);

            if (list.size() >= n) {
                max = Math.max(max, calc(list));
                // System.out.println("ret");
                return;
            }

            for (int i = list.size() == 0 ? 1 : list.get(list.size() - 1); i <= m; i++) {
                list.add(i);
                dfs(list);
                list.remove(list.size() - 1);
            }
        }

        private int calc(ArrayList<Integer> list) {
            int cmp = 0;
            for (int i = 0; i < q; i++) {
                if (list.get(b[i]) - list.get(a[i]) == c[i]) {
                    cmp += d[i];
                }
            }
            return cmp;
        }

    }
}

