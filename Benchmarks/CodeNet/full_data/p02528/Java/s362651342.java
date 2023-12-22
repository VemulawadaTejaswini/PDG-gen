public class
Main {
	private void
	sort ( int[ ] a, int n )
	{
		
	}
	
	public static void
	main ( String[ ] args )
	{
		java.util.Scanner sc = new java.util.Scanner ( System.in );
		int[ ] a;

		a = new int[ sc.nextInt ( ) ];
		for ( int i = 0; i < a.length; ++i )
			a[ i ] = sc.nextInt ( );
		sc.close ( );
		
		( new Main ( ) ).sort ( a, a.length );
		for ( int i = 0; i < a.length; ++i )
			System.out.print ( ( i == 0 ? "" : " " ) + a[ i ] );
		System.out.println ( );
	}
}