
class Main
{
	public static void main(String[] av)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int [] vec = new int[10];
		int j = 0;
		while( sc.hasNextInt() && j < 10 )
		{
			vec[j++] = ( sc.nextInt() );	
		}
		java.util.Arrays.sort( vec );
		for ( int i = 0; i < 3; ++i )
		{
			System.out.println( vec[9-i] );
		}
	}
}