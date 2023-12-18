import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int num = x;
        double root = (int) Math.sqrt(num);
        while (num / root != root) {
            num--;
            root = (int) Math.sqrt(num);
        }
        int result = num;

        // 出力
        System.out.println(result);
    }
}
