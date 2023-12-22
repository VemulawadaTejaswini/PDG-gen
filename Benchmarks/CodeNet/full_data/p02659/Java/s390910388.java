import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        String s = sc.next().replace(".", "");
        long b = Long.parseLong(s);
        sc.close();

        // 主処理
        long result = a * b / 100;

        // 出力
        System.out.println(result);
    }
}
