import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (n == 1) {
            System.out.println(1);
            return;
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            list.add(a);
            set3.add(a);
            list2.add(getDivisor(a));
            if (!set.contains(a)) {
                set.add(a);
            } else {
                set2.add(a);
            }
        }
        Collections.sort(list);
        boolean isFirst = true;
        int ans = 0;
        f : for (int i = 0; i < list2.size(); i++) {
            List<Integer> temp = list2.get(i);
            for (int j = 0; j < temp.size(); j++) {
                if (set3.contains(temp.get(j))) {
                    continue f;
                }
            }
            if (!set2.contains(list.get(i))) {
                ans++;
            }
//            int a = list.get(i);
//            if (set2.contains(a)) {
//                if (isFirst) {
//                    isFirst = false;
//                }
//                continue;
//            }
//            if (isFirst) {
//                ans++;
//            }
//            if (i == list.size() - 1) {
//                ans++;
//            } else {
//                for (int j = i + 1; j < list.size(); j++) {
//                    if (list.get(j) % a == 0) {
//                        set2.add(list.get(j));
//                    }
//                }
//                if (!isFirst) {
//                    ans++;
//                } else {
//                    isFirst = false;
//                }
//            }
        }
        System.out.println(ans);
    }

    private static List<Integer> getDivisor(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
}