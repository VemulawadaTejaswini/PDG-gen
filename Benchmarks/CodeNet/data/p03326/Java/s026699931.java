import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        PatisserieABC solver = new PatisserieABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class PatisserieABC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            long[] z = new long[n];

            for (int i = 0; i < n; i++) {
                x[i] = Long.parseLong(in.next());
                y[i] = Long.parseLong(in.next());
                z[i] = Long.parseLong(in.next());
            }

            long result = 0;
            for (int i = 0; i < (1 << 3); i++) {
                List<Tuple> scores = new ArrayList<>();
                long tx = 0;
                long ty = 0;
                long tz = 0;
                for (int j = 0; j < n; j++) {
                    if ((i & 1) == 1) {
                        // x
                        tx = -x[j];
                    }
                    if ((i & 1) == 0) {
                        // x
                        tx = x[j];
                    }
                    if ((i >> 1 & 1) == 1) {
                        // y
                        ty = -y[j];
                    }
                    if ((i >> 1 & 1) == 0) {
                        // y
                        ty = y[j];
                    }
                    if ((i >> 2 & 1) == 1) {
                        tz = -z[j];
                    }
                    if ((i >> 2 & 1) == 0) {
                        tz = z[j];
                    }
                    scores.add(new Tuple(tx, ty, tz, (tx + ty + tz)));
                }
                Collections.sort(scores, Collections.reverseOrder());

                long score = 0;
                for (int k = 0; k < m; k++) {
                    score += scores.get(k).score;
                }
                result = Math.max(result, score);
            }
            out.println(result);

        }

        class Tuple implements Comparable<Tuple> {
            long x;
            long y;
            long z;
            long score;

            public Tuple(long x, long y, long z, long score) {
                this.x = x;
                this.y = y;
                this.z = z;
                this.score = score;
            }

            public int compareTo(Tuple o) {
                return Long.compare(this.score, o.score);
            }

        }

    }
}

