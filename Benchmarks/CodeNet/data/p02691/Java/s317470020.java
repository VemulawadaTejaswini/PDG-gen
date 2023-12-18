import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a[i] = temp;
        }
        Map<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            map.merge(i + a[i], 1, Integer::sum);
            if (map.containsKey(i - a[i])) {
                ans += map.get(i - a[i]);
            }
        }
        System.out.println(ans);
    }
}