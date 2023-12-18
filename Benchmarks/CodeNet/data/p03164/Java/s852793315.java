import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int W = in.nextInt();
            int[] w = new int[N + 1];
            int[] v = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }

            EKnapsack2.Monotonic prev = new EKnapsack2.Monotonic(W);
            EKnapsack2.Monotonic next = new EKnapsack2.Monotonic(W);
            for (int i = 1; i <= N; i++) {
                for (long wPrev : prev.keys()) {
                    long vPrev = prev.get(wPrev);
                    next.update(wPrev, vPrev);
                    next.update(wPrev + w[i], vPrev + v[i]);
                }
                next.update(w[i], v[i]);
                prev = next;
                next = new EKnapsack2.Monotonic(W);
            }
            out.println(prev.get(W));
        }

        static class Monotonic {
            private final long kMin = 0;
            private final long kMax;
            private final long vMin = 0;
            private SortedMap<Long, Long> m = new TreeMap<>();

            public Monotonic(long kMax) {
                this.kMax = kMax;
            }

            public long get(long k) {
                if (m.containsKey(k)) {
                    return m.get(k);
                }
                SortedMap<Long, Long> head = m.headMap(k);
                if (head.isEmpty()) {
                    return vMin;
                }
                return head.lastKey();
            }

            public void update(long k, long v) {
                if (k < kMin || k > kMax) {
                    return;
                }
                long oldV = get(k);
                if (v > oldV) {
                    m.put(k, v);
                }
                for (long tailK : m.tailMap(k).keySet()) {
                    if (v > m.get(tailK)) {
                        m.put(tailK, v);
                    }
                }
            }

            public Set<Long> keys() {
                return m.keySet();
            }

        }

    }
}

