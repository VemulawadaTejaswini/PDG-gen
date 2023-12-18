import java.util.*;

public class Main {
    static Scanner scanner = new  Scanner(System.in);
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] before = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt();
            map.computeIfAbsent(c, key -> new ArrayList<>()).add(i);
        }
        for (List<Integer> list : map.values()) {
            Collections.sort(list);
            before[list.get(0)] = -1;
            for (int i = 1; i < list.size(); i++) {
                before[list.get(i)] = list.get(i - 1);
            }
        }
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            if (before[i - 1] != -1 && before[i - 1] + 1 < i - 1) {
                dp[i] = (dp[i] + dp[before[i - 1] + 1]) % mod;
            }
        }
        System.out.println(dp[n]);
    }
}