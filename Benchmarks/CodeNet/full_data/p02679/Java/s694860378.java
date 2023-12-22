
import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    static int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x%y);
    }

    static long modPow(long x, long mod) {
        if (x == 0) return 1;
        long r = modPow(x / 2, mod);
        long ret = (r * r) % mod;
        if (x % 2 != 0) ret = (ret * 2) % mod;
        return ret;
    }

    static void run() {
        long mod = 1000000007;
        int n = in.nextInt();
        Map<Integer, Map<Integer, Integer>> m = new HashMap<>();
        int ab0 = 0;
        int a0 = 0, b0 = 0;
        for (int i=0;i<n;i++) {
            int a = in.nextInt(), b = in.nextInt();
            if (a == 0 && b == 0) ab0++;
            else if (a == 0) {
                a0++;
            } else if (b == 0) {
                b0++;
            } else {
                int sign = (a >= 0 && b >= 0 || a <= 0 && b <= 0) ? 1 : -1;
                a = Math.abs(a);
                b = Math.abs(b);
                int g = gcd(a, b);
                a /= g; b /= g;
                Map<Integer, Integer> mm = m.computeIfAbsent(sign*a, k->new HashMap<>());
                mm.put(b, mm.getOrDefault(b, 0) + 1);
            }
        }
        Map<Integer, Set<Integer>> used = new HashMap<>();
        long ret = 1;
        ret = (ret * (modPow(a0, mod) + modPow(b0, mod) - 1)) % mod;
        for (int a : m.keySet()) {
            for (int b : m.get(a).keySet()) {
                if (used.containsKey(a) && used.get(a).contains(b)) continue;
                int x = m.get(a).get(b);
                int y = 0;
                int sign = a > 0 ? 1 : -1;
                if (m.containsKey(-sign*b) && m.get(-sign*b).containsKey(sign*a)) {
                    used.computeIfAbsent(-sign*b, k -> new HashSet<>()).add(sign*a);
                    y = m.get(-sign*b).get(sign*a);
                }
                long r = (modPow(x, mod) + modPow(y, mod) - 1) % mod;
                ret = (ret * r) % mod;
            }
        }
        ret--;
        ret += ab0;
        System.out.println(ret);
    }

    public static void main(String[] args) {
        run();
    }
}
