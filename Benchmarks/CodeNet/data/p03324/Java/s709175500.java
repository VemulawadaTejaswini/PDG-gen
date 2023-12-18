
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int d = sc.nextInt();
        final int n = sc.nextInt();
        sc.close();
        double result = 0;
        if (d == 0) {
            result = n;
        } else {
            if (n == 100) {
                result = 101 * Math.pow(100, d);
            } else {
                result = n * Math.pow(100, d);
            }
        }

        System.out.println((int) result);
    }
}
