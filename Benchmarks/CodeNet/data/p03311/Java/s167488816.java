import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public void run( )
    {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for ( int i = 0; i < n; i++ )
        {
            arr[i] = sc.nextInt() - (i + 1);
        }
        Arrays.sort( arr );
        
        int median = 0;
        if(n % 2 == 0)
        {
            median = ( arr[n / 2 - 1] + arr[n / 2] ) / 2;
        } else
        {
            median = arr[n / 2];
        }
        long ans = 0;
        for ( int a: arr )
        {
            ans += Math.abs( a - median );
        }
        System.out.println( ans );
    }

    public static void main( String[] args )
    {
        new Main( ).run( );
    }
}