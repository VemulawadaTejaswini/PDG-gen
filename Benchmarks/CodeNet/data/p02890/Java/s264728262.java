import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (a.containsKey(tmp)) {
                a.put(tmp, a.get(tmp) + 1);
            } else {
                a.put(tmp, 1);
            }
        }

        // SortedSet<Integer> set = new TreeSet(a.values());
        Set<Integer> keySet = a.keySet();

        System.out.println(n);

        for (int i = 2; i <= n; i++) {
            int ans = n / i;
            SortedSet<Integer> set = new TreeSet(a.values());
            // System.out.println(keySet.size() + " " + i);
            if (keySet.size() < i) {
                System.out.println(0);
                continue;
            }
            // for (; set.size() > 0;) {
            for (int j = 0; j < i; j++) {
                int num = set.last();
                set.remove(num);
                int diff = num - (n + (i - 1)) / i;
                // System.out.println("num:" + num + ", i:" + i + ", diff:" + diff);
                if (diff > 0) {
                    ans -= diff;
                } else {
                    break;
                }
            }
            if (ans < 0) {
                ans = 0;
            }
            System.out.println(ans);
        }

        sc.close();
    }

}
