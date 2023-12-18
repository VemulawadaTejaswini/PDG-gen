import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int max = Math.max(Math.max(a, b), c);
        int tri = max * 3;
        int sum = a + b + c;
        int diff = tri - sum;
        boolean isOdd = diff % 2 == 1;
        int result = isOdd ? diff / 2 + 2 : diff / 2;

        // 出力
        System.out.println(result);
    }
}
