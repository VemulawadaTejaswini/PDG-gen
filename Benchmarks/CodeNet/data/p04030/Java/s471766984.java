import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // 入力を取得
        Scanner sc = new Scanner(System.in);

        // 人数
        String str = sc.next();

        // スキャナーを閉じる
        sc.close();

        // 合計計算
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            // 文字列を取得
            if ("B".equals(Character.toString((str.charAt(i))))) {
                // 最後の文字を取り除く
                list.remove(list.size() - 1);
            } else {
                // 文字列を追加
                list.add(Character.toString(str.charAt(i)));
            }
        }

        // 文字出力
        String output = "";

        for (String obj : list) {
            output = output.concat(obj);
        }

        System.out.println(output);
    }
}
