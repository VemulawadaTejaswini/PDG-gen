import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// 人数Nの入力
        int N = sc.nextInt();

        // 文字列Sの入力
        String S = sc.next();

        // 最小値min
        int min = N;

        // 振り向く人数tmp
        int tmp = 0;

        // リーダーの左右で列を分ける
        String left = "";
        String right = "";

        // ループ
        for (int i = 0; i < S.length(); i++)
        {
            tmp = 0;

            // リーダーで列を分ける
            left = S.substring(0, i);
            right = S.substring(i + 1);

            // leftに含まれるWの数
            tmp += left.length() - left.replace("W", "").length();

            // rightに含まれるEの数
            tmp += right.length() - right.replace("E", "").length();

            // 最小値の更新
            if (tmp <= min)
            {
                min = tmp;
            }
        }

        // 出力
        System.out.println(min);

	}

}
