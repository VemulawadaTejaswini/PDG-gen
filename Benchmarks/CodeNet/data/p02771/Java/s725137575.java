import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 処理
        String out = "No";
        if (a == b && a != c) {
            out = "Yes";
        } else if (b == c && b != a) {
            out = "Yes";
        } else if (a == c && a != b) {
            out = "Yes";
        }

        // 出力
        System.out.println(out);
    }

}