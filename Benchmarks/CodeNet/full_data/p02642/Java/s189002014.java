import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] p = new Integer[n];
        int[] count = new int[1000001];
        boolean[] isDiv = new boolean[1000001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            p[i] = num;
            count[num]++;
            for (int j = num * 2; j <= 1000000; j += num) {
                isDiv[j] = true;
            }
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = p[i];

            // 同じ数が2つ以上ある場合
            if (1 < count[num]) {
                continue;
            }

            // 素数の場合
            if (isPrime(num)) {
                result++;
                continue;
            }

            if (!isDiv[num]) {
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
}
