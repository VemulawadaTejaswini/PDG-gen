import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 1;
        for (int i = 1; i <= 961; i++) {
            if (x < i * i) {
                i--;
                result = i * i;
                break;
            }
        }

        // 出力
        System.out.println(result);
    }
}
