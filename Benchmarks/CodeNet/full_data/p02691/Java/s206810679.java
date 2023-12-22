import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] h = new long[N+1];
        Map<Long, List<Integer>> map1 = new HashMap<>();
        Map<Long, List<Integer>> map2 = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            h[i] = scan.nextLong();
            long x1 = h[i] - i;
            List<Integer> list1 = map1.getOrDefault(x1, new ArrayList<>());
            list1.add(i);
            map1.put(x1, list1);
            long x2 = h[i] + i;
            List<Integer> list2 = map2.getOrDefault(x2, new ArrayList<>());
            list2.add(i);
            map2.put(x2, list2);
        }
        for (long x : map1.keySet()) {
            List<Integer> list = map1.get(x);
            list.sort(Comparator.naturalOrder());
        }
        for (long x : map2.keySet()) {
            List<Integer> list = map2.get(x);
            list.sort(Comparator.naturalOrder());
        }
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            long x1 = h[i] - i;
            if (!map2.containsKey(-x1)) {
                continue;
            }
            List<Integer> list = map2.get(-x1);
            int left = 0;
            int right = list.size();
            while (left + 1 < right) {
                int mid = (left + right) / 2;
                int m = list.get(mid);
                if (i <= m) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            ans += left + 1;
        }
        for (int i = 1; i <= N; i++) {
            long x2 = h[i] + i;
            if (!map1.containsKey(-x2)) {
                continue;
            }
            List<Integer> list = map1.get(-x2);
            int left = 0;
            int right = list.size();
            while (left + 1 < right) {
                int mid = (left + right) / 2;
                int m = list.get(mid);
                if (m <= i) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            ans += list.size() - right + 1;
        }
        System.out.println(ans/2);
    }
}
