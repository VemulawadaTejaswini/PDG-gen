import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.LongConsumer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a);

        Map<Long, Integer> map = new HashMap<>();
        for (Long l : a) map.put(l, map.getOrDefault(l, 0) + 1);

        long ans = 0;
        LongConsumer mapDec = l -> map.put(l, map.get(l) - 1);
        for (int i = n - 1; i >= 0; i--) {
            if (map.get(a[i]) == 0) continue;
            mapDec.accept(a[i]);
            long diff = 2 * Long.highestOneBit(a[i]) - a[i];
            if (map.containsKey(diff) && map.get(diff) > 0) {
                ans++;
                mapDec.accept(diff);
            }
        }
        System.out.println(ans);
    }
}