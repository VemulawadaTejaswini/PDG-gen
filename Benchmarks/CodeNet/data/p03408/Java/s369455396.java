import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int m = Integer.parseInt(sc.next());
        for (int i = 0; i < m; i++) {
            String key = sc.next();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) - 1);
            } else {
                map.put(key, -1);
            }
        }

        sc.close();

        int max = 0;
        for (String key : map.keySet()) {
            int num = map.get(key);
            max = Math.max(max, num);
        }
        int result = max;

        // 出力
        System.out.println(result);
    }
}
