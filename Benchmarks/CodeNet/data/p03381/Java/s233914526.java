import java.util.*;

public class Main
{

    public void run( )
    {
        Scanner sc = new Scanner( System.in );

        int n = sc.nextInt( );
        int[] ar = new int[ n ];
        int[] arSort = new int[ n ];
        for ( int i = 0; i < n; i++ )
        {
            ar[ i ] = sc.nextInt( );
            arSort[ i ] = ar[ i ];
        }

        Arrays.sort( arSort );

        int a = arSort[ n / 2 - 1 ];
        int b = arSort[ n / 2 ];

        for ( int i = 0; i < n; i++ )
        {
            if ( ar[ i ] <= a )
            {
                System.out.println( b );
            } else
            {
                System.out.println( a );
            }
        }

    }

    public static void main( String[] args )
    {
        new Main( ).run( );
    }
}