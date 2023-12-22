import java.util.Scanner;

/**
 * C - Ubiquity
 * 長さ N の整数の列 A1,A2,…,AN であって以下の条件をすべて満たすものはいくつありますか。
 * 0≤Ai≤9
 * Ai=0 なる i が存在する。
 * Ai=9 なる i が存在する。
 * ただし、答えはとても大きくなる可能性があるので、10 9乗+7 で割った余りを出力してください。
 */
public class Main {
    private static final long MOD  = ( long ) ( Math.pow( 10, 9 ) + 7 );  // 1000000007

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();

        if( 1 < n ) {
//            double pow10 = Math.pow( 10, n );
//            double pow9 = Math.pow( 9, n );
//            double pow8 = Math.pow( 8, n );
//
//            long result = (long) ( pow10 - pow9 - pow9 + pow8 );
//            result %= MOD;

            long result = powmod( 10, n ) - powmod( 9, n ) - powmod( 9, n ) + powmod( 8, n );
            result %= MOD;
            result = ( result + MOD) % MOD;

            System.out.println( result );
        }
        else System.out.println( 0 );

        sc.close();
    }

    private static long powmod( long x, long n ){
        long res = 1;
        for( long i = 0; i < n; i++ ) {
            res = res * x % MOD;
        }
        return res;
    }
}