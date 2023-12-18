import java.io.* ;
import static java.lang.System.* ;
import java.util.Scanner;
public class Main
{
	public static int main ( String [] args )
	{
		String keyin = null ;
		Scanner scanner = new Scanner(System.in);
		keyin = scanner.nextLine ( ) ;
		int A = keyin.nextInt() ;
		int B = keyin.nextInt() ;
		int total = 0 ;

		for ( int i = 0 ; i > 1 ; i ++ )
		{
			if ( A > B )
			{
				total += A ;
			}
			else
			{
				total += B ;
			}
		}

		return total ;
	}
}