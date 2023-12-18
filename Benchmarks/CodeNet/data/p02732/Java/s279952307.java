
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] list = new Integer[N];
        for (int i = 0; i < N; i++) {
            list[i] = scanner.nextInt();
        }
        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(list[i])) {
                map.replace(list[i], map.get(list[i]), map.get(list[i])+1);
            } else {
                map.put(list[i], 1);
            }
        }
        for (int key : map.keySet()) {
            int v = map.get(key);
            total += v * (v-1)/2;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(total - Math.max(map.get(list[i])-1, 0));
        }
    }
}
