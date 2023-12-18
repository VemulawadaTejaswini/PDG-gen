import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        int[] b = new int[n];
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0L) + b[i]);
        }
        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);
        long sum = 0;
        for (Map.Entry<Integer, Long> e : map.entrySet()) {
            sum += e.getValue();
            if (sum >= k) {
                System.out.println(e.getKey());
                return;
            }
        }
    }

}
