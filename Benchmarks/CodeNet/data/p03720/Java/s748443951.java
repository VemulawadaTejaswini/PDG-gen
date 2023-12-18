import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        int road = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < road; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (map.containsKey(a)) {
                int mapval = map.get(a);
                map.put(a, mapval + 1);
            } else {
                map.put(a, 1);
            }
            if (map.containsKey(b)) {
                int mapval = map.get(b);
                map.put(b, mapval + 1);
            } else {
                map.put(b, 1);
            }
        }
        for (int tmp : map.values()) {
            System.out.println(tmp);
        }
    }
}
