import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        sc.close();

        // 主処理
        final int LON_A = a.length();
        final int LON_B = b.length();
        final int LON_C = c.length();

        int ia = -1;
        int ib = 0;
        int ic = 0;

        char turn = 'a';
        while (ia < LON_A && ib < LON_B && ic < LON_C) {
            if (turn == 'a') {
                ia++;
                if (ia < LON_A) {
                    turn = a.charAt(ia);
                } else {
                    break;
                }
            } else if (turn == 'b') {
                ib++;
                if (ib < LON_B) {
                    turn = b.charAt(ib);
                } else {
                    break;
                }
            } else if (turn == 'c') {
                ic++;
                if (ic < LON_C) {
                    turn = c.charAt(ic);
                } else {
                    break;
                }
            }
        }

        String result = String.valueOf(turn).toUpperCase();

        // 出力
        System.out.println(result);
    }
}
