import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Map<Long, Map<Long, int[]>> map = new HashMap<>();
        map.put(0L, new HashMap<>());
        map.get(0L).put(0L, new int[2]);
        int zero = 0;
        for (int i = 0; i < N; i++) {
            long x = in.nextLong();
            long y = in.nextLong();
            long gcd = gcd(x, y);
            if (gcd > 1) {
                x /= gcd;
                y /= gcd;
            }

            if (x == 0 && y == 0) {
                zero++;
            } else if (x == 0) {
                map.get(0L).get(0L)[0]++;
            } else if (y == 0) {
                map.get(0L).get(0L)[1]++;
            } else if (map.containsKey(y) && map.get(y).containsKey(-x)) {
                map.get(y).get(-x)[1]++;
            } else if (map.containsKey(-y) && map.get(-y).containsKey(x)) {
                map.get(-y).get(x)[1]++;
            } else if (map.containsKey(x) && map.get(x).containsKey(y)) {
                map.get(x).get(y)[0]++;
            } else if (map.containsKey(-x) && map.get(-x).containsKey(-y)) {
                map.get(-x).get(-y)[0]++;
            } else {
                map.computeIfAbsent(x, m -> new HashMap<>()).put(y, new int[]{1, 0});
            }
        }
        System.out.println(zero + map.values().stream().flatMap(m -> m.values().stream()).mapToInt(i -> (1 << i[0]) + (1 << i[1]) - 1).reduce(1, (a, b) -> a * b % 1000000007) - 1);
    }

    static long gcd(long x, long y) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (x == 0 || y == 0) return 0;
        if (x % y == 0) return y;
        if (y % x == 0) return x;
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }
}
