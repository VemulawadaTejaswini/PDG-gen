import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] cumulativeSum = new long[n];
        HashMap<Long, Long> map = new HashMap<>();
        long ans = 0;
        cumulativeSum[0] = sc.nextInt();
        map.put(cumulativeSum[0], 1L);

        for (int i = 1; i < n; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + sc.nextInt();
            Long v = map.get(cumulativeSum[i]);
            if (v == null) {
                v = 0L;
            }
            map.put(cumulativeSum[i], ++v);
        }
        for (Long key : map.keySet()
             ) {
            Long v = map.get(key);
            if (key == 0) {
                v++;
            }
            if (v == 1) {
                continue;
            }
            ans +=  v * (v - 1) / 2;
        }

        System.out.println(ans);
    }
}