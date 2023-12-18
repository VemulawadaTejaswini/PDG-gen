
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] a = new long[N];
        Map<Long, Integer> map = new HashMap<>();
        Long val;
        Long firstVal = scanner.nextLong();
        for (int i = 0; i < N - 1; i++) {
            val = scanner.nextLong();
            Integer fuga = map.get(val);
            if (fuga == null) {
                map.put(val, 1);
            } else {
                map.put(val, 1 + fuga);
            }
        }
        boolean findKey = false;
        Long prevVal = 0L;
        Long currVal = 0L;
        for (Long key : map.keySet()) {
            if (map.containsKey(firstVal ^ key)) {
                decMap(map, key);
                prevVal = firstVal;
                currVal = key;

                while (map.containsKey(prevVal ^ currVal)) {
                    decMap(map, prevVal ^ currVal);
                    Long tmp = currVal;
                    currVal = currVal ^ prevVal;
                    prevVal = tmp;
                }
                if (map.size() == 0) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    private void decMap(Map<Long, Integer> map, Long key) {
        Integer val = map.get(key);
        if (val == 1) {
            map.remove(key);
        } else {
            map.put(key, val - 1);
        }
    }
}
