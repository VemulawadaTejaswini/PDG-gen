import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long[] p;
    int N;
    ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int Q = sc.nextInt();
        dp = new long[N + 1];
        list = new ArrayList<ArrayList<Integer>>(N + 1) {
            {
                for (int i = 0; i < N + 1; i++) {
                    add(new ArrayList<Integer>() {
                    });
                }
            }
        };
        for (int i = 0; i < N - 1; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            list.get(A).add(B);
        }
        p = new long[N + 1];
        Arrays.fill(p, 0);
        Arrays.fill(dp, 0);
        for (int i = 0; i < Q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            p[a] += b;
        }
        dp[1] = p[1];
        ans(1);
        for (int i = 1; i <= N; i++) {
            System.out.println(dp[i]);
        }
    }

    long ans(int n) {
        for (int i = 0; i < list.get(n).size(); i++) {
            int o = list.get(n).get(i);
            dp[o] += dp[n] + p[o];
            ans(o);
        }
        return 0;
    }

}