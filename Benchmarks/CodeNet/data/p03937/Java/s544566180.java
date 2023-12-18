import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String[] a = new String[h];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next();
        }

        // 主処理
        int countSum = 0;
        for (int i = 0; i < h; i++) {
            int count = a[i].length() - a[i].replace("#", "").length();
            countSum += count;
        }
        boolean judge = countSum == w + h - 1;
        String result = judge ? "Possible" : "Impossible";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
