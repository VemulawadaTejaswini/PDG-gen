class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		String str = sc.next();
		
		for( int index = str.length()-1 ; index >= 0 ; index-- )
			System.out.print( str.charAt( index ) );
		System.out.println();
	}
}