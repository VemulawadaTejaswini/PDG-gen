import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());

        // 主処理
        if (n == 100) {
            n++;
        }
        int result = (int) Math.pow(100, d) * n;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
