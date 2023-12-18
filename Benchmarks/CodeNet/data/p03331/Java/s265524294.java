import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int[] digsum = new int[100001];
        for (int i = 1; i < digsum.length; i++) {
            digsum[i] = digsum(i);
        }

        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= n / 2; i++) {
            int sum = digsum[i] + digsum[n - i];
            result = Math.min(result, sum);
        }

        // 出力
        System.out.println(result);
    }

    public static int digsum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
