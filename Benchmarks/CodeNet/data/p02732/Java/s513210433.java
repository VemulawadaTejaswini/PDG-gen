import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.keySet().contains(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            int result = 0;
            int m = map.get(a[i]);
            if (map.keySet().contains(a[i])) {
                map.put(a[i], map.get(a[i]) - 1);
            }
            for (int val : map.values()) {
                result += val * (val - 1) / 2;
            }
            System.out.println(result);
            map.put(a[i], m);
        }
        sc.close();
    }
}