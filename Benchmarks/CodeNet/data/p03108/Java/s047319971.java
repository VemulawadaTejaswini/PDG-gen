import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] q = new int[M][2];
        for (int i = 0; i < M; i++) {
            q[i][0] = scanner.nextInt();
            q[i][1] = scanner.nextInt();
        }

        long[] ans = new long[M];
        ans[M - 1] = N * (N - 1L) / 2;
        UnionFindTree uft = new UnionFindTree(N);
        for (int i = M - 1; i > 0; i--) {
            ans[i - 1] = ans[i];
            int a = q[i][0] - 1;
            int b = q[i][1] - 1;
            if (uft.same(a, b)) {
                continue;
            }
            long minus = ((long) uft.getCnt(a) * uft.getCnt(b));
            ans[i - 1] = Math.max(0, ans[i] - minus);
            uft.merge(a, b);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(ans[i]);
            sb.append('\n');
        }
        System.out.println(sb);
    }

}

class UnionFindTree {
    int size;
    int[] par;
    int[] rank;
    int[] cnt;

    public UnionFindTree(int size) {
        this.size = size;
        par = new int[size];
        for (int i = 0; i < size; i++) {
            par[i] = i;
        }
        rank = new int[size];
        Arrays.fill(rank, 1);
        cnt = new int[size];
        Arrays.fill(cnt, 1);
    }

    private int root(int x) {
        if (x == par[x]) {
            return x;
        }
        int root = root(par[x]);
        par[x] = root;
        return root;
    }

    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    public int getCnt(int x) {
        return cnt[root(x)];
    }

    public void merge(int x, int y) {
        int xr = root(x);
        int yr = root(y);

        if (xr == yr) {
            return;
        }

        if (rank[xr] < rank[yr]) {
            par[xr] = yr;
            cnt[yr] += cnt[xr];
        } else {
            par[yr] = xr;
            cnt[xr] += cnt[yr];
            if (rank[xr] == rank[yr]) {
                rank[xr]++;
            }
        }
    }

}
