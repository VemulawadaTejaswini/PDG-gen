public class
Main {
	private int
	run ( int[ ] a )
	{
		int res = a[ 0 ];
		
		for ( int i = 1; i < a.length; ++i )
			a[ i ] = Math.max ( a[ i ], a[ i - 1 ] + a[ i ] );
		
		for ( int i = 1; i < a.length; ++i )
			res = Math.max ( res, a[ i ] );
		
		return ( res );
	}
	
	public static void
	main ( String[ ] args )
	{
		java.util.Scanner sc = new java.util.Scanner ( System.in );

		for ( ; ; )
		{
			final int n = sc.nextInt ( );
			int[ ] a;
			
			if ( n == 0 )
				break ;
			a = new int[ n ];
			for ( int i = 0; i < a.length; ++i )
				a[ i ] = sc.nextInt ( );
			System.out.println ( ( new Main ( ) ).run ( a ) );
		}
		sc.close ( );
	}
}