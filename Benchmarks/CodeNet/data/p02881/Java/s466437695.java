import java.util.Scanner;

/**
 * C - Walk on Multiplication Table
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 移動したいマスの数字
        long n = sc.nextLong();
//        int n = sc.nextInt();

        // 結果：回数
        long count = 0;

        // 素数か
        boolean isPrimeNum = false;

        // 素数かのチェック
        if (n < 2) isPrimeNum = false;
        else if (n == 2) isPrimeNum = true;
        else if (n % 2 == 0) isPrimeNum = false; // 偶数はあらかじめ除く
        else {
            double sqrtNum = Math.sqrt(n);
            for (int i = 3; i <= sqrtNum; i += 2)
            {
                if (n % i == 0)
                {
                    // 素数ではない
                    isPrimeNum = false;
                }
            }
            isPrimeNum = true;
        }

//        // 素数かのチェック
//        for( int i = 2; i < n; i++ ) {
//            if( n % i != 0 ) {
//                isPrimeNum = true;
//                break;
//            }
//        }

        if( isPrimeNum ) {
            count = n - 1;
        }
        else {
            for( int j = 1; j <= n; j++ ) {
                if( n % j == 0 ) {
                    if( j == 1 || count > ( j - 1 ) + ( n / j - 1 ) ) {
                        count = ( j - 1 ) + ( n / j - 1 );
                    }
                }
            }
        }

        System.out.println( count );

        sc.close();
    }
}