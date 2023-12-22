class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		int max = 0, n = sc.nextInt();
		int[] data = new int[n];
		for( int i = 0 ; i < n ; i++ )
		{
			data[i] = sc.nextInt();
		}
		for( int ct = 0 ; ct < n-1 ; ct++ ){
			for( int i = ct+1 ; i < n ; i++ ){
				if( max < data[i]-data[ct] )max = data[i]-data[ct];
			}
		}
		System.out.printf( "%d\n" , max );
	}
}