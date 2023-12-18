import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
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
        SummerVacation solver = new SummerVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class SummerVacation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt() + 1;

            PriorityQueue<Pair> pq = new PriorityQueue<>(n, (o1, o2) -> {
                int res = Integer.compare(o2.money, o1.money);
                return res != 0 ? res : Integer.compare(o2.days, o1.days);
            });

            for (int i = 0; i < n; i++) {
                pq.add(new Pair(in.nextInt(), in.nextInt()));
            }

            long result = 0;
            long i = 1;
            while (!pq.isEmpty()) {

                Pair p = pq.poll();
                if (m < i + p.days) {
                    continue;
                }
                i++;
                result += p.money;
            }

            out.println(result);

//        int[] time = new int[n];
//        int[] money = new int[n];
//
//        int[][] result = new int[m + 1][n];
//
//        for (int i = 0; i < n; i++) {
//            time[i] = in.nextInt();
//            money[i] = in.nextInt();
//        }
//
//        for (int i = 0; i <= m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i + time[j] <= m) {
//                    result[i + time[j]][j] = Math.max(result[i + time[j]][j], result[i][j] + money[j]);
//                } else {
//                    result[i][j] = result[i][j];
//                }
//            }
//        }
//
//        long ret = 0;
//        for (int i = 0; i < n; i++) {
//            ret = Math.max(result[m][i], ret);
//        }
//        out.println(ret);
        }

        class Pair {
            public final Integer days;
            public final Integer money;

            public Pair(Integer days, Integer money) {
                this.days = days;
                this.money = money;
            }

        }

    }
}

