import java.util.Scanner;

/**
 * シカのAtCoDeerくんは二つの正整数a,bを見つけました。
 * aとbの積が偶数か奇数か判定してください。
 *
 * 1≤a,b≤10000 a,bは整数
 *
 * #input
 * 入力は以下の形式で標準入力から与えられる。
 * a b
 *
 * #output
 * 積が奇数なら Odd と、 偶数なら Even と出力せよ。
 */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String result = (((a * b) % 2) == 0) ? "Even" : "Odd";
        System.out.print(result);
    }
}