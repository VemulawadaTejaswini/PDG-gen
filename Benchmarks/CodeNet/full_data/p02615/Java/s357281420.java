import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a, Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();
        list.add(a[0]);
        list.add(a[1]);
        int ans = a[0];
        for (int i = 2; i < n; i++) {
            int idx = 0;
            int min = 0;
            for (int j = 0; j < list.size(); j++) {
                if (j == list.size() - 1) {
                    if (min < Math.min(list.get(j), list.get(0))) {
                        min = Math.min(list.get(j), list.get(0));
                        idx = j;
                    }
                } else {
                    if (min < Math.min(list.get(j), list.get(j + 1))) {
                        min = Math.min(list.get(j), list.get(j + 1));
                        idx = j + 1;
                    }
                }
            }
            list.add(idx, a[i]);
            ans += min;
        }
        System.out.println(ans);
    }
}