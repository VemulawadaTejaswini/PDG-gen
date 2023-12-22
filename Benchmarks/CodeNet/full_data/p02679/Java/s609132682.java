import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Map<Long, Map<Long, long[]>> map = new HashMap<>();
        map.put(0L, new HashMap<>());
        map.get(0L).put(0L, new long[2]);
        int zero = 0;
        for (int i = 0; i < N; i++) {
            long x = in.nextLong();
            long y = in.nextLong();
            long gcd = gcd(Math.abs(x), Math.abs(y));
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
                map.computeIfAbsent(x, m -> new HashMap<>()).put(y, new long[]{1, 0});
            }
        }
        System.out.println(zero + map.values().stream().flatMap(m -> m.values().stream()).mapToLong(i -> (1 << i[0]) + (1 << i[1]) - 1).reduce(1, (a, b) -> a * b % 1000000007) - 1);
    }

    static long gcd(long x, long y) {
        if (x == 0) return y;
        if (y == 0) return x;

        if ((x & 1) == 0 && (y & 1) == 0) {
            return gcd(x >> 1, y >> 1) << 1;
        } else if ((x & 1) == 0) {
            return gcd(x >> 1, y);
        } else if ((y & 1) == 0) {
            return gcd(x, y >> 1);
        } else {
            return gcd(Math.abs(x - y), Math.min(x, y));
        }
    }
}
