import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] cnt = new int[5];
            Arrays.fill(cnt, 0);
            Set<ArrayList<Integer>> comb = new HashSet<>();
            combination(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)), 3, comb);
            for (int i = 0; i < n; i++) {
                String str = in.next();
                switch (str.charAt(0)) {
                    case 'M':
                        cnt[0]++;
                        break;

                    case 'A':
                        cnt[1]++;
                        break;

                    case 'R':
                        cnt[2]++;
                        break;

                    case 'C':
                        cnt[3]++;
                        break;

                    case 'H':
                        cnt[4]++;
                        break;

                    default:
                        break;
                }
            }
            long ans = 0;
            for (ArrayList<Integer> list : comb) {
                long tmp = 1;
                for (int index : list) {
                    tmp *= cnt[index - 1];
                }
                ans += tmp;
            }

            out.print(ans);

        }

        private void combination(ArrayList<Integer> n, int r, Set<ArrayList<Integer>> ans) {
            if (n.size() == r) {
                ans.add(n);
                return;
            }

            for (int i = 0; i < n.size(); i++) {
                ArrayList<Integer> list = new ArrayList<>();
                list.addAll(n);
                list.remove(i);
                combination(list, r, ans);
            }
        }

    }
}

