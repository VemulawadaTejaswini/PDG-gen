import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            Boolean b = map.getOrDefault(a, false);
            if (b) {
                b = false;
            } else {
                b = true;
            }
            map.put(a, b);
        }

        System.out.println(map.values().stream().filter(b -> b).count());
    }
}
