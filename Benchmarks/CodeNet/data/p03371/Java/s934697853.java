import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 0. すべてAとBを買うときの金額を初期値とする。
            int ans = a * x + b * y;
            // 1. AとBを2xCに交換し、合計金額の減少or増加を確認する
            // このとき、Cは2枚セットで交換する必要があることに注意
            // 1-1. 合計金額が減少する場合は処理を継続
            // 1-2. 合計金額が減少しない場合は処理を終了
            int max = Math.max(x, y);
            for (int i = 0; i < max; i++) {
                int deltaX = Math.min(x, 1);
                int deltaY = Math.min(y, 1);
                int candidate = ans - (a * deltaX + b * deltaY) + 2 * c * Math.max(deltaX, deltaY);
                if (candidate < ans) {
                    ans = candidate;
                    x -= deltaX;
                    y -= deltaY;
                } else {
                    break;
                }
            }

            System.out.println(ans);
        }
    }

}
