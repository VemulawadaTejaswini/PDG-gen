import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    List<Integer>[] lists = new ArrayList[n];
    int[] dp = new int[n];

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<n; i++) lists[i] = new ArrayList<>();

        for (int i=0; i<m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            lists[s].add(t);
        }

        Arrays.fill(dp, -1);

        int ret = 0;

        for (int i=0; i<n; i++) {
            ret = Math.max(ret, rec(i));
        }

        System.out.println(ret);

    }

    int rec(int v) {
        if (dp[v] != -1) return dp[v];

        int ret = 0;

        for (int u: lists[v]) {
            if (dp[u] == -1) rec(u);
            ret = Math.max(ret, dp[u] + 1);
        }

        return dp[v] = ret;
    }
}

