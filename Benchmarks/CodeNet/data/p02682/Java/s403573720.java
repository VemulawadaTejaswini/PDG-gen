import java.util.Scanner;

/**
 * B - Easy Linear Programming
 * 1 が書かれたカードが A 枚、0 が書かれたカードが B 枚、−1 が書かれたカードが C 枚あります。
 * これらのカードから、ちょうど K 枚を選んで取るとき、取ったカードに書かれた数の和として、 ありうる値の最大値はいくつですか。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int result = 0;
        if( a <= k ) {
            result += a;
        }

        if( k - a - b  <= k ) {
            result -= k - a - b;
        }

        System.out.println( result );

        sc.close();
    }
}