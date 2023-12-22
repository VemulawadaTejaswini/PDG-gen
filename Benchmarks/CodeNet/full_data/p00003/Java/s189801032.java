class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int n = sc.nextInt();
		while( n != 0 )
		{
			n--;
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if( check( a, b, c ) ){
				System.out.println( "YES" );
			}else{
				System.out.println( "NO" );
			}
		}
	}
	static boolean check( int a, int b, int c )
	{
		if( a*a == b*b + c*c )return true;
		if( b*b == c*c + a*a )return true;
		if( c*c == a*a + b*b )return true;
		
		return false;
	}
}