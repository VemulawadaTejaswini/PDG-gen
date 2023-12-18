import java.util.*;
import java.io.*;

/*
 * F - LCS
 */
public class Main
{
static char[] s;
static char[] t;
static String answer = "";
static Map< String, StringBuilder > cache = new HashMap<>(10000);
static final StringBuilder nullBuilder = new StringBuilder();

public static void main( String[] args ) throws Exception
{
	final BufferedReader reader = new BufferedReader( new InputStreamReader(  System.in ) );
	s = reader.readLine().toCharArray();
	t = reader.readLine().toCharArray();

	search( 0, 0 );

	p( answer );
}

public static StringBuilder search( int I, int J )
{
	if( I == s.length || J == t.length )
	{
		return null;
	}

	final StringBuilder cached = cache.get( I + ":" + J );
	if( cached != null )
	{
		return cached;
	}

	StringBuilder result = nullBuilder;
	for( int i = I; i < s.length && s.length - i > result.length(); ++i )
	{
		for( int j = J; j < t.length && t.length - j > result.length(); ++j )
		{
			if( s[ i ] == t[ j ] )
			{
				StringBuilder sb = new StringBuilder();
				sb.append( s[ i ] );
				StringBuilder sb2 = search( i + 1, j + 1 );
				if( sb2 != null && sb2 != nullBuilder )
				{
					sb.append( sb2 );
				}
				if( sb.length() > result.length() )
				{
					result = sb;
				}
			}
		}
	}

	//cache
	cache.put( I + ":" + J, result );

	//result
	if( result.length() > answer.length() )
	{
		answer = result.toString();
	}

	return result;
}

public static void p( Object o )
{
	System.out.println( o );
}

}