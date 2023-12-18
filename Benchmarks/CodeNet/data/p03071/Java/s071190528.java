import java.io.* ;
import static java.lang.System.* ;
public class Main
{

	public static String input ( )
	{
		try
		{
			String keyin = null ;
			Scanner scanner = new Scanner(System.in);
			keyin = scanner.readLine ( ) ;
			return keyin ;
		}
		catch ( IOException e )
		{
			throw new InternalError ( e.toString ( ) + "発生のため") ;
		}
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