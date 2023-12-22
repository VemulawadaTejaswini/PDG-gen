import java.util.*;

public class Main {

    static class Node {
        long x, y, val;
        Node() {}
        Node(long x, long y, long val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
    private static long[][] dp;
    private static int n;
    private static Map<Integer, Long> M;
    private static int total;

    private static long process(Node[] arr, int s) {
        if (M.containsKey(s)) return M.get(s);
        List<Node> list = new ArrayList();
        long ans = Long.MAX_VALUE;
        long sum = 0L;
        for (int j = 0; j < n; j++) if ((s & (1 << j)) > 0) {
            list.add(arr[j]);
            sum += arr[j].val;
        }

        Collections.sort(list, (a, b) -> (int) (a.x - b.x));
        int pos = 0;
        long cnt = list.get(0).val;
        while (cnt < (sum + 1) / 2) {
            pos++;
            cnt += list.get(pos).val;
        }
        long x = list.get(pos).x;
        long cal = 0;
        for (int i = 0; i < list.size(); i++) cal += Math.abs(x - list.get(i).x) * list.get(i).val;
        ans = Math.min(ans, cal);

        Collections.sort(list, (a, b) -> (int) (a.y - b.y));
        pos = 0;
        cnt = list.get(0).val;
        while (cnt < (sum + 1) / 2) {
            pos++;
            cnt += list.get(pos).val;
        }
        long y = list.get(pos).y;
        cal = 0;
        for (int i = 0; i < list.size(); i++) cal += Math.abs(y - list.get(i).y) * list.get(i).val;
        ans = Math.min(ans, cal);

        M.put(s, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        Node[] a = new Node[n];
        M = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long x = scan.nextLong();
            long y = scan.nextLong();
            long val = scan.nextLong();
            a[i] = new Node(x, y, val);
        }
        total = 1 << n;
        dp = new long[n + 1][total];
        for (int s = 1; s < total; s++) {
            long cnt = 0;
            for (int j = 0; j < n; j++) if ((s & (1 << j)) > 0) {
                cnt += Math.min(Math.abs(a[j].x), Math.abs(a[j].y)) * a[j].val;
            }
            dp[0][s] = cnt;
        }
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < total; s++) {
                if (dp[i - 1][s] == 0) {
                    dp[i][s] = 0;
                    continue;
                }
                long cnt = Long.MAX_VALUE;
                for (int s1 = s; s1 != 0; s1 = (s1 - 1) & s) {
                    int s2 = s ^ s1;
                    cnt = Math.min(cnt, dp[i - 1][s2] + process(a, s1));
                }
                dp[i][s] = cnt;
            }
            if (dp[i][total - 1] == 0) break;
        }
        for (int i = 0; i <= n; i++) System.out.println(dp[i][total - 1]);
    }
}
