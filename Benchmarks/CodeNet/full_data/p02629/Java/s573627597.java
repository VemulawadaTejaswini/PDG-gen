import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        long resN = Long.parseLong(sc.next());
        long modN = 0;

        sc.close();
        StringBuilder sb = new StringBuilder();

        while (resN > 0) {
            modN = resN % 26;
            if (modN == 0) {
                modN = 26;
            }
            resN = (resN - modN) / 26;

            sb.insert(0, (char) (96 + modN));
        }
        System.out.println(sb.toString());
    }
}