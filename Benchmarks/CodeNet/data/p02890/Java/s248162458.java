
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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

        System.out.println(n);

        for (int i = 2; i <= n; i++) {
            int ans = n / i;
            SortedSet<Integer> set = new TreeSet(a.values());
            for (; set.size() > 0;) {
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
