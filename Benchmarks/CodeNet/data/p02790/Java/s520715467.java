import java.util.Scanner;

/**
 * B - Comparing Strings
 * 1 桁の正整数 a ,b が与えられます。
 * 整数 a を b 回繰り返してできる文字列と 整数 b を a 回繰り返してできる文字列のうち、辞書順で小さい方を答えてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 整数
        int a = sc.nextInt();
        int b = sc.nextInt();

        if( a <= b ) {
            String stringA = String.valueOf( a );
            for( int i = 1; i < b; i++ ) {
                stringA += a;
            }
            System.out.println( stringA );
        }
        else {
            String stringB = String.valueOf( b );
            for( int i = 1; i < a; i++ ) {
                stringB += b;
            }
            System.out.println( stringB );
        }

        sc.close();
    }
}