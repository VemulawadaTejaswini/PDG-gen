class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		while( sc.hasNext() )
		{
			int a,b;
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			int c = a+b;
			
			int d = 0;
			while( c != 0 ){
				d++;
				c = c/10;
			}
			
			System.out.println( d );
		}
	}
}