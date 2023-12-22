import java.util.Scanner;

/**
 * B - Easy Linear Programming
 * 1 が書かれたカードが A 枚、0 が書かれたカードが B 枚、−1 が書かれたカードが C 枚あります。
 * これらのカードから、ちょうど K 枚を選んで取るとき、取ったカードに書かれた数の和として、 ありうる値の最大値はいくつですか。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long result = 0;


        if( k <= a ) {
            result = k;
        }
        else if( k <= a + b ) {
            result = a;
        }
        else if( k <= a + b + c ) {
            result = a - ( k - a - b );
        }

        System.out.println( result );

        sc.close();
    }
}
