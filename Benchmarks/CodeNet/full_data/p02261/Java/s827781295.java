import java.util.Scanner;
class Main
{
	static void Bubble( String B[] )
	{
		for( int i = 0 ; i < B.length ; i++ )
			for( int j = B.length-1 ; i < j ; j-- )
				if( B[j-1].charAt(1) > B[j].charAt(1) )
				{
					String work = B[j-1];
					B[j-1] = B[j];
					B[j] = work;
				}
	}
	static void Selection( String A[] )
	{
		for( int i = 0 ; i < A.length ; i++ )
		{
			int min = i;
			for( int j = i ; j < A.length ; j++ )
				if( A[j].charAt(1) < A[min].charAt(1) )min = j;
			if( min!=i )
			{
				String work = A[i];
				A[i] = A[min];
				A[min] = work;
			}
		}
	}
	static void putArray( String A[] )
	{
		for( int i = 0 ; i < A.length ; i++ )
			if( i==A.length-1 )
				System.out.println( A[i] );
			else
				System.out.print( A[i]+" " );
	}
	static boolean ArrayEquals( String[] A, String B[] )
	{
		for( int i = 0 ; i < A.length ; i++ )
			if( !A[i].equals(B[i]) )return false;
		return true;
	}
	public static void main( String[] args )
	{
		Scanner sc = new java.util.Scanner( System.in );
		
		int n = sc.nextInt();
		String A[] = new String[n], B[] = new String[n];
		for( int i = 0 ; i < n ; i++ )
		{
			A[i]=sc.next();
			B[i] = A[i];
		}
		Bubble( A );
		putArray( A );
		System.out.println("Stable");
		Selection( B );
		putArray( B );
		System.out.println( ArrayEquals(A,B)? "Stable" : "Not stable" );
	}
}