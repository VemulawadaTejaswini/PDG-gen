import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        long remain = 0;
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            remain = (remain + a[i]) % m;
            count += map.getOrDefault(remain, 0);
            map.put(remain, map.getOrDefault(remain, 0) + 1);
        }
        System.out.println(count);
        sc.close();
    }
}
