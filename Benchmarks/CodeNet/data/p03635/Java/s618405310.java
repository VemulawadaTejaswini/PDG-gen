import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = (n - 1) * (m - 1);

        // 出力
        System.out.println(result);
    }
}
