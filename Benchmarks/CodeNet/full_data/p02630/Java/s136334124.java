import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long,Long> map = new HashMap<>();
        long ans = 0;
        for(int i = 0; i < n; i++) {
            Long key = sc.nextLong();
            ans += key;
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1l);
            }
        }
        int q = sc.nextInt();
        int[] b = new int[q];
        long[] c = new long[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextLong();
        }
        for (int i = 0; i < q; i++) {
            int key = b[i];
            long val = c[i];
            if(map.containsKey((long)key)) {
                long tmp3 = map.get((long)key);
                ans += (val - key) * tmp3;
                if(map.containsKey(val)) {
                    map.put(val, map.get((long)key) + map.get(val));
                } else {
                    map.put(val, map.get((long)key));
                }
                map.remove(key);
            }
            System.out.println(ans);
        }
    }
}