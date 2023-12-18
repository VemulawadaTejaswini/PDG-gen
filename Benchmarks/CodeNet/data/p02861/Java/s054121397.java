import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<int[]> QUERY = new ArrayList<>();
    static List<Double> sqrts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] xy = new int[2][n];
        for (int i = 0; i < n; i++) {
            xy[0][i] = sc.nextInt();
            xy[1][i] = sc.nextInt();
        }

        // X
        List<Double> d1 = new ArrayList<>();
        permutation(xy[0]);
        d1.addAll(sqrts);
        sqrts.clear();

        // Y
        permutation(xy[1]);
        List<Double> d2 = new ArrayList<>();
        d2.addAll(sqrts);

        double ans = 0;
        for (int i = 0; i < d1.size(); i++) {
            ans += Math.sqrt(d1.get(i) + d2.get(i));
        }
        System.out.println(ans / prime(n));
    }

    private static int prime(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    private static void calc(int[] q) {
        for (int j = 0; j < q.length - 1; j++) {
            double t = Math.pow(q[j] - q[j + 1], 2);
            sqrts.add(t);
        }
    }

    private static void permutation(int[] seed) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
    }

    private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
        if (index == seed.length) {
            calc(perm);
            QUERY.add(perm);
            return;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i])
                continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1);
            used[i] = false;
        }
    }
}

