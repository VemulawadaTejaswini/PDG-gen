import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int m = in.nextInt();
        final int q = in.nextInt();
        in.nextLine();
        final long[][] lines = new long[q][4];
        for (int i = 0; i < q; i++) {
            lines[i] = new long[] { in.nextLong(), in.nextLong(), in.nextLong(), in.nextLong() };
            in.nextLine();
        }
        long res = 0;
        for (List<Integer> l : combine(m, n)) {
            long curr = 0;
            for (long[] query : lines) {
                if (l.get((int) (query[1] - 1)) - l.get((int) (query[0] - 1)) == query[2]) {
                    curr += query[3];
                }
            }
            res = Math.max(res, curr);
        }
        System.out.println(res);
    }

    public static List<List<Integer>> combine(int n, int k) {
        final List<List<Integer>> res = new ArrayList<>();
        recurse(1, n, k, new ArrayList<>(), res);
        return res;
    }

    public static void recurse(int start, int n, int k, List<Integer> curr, List<List<Integer>> res) {
        if (k == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i <= n - k + 1; i++) {
            curr.add(i);
            recurse(i, n, k - 1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
