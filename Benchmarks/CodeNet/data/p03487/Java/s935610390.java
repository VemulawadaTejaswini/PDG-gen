import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        Map<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            long in = Long.parseLong(sc.next());
            if (map.containsKey(in)) {
                map.put(in, map.get(in) + 1);
            } else {
                map.put(in, 1L);
            }
        }

        long ans = 0;
        for (Entry<Long, Long> ent : map.entrySet()) {
            long y = ent.getKey();
            long x = ent.getValue();
            if (x == y) {
                continue;
            }

            if (x > y) {
                ans += x - y;
            } else {
                ans += x;
            }
        }

        System.out.println(ans);
    }
}
