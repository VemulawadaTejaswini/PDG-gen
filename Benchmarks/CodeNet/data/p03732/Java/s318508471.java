import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        SimpleKnapsack solver = new SimpleKnapsack();
        solver.solve(1, in, out);
        out.close();
    }

    static class SimpleKnapsack {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            List<Pair> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long ww = Long.parseLong(in.next());
                long vv = Long.parseLong(in.next());
                list.add(new Pair(ww, vv));
            }

            long result = 0;
            for (int i = 1; i < (1 << n); i++) {
                long tmp = 0;
                long tmpv = 0;
                for (int j = 0; j < n; j++) {
                    if (((i >> j) & 1) == 1) {
                        Pair p = list.get(j);
                        if (tmp + p.weight <= w) {
                            tmp += p.weight;
                            tmpv += p.value;
                        }
                    }
                }
                result = Math.max(result, tmpv);
            }
            out.println(result);
        }

        class Pair {
            long weight;
            long value;

            public Pair(long weight, long value) {
                this.weight = weight;
                this.value = value;
            }

        }

    }
}

