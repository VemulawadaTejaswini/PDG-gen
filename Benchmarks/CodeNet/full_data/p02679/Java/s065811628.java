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
                map.computeIfAbsent(x, m -> new HashMap<>()).put(y, new int[]{1, 0});
            }
        }
        long l = zero + map.values().stream().flatMap(m -> m.values().stream()).mapToLong(i -> (pow(i[0]) + pow(i[1]) - 1) % 1000000007).reduce(1, (a, b) -> a * b % 1000000007) - 1;
        System.out.println((l + 1000000007) % 1000000007);
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

    static long pow(int i) {
        if (i == 0) {
            return 1;
        } else if ((i & 1) == 1) {
            return pow(i-1) * 2 % 1000000007;
        } else {
            long p = pow(i >> 1);
            return (p * p) % 1000000007;
        }
    }
}
