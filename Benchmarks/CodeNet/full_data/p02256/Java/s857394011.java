import java.util.Scanner;
class Main
{
	static int gcd( int a, int b )
	{
		if( a%b==0 )return b;
		return gcd( b, a%b );
	}
	public static void main( String[] args )
	{
		Scanner sc = new java.util.Scanner( System.in );
		
		System.out.println( gcd(sc.nextInt(),sc.nextInt()) );
		
		return;
	}
}