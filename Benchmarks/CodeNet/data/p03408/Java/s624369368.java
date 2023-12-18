import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) - 1);
        }

        int max = 0;
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
            }
        }

        System.out.println(max);
    }
}
