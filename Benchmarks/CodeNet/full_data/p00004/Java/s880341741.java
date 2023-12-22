class Main
{
	public static void main( String[] args )
	{
		double x = 0, y = 0;
		
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		x = (double)( c*e - b*f ) / ( a*e - b*d )+0.0001;
		y = (double)( a*f - c*d ) / ( a*e - b*d )+0.0001;
		
		System.out.printf( "%.3f %.3f \n" , x, y );
	}
}