import java.util.Scanner;

/**
 * B - Uneven Numbers
 * 整数 N が与えられます。
 * N 以下の正の整数のうち、(先頭に 0 をつけずに十進法で表記したときの) 桁数が奇数であるようなものの個数を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 確認する数値
        int n = sc.nextInt();
        int result = 0;

        for( int i = 1; i <= n; i++ ) {
            if( String.valueOf( i ).length() % 2 != 0 ) {
                result++;
            }
        }

        System.out.println( result );

        sc.close();
    }
}