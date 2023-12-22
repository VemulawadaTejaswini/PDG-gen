import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        long n = sc.nextInt();
        long k = 1;
        long l = 1;
        for (int i = 0; i < n; i++) {
            l = sc.nextLong();
            if (k == -1) {
                if (l == 0) {
                    k = 0;
                    break;
                } else {
                    continue;
                }
            }
            if (Math.log10(k) + Math.log10(l) > 18 || l * k > 1000000000000000000L) {
                k = -1;
                continue;
            }
            k = l * k;
        }

        sc.close();
        System.out.println(k);
    }
}