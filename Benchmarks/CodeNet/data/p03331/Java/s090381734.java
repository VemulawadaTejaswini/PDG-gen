import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int num1 = i;
            int num2 = n - i;
            int sum = digsum(num1) + digsum(num2);
            min = Math.min(min, sum);
        }

        int result = min;

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
