import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0L) + b[i]);
        }
        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);
        long ans = 0;
        long sum = 0;
        for (Map.Entry<Long, Long> e : map.entrySet()) {
            sum += e.getValue();
            if (sum >= k) {
                ans = e.getKey();
                break;
            }
        }
        System.out.println(ans);
    }

}
