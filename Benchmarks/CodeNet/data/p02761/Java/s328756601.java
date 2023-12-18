import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>(m);
        int maxKeta = 0;
        for (int i = 0; i < m; i++) {
            int keta = sc.nextInt();
            int val = sc.nextInt();
            if (map.get(keta) != null && map.get(keta) != val) {
                System.out.println(-1);
                return;
            }
            map.put(keta, val);
            maxKeta = Math.max(maxKeta, keta);
        }
        if (maxKeta != n || map.get(1) == 0) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= maxKeta; i++) {
            int val = map.getOrDefault(i, 0);
            sb.append(val);
        }
        System.out.println(sb.toString());

    }
}