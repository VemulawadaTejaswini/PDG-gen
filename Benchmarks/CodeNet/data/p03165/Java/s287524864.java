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
static Map< String, StringBuilder > cache = new HashMap<>();
static final StringBuilder nullBuilder = new StringBuilder();

public static void main( String[] args ) throws Exception
{
	final BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
	s = reader.readLine().toCharArray();
	t = reader.readLine().toCharArray();

	for( int i = 0; i < s.length; ++i )
	{
		for( int j = 0; j < t.length; ++j )
		{
			search( i, j );
		}
	}

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

	for( int j = J; j < t.length; ++j )
	{
		if( s[ I ] == t[ j ] )
		{
			StringBuilder sb = new StringBuilder();
			sb.append( s[ I ] );
			StringBuilder sb2 = search( I + 1, j + 1 );
			if( sb2 != null && sb2 != nullBuilder )
			{
				sb.append( sb2 );
			}
			result = sb;
			break;
		}
	}

	if( result == nullBuilder )
	{
		StringBuilder sb2 = search( I + 1, J );
		if( sb2 != null && sb2 != nullBuilder )
		{
			result = sb2;
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