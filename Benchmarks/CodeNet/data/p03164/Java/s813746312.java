import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        private void update(SortedMap<Long, Long> m, long W, long w, long v) {
            if (w < 0 || w > W) {
                return;
            }
            if (m.containsKey(w)) {
                m.put(w, Math.max(m.get(w), v));
            } else {
                if (m.headMap(w).isEmpty()) {
                    m.put(w, v);
                } else {
                    long lastKey = m.headMap(w).lastKey();
                    if (v > m.get(lastKey)) {
                        m.put(w, v);
                    }
                }
            }
            for (long ow : m.tailMap(w).keySet()) {
                if (m.get(ow) < v) {
                    m.put(ow, v);
                }
            }

        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int W = in.nextInt();
            int[] w = new int[N + 1];
            int[] v = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }

            SortedMap<Long, Long> bestPrev = new TreeMap<>();
            SortedMap<Long, Long> bestCur = new TreeMap<>();
            update(bestPrev, W, w[1], v[1]);
            for (int i = 2; i <= N; i++) {
                for (Long wPrev : bestPrev.keySet()) {
                    update(bestCur, W, wPrev, bestPrev.get(wPrev));
                    long wCur = wPrev + w[i];
                    update(bestCur, W, wCur, bestPrev.get(wPrev) + v[i]);
                }
                update(bestCur, W, w[i], v[i]);
                bestPrev = bestCur;
                bestCur = new TreeMap<>();
            }
            out.println(bestPrev.get(bestPrev.lastKey()));
        }

    }
}

