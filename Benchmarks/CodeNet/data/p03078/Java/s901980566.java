import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.AbstractQueue;
import java.util.Comparator;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int Z = in.nextInt();
            int K = in.nextInt();

            List<Long> A = new ArrayList<>();
            List<Long> B = new ArrayList<>();
            List<Long> C = new ArrayList<>();
            for (int i = 0; i < X; i++) {
                A.add(in.nextLong());
            }
            for (int i = 0; i < Y; i++) {
                B.add(in.nextLong());
            }
            for (int i = 0; i < Z; i++) {
                C.add(in.nextLong());
            }
            Collections.sort(A, Comparator.reverseOrder());
            Collections.sort(B, Comparator.reverseOrder());
            Collections.sort(C, Comparator.reverseOrder());

            PriorityQueue<Long[]> ret = new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));
            ret.add(new Long[]{A.get(0) + B.get(0) + C.get(0), 0L, 0L, 0L});
            int[][][] memo = new int[X][Y][Z];
            for (int i = 0; i < K; i++) {
                Long[] c = ret.remove();
                out.println(c[0]);

                if (A.size() > c[1] + 1) {
                    Long key1 = A.get(c[1].intValue() + 1) + B.get(c[2].intValue()) + C.get(c[3].intValue());
                    Long[] next1 = new Long[]{key1, c[1] + 1, c[2], c[3]};
                    if (memo[c[1].intValue() + 1][c[2].intValue()][c[3].intValue()] == 0) {
                        ret.add(next1);
                        memo[c[1].intValue() + 1][c[2].intValue()][c[3].intValue()] = 1;
                    }
                }

                if (B.size() > c[2] + 1) {
                    Long key2 = A.get(c[1].intValue()) + B.get(c[2].intValue() + 1) + C.get(c[3].intValue());
                    Long[] next2 = new Long[]{key2, c[1], c[2] + 1, c[3]};
                    if (memo[c[1].intValue()][c[2].intValue() + 1][c[3].intValue()] == 0) {
                        ret.add(next2);
                        memo[c[1].intValue()][c[2].intValue() + 1][c[3].intValue()] = 1;
                    }
                }

                if (C.size() > c[3] + 1) {
                    Long key3 = A.get(c[1].intValue()) + B.get(c[2].intValue()) + C.get(c[3].intValue() + 1);
                    Long[] next3 = new Long[]{key3, c[1], c[2], c[3] + 1};
                    if (memo[c[1].intValue()][c[2].intValue()][c[3].intValue() + 1] == 0) {
                        ret.add(next3);
                        memo[c[1].intValue()][c[2].intValue()][c[3].intValue() + 1] = 1;
                    }
                }
            }
        }

    }
}

