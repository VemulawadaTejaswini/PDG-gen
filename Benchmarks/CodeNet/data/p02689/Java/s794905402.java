import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int ans = 0;
        int[] ht = new int[n];
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            ht[i] = sc.nextInt();
        }
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            vis[a - 1] = true;
            vis[b - 1] = true;
            map.putIfAbsent(a, new HashSet<>());
            map.get(a).add(b);
            map.putIfAbsent(b, new HashSet<>());
            map.get(b).add(a);
        }

        for (Integer v : map.keySet()) {
            Set<Integer> l = map.get(v);
            boolean isGood = true;
            for (Integer e : l) {
                if (ht[e - 1] >= ht[v - 1]) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) ans++;
        }

        for (boolean b : vis) {
            if (!b) ans++;
        }
        System.out.println(ans);
    }
}
