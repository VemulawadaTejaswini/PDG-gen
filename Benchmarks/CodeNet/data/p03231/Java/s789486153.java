import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int l = (int) lcm((long) n, (long) m);
        Map<Integer, Character> x = new HashMap<>();
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (!x.containsKey(i * l / n)) {
                x.put(i * l / n, s.charAt(i));
            }
        }

        for (int i = 0; i < m; i++) {
            if (!x.containsKey(i * l / m)) {
                x.put(i * l / m, t.charAt(i));
                continue;
            }
            if (x.get(i * l / m) != t.charAt(i)) {
                ok = false;
                break;
            }
        }
        if (!ok) {
            System.out.println(-1);
            return;
        }
        System.out.println(l);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
