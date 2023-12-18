import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.compute(scanner.nextInt(), (key, value) -> value == null ? 1 : value + 1);
        }
        System.out.println(f(map) ? "Yes" : "No");
    }

    static boolean f(Map<Integer, Integer> map) {
        if (map.size() != 3) {
            return false;
        } else {
            int count = -1;
            int xor = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (count == -1) {
                    count = entry.getValue();
                } else if (count != entry.getValue()) {
                    return false;
                }
                xor ^= entry.getKey();
            }
            return xor == 0;
        }
    }
}