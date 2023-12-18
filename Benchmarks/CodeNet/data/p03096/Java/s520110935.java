import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Integer> C = new ArrayList<>();
        int[] indexes = new int[200001];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int prev = -1;
        for (int i = 1; i <= N; i++) {
            int color = scan.nextInt();
            if (prev == color) {
                continue;
            }
            C.add(color);
            prev = color;
            if (!map.containsKey(color)) {
                map.put(color, new ArrayList<>());
            }
            List<Integer> list = map.get(color);
            list.add(C.size());
        }
        int len = C.size();
        long[] dp = new long[len+1];
        dp[0] = 1;
        for (int i = 1; i <= len; i++) {
            int color = C.get(i-1);
            List<Integer> l = map.get(color);
            int size = l.size();
            int t = indexes[color];
            dp[i] += dp[i-1];
            dp[i] %= MOD;
            indexes[color] += 1;
            for (int j = t + 1; j < size; j++) {
                dp[l.get(j)] += dp[i-1];
                dp[l.get(j)] %= MOD;
            }
        }
        System.out.println(dp[len]);
    }
}
