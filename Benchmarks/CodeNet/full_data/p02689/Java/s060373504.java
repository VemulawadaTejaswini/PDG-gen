import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = Long.parseLong(sc.next());
        }
        Map<Integer, Set<Integer>> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            if (map.containsKey(a)) {
                map.get(a).add(b);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(b);
                map.put(a, set);
            }
            if (map.containsKey(b)) {
                map.get(b).add(a);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(a);
                map.put(b, set);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer, Set<Integer>> e : map.entrySet()) {
            int num = e.getKey();
            boolean isHigh = true;
            for (Integer s : map.get(num)) {
                if (h[num] <= h[s]) {
                    isHigh = false;
                    break;
                }
            }
            if (isHigh) {
                ans++;
            }
        }
        ans += n - map.size();
        System.out.println(ans);
    }
}