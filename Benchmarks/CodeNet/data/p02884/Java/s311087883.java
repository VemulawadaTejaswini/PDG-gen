import java.util.*;
import java.util.stream.Collectors;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] lists = new List[n];

        for (int i = 0; i < n; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            lists[s].add(t);
        }

        double[] baseDP = new double[n];
        int[] maxCostNodes = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            double max = -1;
            int maxCostNode = -1;
            List<Integer> list = lists[i];
            for (int node : list) {
                if (max < baseDP[node]) {
                    max = baseDP[node];
                    maxCostNode = node;
                }
                baseDP[i] += baseDP[node];
            }
            baseDP[i] = baseDP[i] / list.size() + 1;
            maxCostNodes[i] = maxCostNode;
        }

//        debug(baseDP);
//        debug(maxCostNodes);

        double ans = m;

        for (int i = 0; i < n; i++) {
            double[] dp = new double[n];
            final int maxCostNode = maxCostNodes[i];

            for (int j = n - 2; j >= 0; j--) {
                List<Integer> list = i == j && lists[j].size() > 1
                        ? lists[j].stream().filter(x -> x != maxCostNode).collect(Collectors.toList())
                        : lists[j];
                for (int node : list) {
                    dp[j] += dp[node];
                }
                dp[j] = dp[j] / list.size() + 1;
            }
//            debug(dp);

            ans = Math.min(dp[0], ans);
        }

        System.out.println(ans);

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
