import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        String out = "AGC";
        if (a < 1200) {
            out = "ABC";
        } else if (a < 2800) {
            out = "ARC";
        }
        // 文字列の入力
        // String s = sc.next();
        // 出力
        System.out.println(out);
    }
}