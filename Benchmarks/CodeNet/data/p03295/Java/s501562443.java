import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DIslandsWar solver = new DIslandsWar();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIslandsWar {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            DIslandsWar.Tuple[] operations = new DIslandsWar.Tuple[2 * m];
            for (int i = 0; i < m; i++) {
                int a = in.nextInt(), b = in.nextInt();
                operations[i * 2] = new DIslandsWar.Tuple(a, 1, i);
                operations[i * 2 + 1] = new DIslandsWar.Tuple(b, 0, i);
            }
            Arrays.sort(operations, Comparator.comparing(t -> t.pos));

            int res = 0;
            boolean[] deleted = new boolean[100001];
            int left = 0;
            for (int i = 0; i < 2 * m; i++) {
                if (operations[i].type == 0) {
                    if (!deleted[operations[i].i]) {

                        ++res;
                        for (; left <= i; left++) {
                            if (operations[left].type == 1) {
                                deleted[operations[left].i] = true;
                            }
                        }
                    }
                }
            }
            out.println(res);
        }

        private static class Tuple {
            int pos;
            int type;
            int i;

            private Tuple(int pos, int type, int i) {
                this.pos = pos;
                this.type = type;
                this.i = i;
            }

        }

    }
}

