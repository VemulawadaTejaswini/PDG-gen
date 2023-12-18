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
        long result = 1;
        if (n == 1) {
            result = p;
        } else {
            for (int key : primeFactorizationMap.keySet()) {
                if (n <= primeFactorizationMap.get(key)) {
                    result *= Math.pow(key, primeFactorizationMap.get(key) / n);
                }
            }
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
