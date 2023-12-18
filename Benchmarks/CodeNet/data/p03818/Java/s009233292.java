import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            int a = sc.nextInt();
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        int count = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value % 2 == 0) {
                count++;
            }
        }

        System.out.println(count % 2 == 0 ? map.size() : map.size() - 1);

    }

}