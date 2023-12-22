import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = list.get(i);

            // 同じ数が2つ以上ある場合
            if (list.indexOf(num) != list.lastIndexOf(num)) {
                continue;
            }

            // 素数の場合
            if (isPrime(num)) {
                result++;
                continue;
            }

            List<Integer> divList = divList(num);
            boolean isDiv = false;
            for (int div : divList) {
                if (list.contains(div)) {
                    isDiv = true;
                    break;
                }
            }
            if (!isDiv) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
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

    public static List<Integer> divList(int num) {
        Set<Integer> set = new HashSet<>();
        int max = (int) Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                set.add(i);
                set.add(num / i);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
