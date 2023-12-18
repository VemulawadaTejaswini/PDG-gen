import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            Integer c = map.getOrDefault(a[i], 0);
            map.put(a[i], ++c);
        }
        Map<Integer, Long> cmap = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            long c = e.getValue() * (e.getValue() - 1) / 2;
            cmap.put(e.getKey(), c);
        }

        long allsum = 0;
        for (Long c : cmap.values()) {
            allsum += c;
        }

        for (int i = 0;i<n;i++) {
            long ans = allsum - cmap.get(a[i]);
            long count = map.get(a[i]) - 1;
            if (count > 0) {
                ans += count * (count - 1) / 2;
            }

            System.out.println((int) ans);
        }
    }
}