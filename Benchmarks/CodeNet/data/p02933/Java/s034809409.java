import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // 文字列の入力
        String s = sc.next();
        // 出力
        if (a < 3200) {
            System.out.println("red");
        } else {
            System.out.println(s);

        }
    }
}