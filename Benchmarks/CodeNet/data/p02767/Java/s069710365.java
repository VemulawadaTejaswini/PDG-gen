import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer[] x = new Integer[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int sum = 0;
        for (int num : x) {
            sum += num;
        }
        int ave = (int)Math.round((double)sum / n);

        int result = 0;
        for (int num : x) {
            result += Math.pow(num - ave, 2);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
