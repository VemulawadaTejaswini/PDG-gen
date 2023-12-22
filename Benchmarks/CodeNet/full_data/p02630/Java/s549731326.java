import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0;
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            s += a[i];
        }
        int q = sc.nextInt();
        long[] b = new long[q];
        long[] c = new long[q];
        for (int i = 0; i < c.length; i++) {
            b[i] = sc.nextLong();
            c[i] = sc.nextLong();
        }

        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            long v = 1;
            if (map.containsKey(a[i])) {
                v += map.get(a[i]);
            }
            map.put(a[i], v);
        }

        for (int i = 0; i < q; i++) {
            if (map.containsKey(b[i])) {
                s += (c[i] - b[i]) * map.get(b[i]);
                long v = 0;
                if (map.containsKey(c[i])) {
                    v += map.get(c[i]);
                }
                map.put(c[i], map.get(b[i]) + v);
                map.remove(b[i]);
            }
            System.out.println(s);
        }

        sc.close();
    }
}