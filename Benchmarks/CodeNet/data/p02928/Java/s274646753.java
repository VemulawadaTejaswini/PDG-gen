import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        long count = 0; // 転倒数
        long diff = 0; // 2周目の転倒数の増分
        for (int i = 1; i < n; i++) {
            int num = a[i];
            for (int j = 0; j < i; j++) {
                if (num < a[j]) {
                    count++;
                }
            }
            for (int j = 0; j < n; j++) {
                if (num < a[j]) {
                    diff++;
                }
            }
        }

        final long MOD = 1000000007;
        long base = count * k;
        long diffCount = diff * (sum(k - 1) % MOD);
        long result = (base + diffCount) % MOD;

        // 出力
        System.out.println(result);
    }

    public static long sum(long num) {
        long sum = 0;
        while (0 < num) {
            sum += num;
            num--;
        }
        return sum;
    }
}
