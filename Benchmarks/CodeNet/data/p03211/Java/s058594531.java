import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main implements Runnable {

    public static void main(String[] args) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler((t, e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        String S = null;
        // 入力
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            S = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int min = 10000; // 与えられた文字列から切り出した3桁の数値と753の差の絶対値の最小値

        for (int i = 0; i < S.length() - 2; i++) {
            // 3文字取り出す
            String temp = S.substring(i, i + 3);
            // 数値にする
            int temp2 = Integer.parseInt(temp);
            // 差の絶対値を取得する
            // 最小値の更新処理
            min = Math.min(min, Math.abs(temp2 - 753));
        }
        // 出力
        System.out.println(min);
    }
}
