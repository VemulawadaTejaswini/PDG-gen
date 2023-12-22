import java.util.Scanner;

/**
 * 問題B<BR>
 * 部分文字列においてDの個数と、
 * PDの個数を総和を最大とする文字列を出力しろ。
 */
public class Main {
    /** D, Pどちらでも良い文字列 */
    private static final char FREE_CHARACTOR = '?';
    /** 文字D */
    private static final char D = 'D';
    /** 文字P */
    private static final char P = 'P';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.next().trim();
        char[] chs = t.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == FREE_CHARACTOR) {
                chs[i] = D;
            }
        }

        System.out.println(new String(chs));
    }
}