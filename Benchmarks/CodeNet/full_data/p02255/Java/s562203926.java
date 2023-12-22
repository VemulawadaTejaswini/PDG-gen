import java.util.Scanner;
class Main
{
	static void sort( int A[] )
	{
		putArray(A);
		int v, j;
		for( int i = 1 ; i < A.length ; i++ )
		{
			v = A[i];
			for( j = i-1 ; 0<=j && v<A[j] ; j-- )
				A[j+1] = A[j];
			A[j+1] = v;
			putArray(A);
		}
		return;
	}
	static void putArray( int A[] )
	{
		for( int i = 0 ; i < A.length ; i++ )
		{
			if( i==A.length-1 )
				System.out.print( A[i]+"\n" );
			else
				System.out.print( A[i]+" " );
		}
		return;
	}
	public static void main( String[] args )
	{
		Scanner sc = new java.util.Scanner( System.in );
		int n = sc.nextInt();
		int A[] = new int[n];
		for( int i = 0 ; i < n ; i++ )
			A[i] = sc.nextInt();
		sort( A );
		
		return;
	}
}