import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> h = new ArrayList<>();
        long sub = 1000;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            h.add(x);
            sub = Math.min(sub, x);
        }

        List<Long> k = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long x = h.get(i) - sub;
            k.add(x);
        }

        long ans = sub;
        long max = k.get(0);
        long min = 1000;
        boolean ok = false;
        for (int i = 1; i < n; i++) {
            if (k.get(i) <= 0 || i == n - 1) {
                ans += max;
                max = 0;
                if (ok) {
                    ans -= min;
                }
            }
            if (k.get(i - 1) > k.get(i)) {
                ans += max;
                max = 0;
                ok = true;
            }
            max = Math.max(max, k.get(i));
            min = Math.min(min, k.get(i));
            // System.out.println("max = " + max);
        }
        System.out.println(ans);
    }
}
