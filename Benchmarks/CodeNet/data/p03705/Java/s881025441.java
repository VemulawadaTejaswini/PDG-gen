import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int result = 0;
        if (n == 1) {
            result = a == b ? 1 : 0;
        } else if (a <= b) {
            result = (b - a) * (n - 2) + 1;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}