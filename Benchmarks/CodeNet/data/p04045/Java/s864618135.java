import java.util.Scanner;

public class Main
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner ( System.in );
		String n = sc.next ();
		int k = sc.nextInt ();
		boolean[] d = new boolean[ 10 ];
		int[] like = new int[ 10 - k ];
		int count = 0;
		for ( int i = 0; i < k; i++ )
		{
			d[ sc.nextInt () ] = true;
		}
		for ( int i = 0; i < 10 && count < like.length; i++ )
		{
			if ( !d[ i ] )
			{
				like[ count ] = i;
				count++;
			}
		}

		new Main ().run ( n , like );
	}

	public void run ( String n , int[] like )
	{
		String result = "";
		int i = 0;
		int c = 0;

		while ( i < like.length && result.length () < n.length () )
		{
			if ( like[ i ] > ( n.charAt ( c ) - '0' ) )
			{
				c++;
				result = result + like[ i ];
				for ( int j = 0; j < n.length () - c; j++ )
				{
					result = result + like[ 0 ];
				}
				System.out.println ( result );
				return;
			}
			else if ( like[ i ] == ( n.charAt ( c ) - '0' ) )
			{
				c++;
				result = result + like[ i ];
				i = 0;
			}
			else
			{
				i++;
			}
		}

		System.out.println ( result );
	}

}
