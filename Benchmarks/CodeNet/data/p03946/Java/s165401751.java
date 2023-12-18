import java.io.*;
import java.util.*;

public class Main {
    private static boolean debug = true;
    private static boolean elapsed = true;

    private int N;
    private int T;
    private long[] A;
    private List<Pair<Integer, Integer>> pairList = new ArrayList<>();
    private void solve(Scanner sc, PrintWriter out) {
        N = sc.nextInt();
        T = sc.nextInt();
        A = new long[N];
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextLong();
        }

        long maxBenefit = searchMaxBenefit();
        if (debug) {
            System.err.println("maxBenefit=" + maxBenefit);
            System.err.println(Arrays.toString(A));
            System.err.println("pairList=" + pairList);
        }
        out.println(pairList.size());
    }
    private long searchMaxBenefit() {
        long max = 0;
        for (int i = 0; i < N - 1; ++i) {
            for (int j = i; j < N; ++j) {
                long benefit = (A[j] - A[i]) * (T / 2);
                if (max < benefit) {
                    max = benefit;
                    pairList.clear();
                    pairList.add(new Pair<>(i, j));
                } else if (max == benefit) {
                    pairList.add(new Pair<>(i, j));
                }
            }
        }
        return max;
    }
    private class Pair<V1, V2> {
        V1 v1;
        V2 v2;
        public Pair(V1 v1, V2 v2) {
            this.v1 = v1;
            this.v2 = v2;
        }
        public String toString() {
            return "(" + v1 + ", " + v2 + ")";
        }
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(sc, out);
        out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            System.err.println((G - S) + "ms");
        }
    }
}