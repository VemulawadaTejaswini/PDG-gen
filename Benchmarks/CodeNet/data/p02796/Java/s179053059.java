import java.util.*;

/**
 * 区間スケジューリング問題
 */
public class Main {
    public static final int MOD = 1_000_000_007;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        int[] L = new int[N];
        for (int i=0; i<N; i++) {
            X[i] = sc.nextInt();
            L[i] = sc.nextInt();
        }

        int ans = solve(N, X, L);

        System.out.println(ans);
    }

    private static int solve(int N, int[] X, int[] L) {
        Pair[] list = new Pair[N];
        for (int i=0; i<N; i++) {
            list[i] = new Pair(X[i] - L[i], X[i] + L[i]);
        }

        Arrays.sort(list, new PairComparator().reversed());
        int count = 0;
        int pos = Integer.MIN_VALUE;
        for (int i=0; i<N; i++) {
            if (pos > list[i].first) continue;
            count++;
            pos = list[i].second;
        }

        return count;

    }

    static class Pair {
        int first;
        int second;

        public Pair(int a, int b) {
            this.first = a;
            this.second = b;
        }
    }

    static class PairComparator implements Comparator {

        public int compare(Object a0, Object b0) {
            Pair a = (Pair)a0;
            Pair b = (Pair)b0;

            return b.second - a.second;
        }
    }
}
