import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by zzt on 17-2-18.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        Map<Long, Long> pair = new HashMap<>();
        Map<Long, Long> count = new HashMap<>();
        Map<Long, Long> dif = new HashMap<>();
        long curMax = 0;
        long cur;
        for (long i = 0; i < n; i++) {
            cur = Integer.parseInt(st.nextToken());
            if (cur > curMax) {
                pair.put(i, cur);
                dif.put(cur, cur - curMax);
                curMax = cur;
            }
            count.computeIfAbsent(cur, key -> 0L);
            count.computeIfPresent(cur, (key, oldValue) -> oldValue + 1);
            for (Map.Entry<Long, Long> entry :
                    count.entrySet()) {
                if (entry.getKey() < cur)
                    count.put(entry.getKey(), entry.getValue() + 1);
            }
        }
        for (long i = 1; i <= n; i++) {
            System.out.println(count.computeIfAbsent(pair.computeIfAbsent(i, integer -> 0L), integer -> 0L) * dif.computeIfAbsent(i, integer -> 0L));
        }
    }
}