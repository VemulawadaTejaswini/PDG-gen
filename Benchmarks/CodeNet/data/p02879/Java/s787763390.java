
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        sc.close();
        int result = a * b;
        if (a >= 10 || b >= 10) {
            result = -1;
        }

        System.out.println(result);
    }
}
