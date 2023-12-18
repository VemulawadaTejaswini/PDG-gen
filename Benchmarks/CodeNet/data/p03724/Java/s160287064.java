import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(n)) {
                continue;
            }
            if (map.get(i) % 2 != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
