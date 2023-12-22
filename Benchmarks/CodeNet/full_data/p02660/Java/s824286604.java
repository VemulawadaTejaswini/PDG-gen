import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        if (n != 1) {
            List<Long> list = primeFactorization(n);
            Map<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < list.size(); i++) {
                long num = list.get(i);
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }

            int[] count = new int[40];
            for (int i = 1; i < count.length; i++) {
                count[i] = count[i - 1] + i;
            }

            for (Long key : map.keySet()) {
                int val = map.get(key);
                for (int i = 0; i < count.length; i++) {
                    if (val < count[i]) {
                        result += i - 1;
                        break;
                    }
                }
            }
        }

        // 出力
        System.out.println(result);

    }

    public static List<Long> primeFactorization(long num) {
        List<Long> list = new ArrayList<>();
        long div = 2;
        while (!isPrime(num)) {
            if (num % div == 0) {
                num /= div;
                list.add(div);
            } else {
                div++;
            }
        }
        list.add(num);
        return list;
    }

    public static boolean isPrime(long num) {
        if (num == 2) {
            return true;
        } else if (num < 2 || num % 2 == 0) {
            return false;
        }
        double sqrtNum = Math.sqrt(num);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
