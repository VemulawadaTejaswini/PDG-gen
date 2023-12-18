import java.io.* ;
import static java.lang.System.* ;
import java.util.Scanner;
public class Main
{

	public static String input ( )
	{
			String keyin = null ;
			Scanner scanner = new Scanner(System.in);
			keyin = scanner.nextLine ( ) ;
			return keyin ;
	}	

	public static int main ( String [] args )
	{
		int A = Integer.parseInt (input ( ) ) ;
		int B = Integer.parseInt (input ( ) ) ;
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