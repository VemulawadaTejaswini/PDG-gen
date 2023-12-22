import java.util.Scanner;

/**
 * C - Sum of product of pairs
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();
        long[] a = new long[n];
        long mod = ( long ) ( Math.pow( 10, 9 ) + 7 );  // 1000000007

        for( int i = 0; i < n; i++ ) {
            a[i] = sc.nextLong();
        }

        long sum = 0;
        for( int i = 0; i < n; i++ ) {
            for( int j = i; j < n; j++ ) {
                if( i == j ) continue;
//                sum += ( a[i] * a[j] ) % mod;
                sum += a[i] * a[j];
//                System.out.println( a[i] *  a[j] );
//                System.out.println( ( a[i] * a[j] ) % mod );
            }
        }

        System.out.println( sum % mod );

        sc.close();
    }
}