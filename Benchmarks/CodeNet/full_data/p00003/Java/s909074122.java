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
			
			if( a == b || b == c || c == a ){
				System.out.println( "YES" );
			}else{
				System.out.println( "NO" );
			}
		}
	}
}