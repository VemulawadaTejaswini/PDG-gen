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
            in.nextInt(); //>> NUL
            int m = in.nextInt();
            DIslandsWar.Tuple[] operations = new DIslandsWar.Tuple[2 * m];
            for (int i = 0; i < m; i++) {
                int a = in.nextInt(), b = in.nextInt();
                operations[i * 2] = new DIslandsWar.Tuple(a, DIslandsWar.Type.Tuple.START, i);
                operations[i * 2 + 1] = new DIslandsWar.Tuple(b, DIslandsWar.Type.Tuple.END, i);
            }
            Arrays.sort(operations,
                    Comparator.comparingInt(DIslandsWar.Tuple::getIslandID)
                            .thenComparing(DIslandsWar.Tuple::getType, Comparator.reverseOrder())
            );

            int res = 0;
            boolean[] deleted = new boolean[m];
            int left = 0;
            for (int i = 0; i < 2 * m; i++) {
                if (operations[i].type == DIslandsWar.Type.Tuple.END && !deleted[operations[i].i]) {
                    res++;
                    for (; left <= i; left++) {
                        if (operations[left].type == DIslandsWar.Type.Tuple.START) {
                            deleted[operations[left].i] = true;
                        }
                    }
                }
            }
            out.println(res);
        }

        static class Tuple {
            int pos;
            DIslandsWar.Type.Tuple type;
            int i;

            Tuple(int pos, DIslandsWar.Type.Tuple type, int i) {
                this.pos = pos;
                this.type = type;
                this.i = i;
            }

            int getIslandID() {
                return pos;
            }

            DIslandsWar.Type.Tuple getType() {
                return type;
            }

            enum Type {
                START,
                END,;
            }

        }

    }
}

