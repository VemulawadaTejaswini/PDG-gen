import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Main {

    public static Long temp2( Long x ){
        if( x <= 2 )return x;
        else return temp( x - 1 , x - 2);
    }

    // f(x) = f(x-1) + f(x-2);
    // f(x) = af(2) + bf(1);
    public static Long temp( Long x , Long y ){
        if( 3 <= x ){
            x = temp( x - 1 , x - 2 );
        }
        if( 3 <= y ){
            y = temp( y - 1 , y - 2 );
        }
        return x + y;
    }

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);

        int[] as = new int[m];
        int broken = -1;
        boolean end = false;
        for( int i = 0 ; i < m ; i++ ){
            as[i] = Integer.parseInt(in.nextLine());
            if( broken == -1 )broken = as[i];
            else if( broken + 1 == as[i] ){
                end = true;
            }
            else {
                broken = as[i];
            }
        }

        if( end ){
            System.out.println(0);
            return;
        }

        Long pattern = new Long(1);
        int start = 0;
        for( int i = 0 ; i < m ; i++ ){
            int step = as[i] - start - 1;
            if( step <= 1 );else pattern *= temp2( new Long( step) );
            start = as[i] + 1;
        }
        int step = n - start;
        pattern *= temp2( new Long( step) );

        System.out.println( pattern % 1000000007);

    }
}