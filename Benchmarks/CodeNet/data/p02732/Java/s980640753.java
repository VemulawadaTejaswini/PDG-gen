import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Long[] list = new Long[N];
        for (int i = 0; i < N; i++) {
            list[i] = scanner.nextLong();
        }
        int total = 0;
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(list[i])) {
                map.replace(list[i], map.get(list[i]), map.get(list[i])+1);
            } else {
                map.put(list[i], 1L);
            }
        }
        for (long key : map.keySet()) {
            long v = map.get(key);
            total += calc(v);
        }
        for (int i = 0; i < N; i++) {
            long v = map.get(list[i]);
            //long v2 = calc(v) - calc(v-1);
            System.out.println(total - (v-1));
        }
    }
    private static long calc(long v) {
        return v * (v-1)/2;
    }
}