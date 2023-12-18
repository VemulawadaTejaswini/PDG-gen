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
        EDividingChocolate solver = new EDividingChocolate();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDividingChocolate {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int h = in.nextInt();
            int w = in.nextInt();
            int k = in.nextInt();
            int res = Integer.MAX_VALUE;
            char[][] c = new char[h][w];
            int[][] acc = new int[h + 1][w + 1];

            for (int i = 0; i < h; i++) {
                c[i] = in.next().toCharArray();
            }

            for (int j = 0; j <= w; j++) {
                for (int i = 0; i <= h; i++) {
                    if (i > 0 && j > 0) {
                        if (c[i - 1][j - 1] == '1') {
                            acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1] + 1;
                        } else {
                            acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1];
                        }
                    } else {
                        acc[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < Math.pow(2, h - 1); i++) {
                // 必要な情報はc, k, i
                int cmp = func(acc, k, i);
                res = Math.min(res, cmp);
                // System.out.println(cmp);
            }

            out.println(res);

        }

        int func(int[][] acc, int k, int x) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(0);
            int cnt = 1;
            while (x > 0) {
                if (x % 2 == 1) {
                    al.add(cnt);
                }
                cnt++;
                x /= 2;
            }
            al.add(acc.length - 1);

            // System.out.println(al.toString());

            int res = al.size() - 2;
            int last = 0;

            for (int i = 0; i < acc[0].length; i++) {
                for (int j = 1; j < al.size(); j++) {

                    // System.out.println(al.get(j));
                    // System.out.println(acc[al.get(j)][i]);

                    if ((acc[al.get(j)][i] - acc[al.get(j)][last])
                            - (acc[al.get(j - 1)][i] - acc[al.get(j - 1)][last]) > k) {
                        if (last == i - 1) {
                            return 114514;
                        }
                        res++;
                        last = i - 1;
                        // System.out.println("cut: " + last);
                    }
                }
            }
            return res;
        }

    }
}

