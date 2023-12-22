import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = (int) Math.ceil((double) n / x) * t;

        // 出力
        System.out.println(result);
    }
}
