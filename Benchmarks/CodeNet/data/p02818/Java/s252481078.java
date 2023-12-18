import java.util.Scanner;

/**
 * B - Greedy Takahashi
 * 高橋君は A 枚、青木君は B 枚のクッキーを持っています。
 * 高橋君は以下の行動を K 回繰り返します。
 * ・もし高橋君がクッキーを 1 枚以上持っているなら、高橋君のクッキーを 1 枚食べる。
 * ・そうでなく、もし青木君がクッキーを 1 枚以上持っているなら、青木君のクッキーを 1 枚食べる。
 * ・高橋君も青木君もクッキーを持っていないなら、何もしない。
 * 高橋君と青木君が最終的に持っているクッキーの枚数をそれぞれ求めてください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        long a = sc.nextLong(); // 高橋君が持っているクッキーの枚数
        long b = sc.nextLong(); // 青木君が持っているクッキーの枚数
        long k = sc.nextLong(); // 高橋君が繰り返す数

        if( k <= a ) {
            System.out.println( a - k + " " + b );
        }
        else if( k <= a + b ) {
            System.out.println( "0 " + ( b - ( k - a ) ) );
        }
        else {
            System.out.println( "0 0" );
        }

        sc.close();
    }
}