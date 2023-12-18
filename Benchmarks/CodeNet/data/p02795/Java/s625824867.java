import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int max = Math.max(h, w);
        int result = (int) Math.ceil((double) n / max);

        // 出力
        System.out.println(result);
    }
}
