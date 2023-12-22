import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    int[] tree;

    private void insert(int index, int num, int a, int b, int node) {
        if (a == b) {
            tree[node] = num;
            return;
        }

        int mid = (a + b) / 2;
        if (index <= mid) insert(index, num, a, mid, node * 2);
        else insert(index, num, mid + 1, b, node * 2 + 1);

        tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
    }

    private int getMax(int from, int to, int a, int b, int node) {
        if (from <= a && b <= to) return tree[node];

        int mid = (a + b) / 2;
        int max = 0;
        if (from <= mid) max = Math.max(max, getMax(from, to, a, mid, node * 2));
        if (to > mid) max = Math.max(max, getMax(from, to, mid + 1, b, node * 2 + 1));

        return max;
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

        int maxNum = 300000;
        tree = new int[4 * (maxNum + 1)];
        for (int i = 0;i  <n; i++) {
            int num = Integer.parseInt(f.readLine());
            int left = Math.max(0, num - k);
            int right = Math.min(num + k, maxNum);
            insert(num, getMax(left, right, 0, maxNum, 1) + 1, 0, maxNum, 1);
        }

        out.println(getMax(0, maxNum, 0, maxNum, 1));
        out.close();
    }
}