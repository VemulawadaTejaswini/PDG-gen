import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
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
        C2 solver = new C2();
        solver.solve(1, in, out);
        out.close();
    }

    static class C2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.nextLine());
            String p = in.nextLine().replaceAll(" ", "");
            String q = in.nextLine().replaceAll(" ", "");
            int pos_p = 0;
            int pos_q = 0;
            int loopcnt = factorial(n);
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                tmp += String.valueOf(i);
            }

            for (int i = 2; i <= loopcnt; i++) {
                String res = nextPermutation(tmp);
                if (p.equals(res)) pos_p = i;
                if (q.equals(res)) pos_q = i;
                tmp = res;
            }

            // 出力
            int ans = Math.abs(pos_p - pos_q);
            out.println(ans);

        }

        static int factorial(int n) {
            if (n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }

        static String nextPermutation(String s) {

            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) list.add(s.charAt(i));

            int pivotPos = -1;
            char pivot = 0;
            for (int i = list.size() - 2; i >= 0; i--) {
                if (list.get(i) < list.get(i + 1)) {
                    pivotPos = i;
                    pivot = list.get(i);
                    break;
                }
            }

            if (pivotPos == -1 && pivot == 0) return "Final";

            int L = pivotPos + 1, R = list.size() - 1;
            int minPos = -1;
            char min = Character.MAX_VALUE;
            for (int i = R; i >= L; i--) {
                if (pivot < list.get(i)) {
                    if (list.get(i) < min) {
                        min = list.get(i);
                        minPos = i;
                    }
                }
            }

            Collections.swap(list, pivotPos, minPos);
            Collections.sort(list.subList(L, R + 1));

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) sb.append(list.get(i));

            return sb.toString();

        }

    }
}

