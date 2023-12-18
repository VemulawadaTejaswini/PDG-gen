import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) - 1);
            } else {
                map.put(s, -1);
            }
        }
        int max = -100;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            max = Math.max(e.getValue(), max);
        }
        System.out.println(max);
    }
}