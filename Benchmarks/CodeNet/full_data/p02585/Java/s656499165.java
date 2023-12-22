import java.util.*;

public class Main {

    private static long dfs(List<Long> list, int k) {
        int n = list.size() / 2;
        long sum = 0L;
        for (int i = 0; i < n; i++) sum += list.get(i);
        long ans = Long.MIN_VALUE;
        int kk = k;
        for (k = 1; k <= n && k <= kk; k++){
            long mm = Long.MIN_VALUE;
            long cnt = 0;
            for (int i = 0; i < k - 1; i++) cnt += list.get(i);
            for (int i = k - 1; i < k - 1 + n; i++) {
                cnt += list.get(i);
                mm = Math.max(mm, cnt);
                cnt -= list.get(i - k + 1);
            }
            long tmp = Math.max(0, (kk - k) / n * sum);
            ans = Math.max(ans, tmp + mm);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) { a[i] = scan.nextInt(); }
        long[] c = new long[n + 1];
        for (int i = 1; i <= n; i++) { c[i] = scan.nextLong(); }

        long ans = Long.MIN_VALUE;
        int[] vis = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 1) continue;
            vis[i] = 1;
            List<Long> list = new ArrayList();
            list.add(c[i]);
            int x = a[i];
            while (vis[x] == 0) {
                vis[x] = 1;
                list.add(c[x]);
                x = a[x];
            }
            int size = list.size();
            for (int j = 0; j < size; j++) list.add(list.get(j));
            ans = Math.max(ans, dfs(list, k));
        }
        System.out.println(ans);
    }
}
