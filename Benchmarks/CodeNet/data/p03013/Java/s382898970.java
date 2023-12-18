import java.util.Scanner;

public class Main {

    public static Long[] patterns;

    // f(1) = 1
    // f(2) = 2
    // f(x) = f(x-1) + f(x-2)
    public static Long temp2( long x ){
        if( x <= 2 ) {
            return x;
        }
        return temp( x - 1 , x - 2);
    }

    // f(x) = f(x-1) + f(x-2);
    // f(x) = af(2) + bf(1);
    public static long temp( long x , long y ){
        if( 3 <= x ){
            if( patterns[(int)x] == null ){
                long t = temp( x - 1 , x - 2 );
                patterns[(int)x] = t;
                x = t;
            }
            else {
                x = patterns[(int)x];
            }
        }
        if( 3 <= y ){
            if( patterns[(int)y] == null ){
                long t = temp( y - 1 , y - 2 );
                patterns[(int)y] = t;
                y = t;
            }
            else {
                y = patterns[(int)y];
            }
        }
        return x + y;
    }

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);

        patterns = new Long[ n ];

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

        long pattern = 1;
        int start = 0;
        for( int i = 0 ; i < m ; i++ ){
            int step = as[i] - start - 1;
            if( step > 1 )pattern *= temp2( (long)step );
            start = as[i] + 1;
        }
        int step = n - start;
        pattern *= temp2( (long)step );

        System.out.println( pattern % 1000000007);

    }
}