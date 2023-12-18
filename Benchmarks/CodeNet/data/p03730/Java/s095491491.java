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
        List<Integer> list = new ArrayList<>();
        int num = a;
        int mod = num % b;
        while (!list.contains(mod)) {
            list.add(mod);
            num += a;
            mod = num % b;
        }

        boolean judge = list.contains(c);
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
