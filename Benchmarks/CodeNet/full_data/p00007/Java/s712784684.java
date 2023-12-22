class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int n = sc.nextInt();
		
		double money = 100000*(1+0.05*n);
		
		if( n%2 != 0 )money += 5000;
		
		System.out.printf( "%d" ,(int)money );
	}
}