import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int add = a + b;
        int diff = a - b;
        int mult = a * b;
        int result = Math.max(Math.max(add, diff), mult);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
