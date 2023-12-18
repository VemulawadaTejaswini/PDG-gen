import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            int count = map.getOrDefault(key, 0 );
            map.put(key, value + count);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (k > e.getValue()) {
                k -= e.getValue();
            } else {
                System.out.println(e.getKey());
                return;
            }
        }
    }
}