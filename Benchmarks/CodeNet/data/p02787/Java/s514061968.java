import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
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
        CrestedIbisvsMonster solver = new CrestedIbisvsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class CrestedIbisvsMonster {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int n = in.nextInt();
            List<Pair> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(in.next());
                int b = Integer.parseInt(in.next());
                list.add(new Pair(a, b));
            }

            int[] dp = new int[h + 100];
            Arrays.fill(dp, (int) Math.pow(10, 8));
            dp[0] = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < n; j++) {
                    Pair p = list.get(j);
                    int nextHp = i + p.first;
                    if (h < nextHp) {
                        nextHp = h;
                    }
                    dp[nextHp] = Math.min(dp[nextHp], dp[i] + p.second);
                }
            }
            out.println(dp[h]);
        }

    }

    static class Pair {
        public final Integer first;
        public final Integer second;

        Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }

    }
}

