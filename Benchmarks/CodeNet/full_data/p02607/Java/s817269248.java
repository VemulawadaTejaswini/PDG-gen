import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int parN = Integer.parseInt(sc.next());
        int result = 0;
        int cur = 0;

        for (int i = 1; i <= parN; i++) {
            cur = Integer.parseInt(sc.next());
            if ((cur * i) % 2 == 1) {
                result++;
            }
        }

        sc.close();

        System.out.println(result);
    }
}