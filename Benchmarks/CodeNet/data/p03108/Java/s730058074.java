import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

import java.util.*;

public class Main {
    private static class Union {
        int root[];

        public Union(int n) {
            root = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
            }
        }

        public int root(int x) {
            return (root[x] == x) ? x : (root[x] = root(root[x]));
        }

        public void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx != ry) {
                root[rx] = ry;
            }
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        long ans[] = new long[m];
        Union uni = new Union(n);
        for (int i = m - 1; i >= 0; i--) {
            ans[i] = count(n, uni);
            uni.unite(a[i], b[i]);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }
    }

    private long count(int n, Union uni) {
        for (int i = 0; i < n; i++) {
            uni.root[i] = uni.root(i);
        }

        long cnt = 0;

        Map<Integer, Long> map =
            Arrays.stream(uni.root).boxed().collect(groupingBy(identity(), counting()));
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            cnt += entry.getValue() * (n - entry.getValue());
        }

        return cnt / 2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().main(sc);
        } catch (Exception e) {
            throw e;
        }
    }
}
