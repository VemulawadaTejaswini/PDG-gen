import java.util.*;

public class 173_A_1 {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // 主処理
        while (0 < n) {
            n -= 1000;
        }
        int result = Math.abs(n);

        // 出力
        System.out.println(result);
    }
}
