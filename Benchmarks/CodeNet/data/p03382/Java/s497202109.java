
import java.util.*;

public class Main
{

    public void run( )
    {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt( );
        int[] ar = new int[ n ];

        int max = Integer.MIN_VALUE;
        int maxId = -1;
        for ( int i = 0; i < n; i++ )
        {
            ar[ i ] = sc.nextInt( );
            if ( max < ar[ i ] )
            {
                max = ar[ i ];
                maxId = i;
            }
        }

        int opt = Integer.MIN_VALUE;
        int optId = -1;
        for ( int i = 0; i < n; i++ )
        {
            if ( i == maxId ) continue;

            int temp = Math.min( ar[ i ], max - ar[ i ] );
            if ( temp > opt )
            {
                opt = temp;
                optId = i;
            }
        }

        System.out.println( max + " " + ar[ optId ] );
    }

    public static void main( String[] args )
    {
        new Main( ).run( );
    }
}