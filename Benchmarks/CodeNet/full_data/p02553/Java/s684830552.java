import java.util.Scanner;

/**
 * B - Product Max
 * 整数 a,b,c,d が与えられます。
 * a≤x≤b,c≤y≤d を満たす整数 x,y について、x×y の最大値はいくつですか。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long[] vals = {a * c, a * d, b * c, b * d};
        long max = vals[0];
        for ( int i = 1; i < vals.length; i++ ) {
            max = Math.max( max, vals[i] );
        }

        System.out.println( max );

        sc.close();
    }
}