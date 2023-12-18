import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int min = a * (n - 1) + b;
        int max = b * (n - 1) + a;
        int result = max - (min - 1); // 重複分の1を補正

        if (n == 1 || a > b) {
            result = 0;
        }

        if (n == 1 && a == b) {
            result = 1;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}