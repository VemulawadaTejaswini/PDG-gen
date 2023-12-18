import java.util.*;

public class Main {
    int[] ans;
    List<Integer>[] tree;

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        ans = new int[n];
        tree = new List[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            tree[a].add(b);
        }

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt() - 1;
            int x = sc.nextInt();
            ans[p] += x;
        }

        dfs(0);
//        debug(ans);

        PrintWriter out = new PrintWriter(System.out);
        out.print(ans[0]);
        for (int i = 1; i < n; i++) {
            out.print(" ");
            out.print(ans[i]);
        }
        out.println();
        out.flush();
        // write your code
//        System.out.println(ans);
    }

    void dfs(int parent) {
        List<Integer> nextNodes = tree[parent];
        for (int nodeIdx : nextNodes) {
            ans[nodeIdx] += ans[parent];
            dfs(nodeIdx);
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
