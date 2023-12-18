import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer>map = new HashMap<>();
        for (int i = 0 ; i < 6 ;i++) {
            int n = sc.nextInt();
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }

        }

        int mm = map.size();
        int c = 0;
        for (Entry entry :map.entrySet()) {
            c = Math.max(c, (int) entry.getValue());
        }
        if (mm == 4 && c == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
