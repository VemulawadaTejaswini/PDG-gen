import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.AbstractQueue;
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
        SummerVacation solver = new SummerVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class SummerVacation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            PriorityQueue<Pair> pq = new PriorityQueue<>(n, (o1, o2) -> {
                return Integer.compare(o2.money, o1.money);
            });

            List<List<Pair>> list = new ArrayList<>();
            for (int i = 0; i <= m; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (a <= m) {
                    (list.get(a)).add(new Pair(a, b));
                }
            }

            long result = 0;
            for (int i = 1; i <= m; i++) {
                pq.addAll(list.get(i));
                if (!pq.isEmpty()) {
                    Pair max = pq.poll();
                    result += max.money;
                }
            }

            out.println(result);

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

