import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long p = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        Map<Integer, Integer> primeFactorizationMap = primeFactorizationMap(p);
        Map<Long, Long> maxDivMap = new HashMap<>();
        for (int num : primeFactorizationMap.keySet()) {
            int count = primeFactorizationMap.get(num);
            for (long i = 1; i <= count; i++) {
                if (maxDivMap.containsKey(i)) {
                    maxDivMap.put(i, maxDivMap.get(i) * num);
                } else {
                    maxDivMap.put(i, (long) num);
                }
            }
        }
        for (int num : primeFactorizationMap.keySet()) {
            for (int i = 1; i <= maxDivMap.size(); i++) {
                int remainCount = primeFactorizationMap.get(num) - i;
                for (int j = 0; j < remainCount; j++) {
                    if (p % Math.pow(maxDivMap.get((long) i) * num, i) == 0) {
                        maxDivMap.put((long) i, maxDivMap.get((long) i) * num);
                    }
                }
            }
        }

        Long result;
        if (!maxDivMap.containsKey(n)) {
            result = 1L;
        } else {
            result = maxDivMap.get(n);
        }

        // 出力
        System.out.println(result);
    }

    public static Map<Integer, Integer> primeFactorizationMap(long num) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = (int) Math.sqrt(num);
        int div = 2;
        while (div <= max) {
            if (num % div == 0) {
                num /= div;
                if (map.containsKey(div)) {
                    map.put(div, map.get(div) + 1);
                } else {
                    map.put(div, 1);
                }
            } else {
                div++;
            }
        }
        if (num != 1) {
            map.put((int) num, 1);
        }
        return map;
    }
}
