import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC081C - Not so Diverse

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 1 <= k <= n <= 200000
        int k = sc.nextInt();

        int[] a = new int[n];   // 1 <= a <= n

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        int count = 0;
        if (map.size() > k) {
            for (Object i :map.values().stream().sorted().limit(map.size() - k).toArray()) {
                count += (Integer)i;
            }
        }

        System.out.println(count);
    }
}