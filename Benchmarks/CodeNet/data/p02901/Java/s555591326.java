import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, TreeMap<Integer, Integer>> ary = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            for (int j = 0; j < b; j++) {
                int c = Integer.parseInt(sc.next());
                TreeMap<Integer, Integer> map;
                if (ary.containsKey(c - 1)) {
                    map = ary.get(c - 1);
                } else {
                    map = new TreeMap<>();
                }
                map.put(a, i);
                ary.put(i, map);
            }
        }
        Set<Integer> set = new HashSet<>();
        long ans = 0;
        for (TreeMap<Integer, Integer> map: ary.values()) {
            if (!set.contains(map.firstEntry().getValue())) {
                ans += map.firstKey();
                set.add(map.firstEntry().getValue());
            }
        }
            System.out.println(ans);
    }
}