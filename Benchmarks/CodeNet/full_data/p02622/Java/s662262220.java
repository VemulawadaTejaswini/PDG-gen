import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final String varT = sc.next();
        final String varS = sc.next();
        sc.close();

        int Tlen = varT.length();
        int cnt = 0;
        for (int i = 0; i < Tlen; i++) {
            if (varT.charAt(i) != varS.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}