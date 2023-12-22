import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    final int mod = 998244353;
    int[] tree;

    private void add(int num, int from, int to, int a, int b, int node) {
        if (from <= a && b <= to) {
            tree[node] += num;
            tree[node] %= mod;
            return;
        }

        int mid = (a + b) / 2;
        if (from <= mid) add(num, from, to, a, mid, node * 2);
        if (to > mid) add(num, from, to, mid + 1, b, node * 2 + 1);
    }

    private int getSum(int index, int a, int b, int node) {
        if (a == b) return tree[node];

        int mid = (a + b) / 2;
        int sum = 0;
        if (index <= mid) sum += getSum(index, a, mid, node * 2);
        if (index > mid) sum += getSum(index, mid + 1, b ,node * 2 + 1);

        sum += tree[node];
        sum %= mod;

        return sum;
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int[][] intervals = new int[k][2];
        for (int i = 0; i < k; i++) {
            tokenizer = new StringTokenizer(f.readLine());
            intervals[i][0] = Integer.parseInt(tokenizer.nextToken());
            intervals[i][1] = Integer.parseInt(tokenizer.nextToken());
        }

        tree = new int[4 * n];
        add(1, 0, 0, 0, n - 1, 1);

        for (int i = 0; i < n; i++) {
            for (int[] interval : intervals) {
                if (i + interval[0] >= n) continue;
                add(getSum(i, 0, n - 1, 1), i + interval[0], Math.min(i + interval[1], n - 1), 0, n - 1, 1);
            }
        }

        out.println(getSum(n - 1, 0, n - 1, 1));

        out.close();
    }
}