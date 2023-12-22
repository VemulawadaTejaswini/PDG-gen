import java.util.Scanner;
class Main
{
	static int counter = 0;
	static void shell( int A[] )
	{
		int G[] = {0,1,4,13,40,121,364,1093,3280,9841,29524,88573,265720}, i;
		for( i = 1 ; G[i] <= A.length ; i++ );
		
		System.out.println(--i);
		for(  ; 1 <= i ; i-- )
		{
			insertion( A, G[i] );
			if( i==1 )
				System.out.println(G[i]);
			else
				System.out.print(G[i]+" ");
		}
		System.out.println(counter);
	}
	static void insertion( int A[], int g )
	{
		int j;
		for( int i = g ; i < A.length ; i++ )
		{
			int v = A[i];
			for( j = i-g ; 0<=j && v<A[j] ; j-=g )
			{
				counter++;
				A[j+g] = A[j];
			}
			A[j+g] = v;
		}
	}
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		
		int n = sc.nextInt();
		int A[] = new int[n];
		for( int i = 0 ; i < n ; i++ )
			A[i] = sc.nextInt();
		shell( A );
		for( int i = 0 ; i < n ; i++ )
			System.out.println( A[i] );
	}
}