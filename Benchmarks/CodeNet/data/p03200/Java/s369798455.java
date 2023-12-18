import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int result = 0;
        String stone = s;
        int len = stone.length();
        while (stone.contains("BW")) {
            int count = (len - stone.replace("BW", "").length()) / 2;
            result += count;
            stone = stone.replace("BW", "WB");
        }

        // 出力
        System.out.println(result);
    }
}
