import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean judge = y % 2 == 0 && y / 4 <= x && x <= y / 2;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
