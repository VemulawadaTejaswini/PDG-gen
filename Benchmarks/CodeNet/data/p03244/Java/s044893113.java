import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n / 2; i++) {
            int v = sc.nextInt();
            if (map1.keySet().contains(v)) {
                map1.put(v, map1.get(v) + 1);
            } else {
                map1.put(v, 1);
            }
            v = sc.nextInt();
            if (map2.keySet().contains(v)) {
                map2.put(v, map2.get(v) + 1);
            } else {
                map2.put(v, 1);
            }
        }
        sc.close();

        int max1 = max(map1);
        int sum1 = sum(map1);

        int max2 = max(map2);
        int sum2 = sum(map2);

        int ans = (sum1 - max1) + (sum2 - max2);

        // すべて同じ数字だった場合の例外処理
        if (ans == 0 && map1.keySet().iterator().next() == map2.keySet().iterator().next()) {
            ans = n / 2;
        }
        System.out.println(ans);
    }

    static int max(Map<Integer, Integer> map) {
        return map.values().stream().mapToInt(e -> e).sorted().max().getAsInt();
    }

    static int sum(Map<Integer, Integer> map) {
        return map.values().stream().mapToInt(e -> e).sum();
    }
}
