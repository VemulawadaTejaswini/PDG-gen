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
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CEnergyDrinkCollector solver = new CEnergyDrinkCollector();
        solver.solve(1, in, out);
        out.close();
    }

    static class CEnergyDrinkCollector {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            List<Pair> stores = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                stores.add(new Pair(in.nextLong(), in.nextLong()));
            }
            stores.sort((x, y) -> x.first - y.first >= 0 ? 1 : -1);

            long ans = 0;
            long remain = M;
            out:
            for (int i = 0; i < N; i++) {
                Pair store = stores.get(i);
                for (long j = store.second; j > 0; j--) {
                    ans += store.first;
                    remain--;
                    if (remain <= 0) break out;
                }
            }
            out.println(ans);
        }

        class Pair {
            public long first;
            public long second;

            public Pair(long first, long second) {
                this.first = first;
                this.second = second;
            }

        }

    }
}

